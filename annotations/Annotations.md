# Annotations in Java

## What are Annotations?
Annotations are a form of metadata that provide supplemental data about a program but are not a direct part of the program's logic itself. They start with an `@` symbol and have no direct effect on the operation of the code they annotate.

## Why do we use them?
Annotations serve several important purposes in Java development:
1. **Information for the Compiler:** Annotations can be used by the compiler to detect errors or suppress warnings (e.g., `@Override` catches typos if you didn't actually override a superclass method, and `@SuppressWarnings` tells the compiler to ignore specific warnings).
2. **Compile-time / Deployment-time Processing:** Build tools or frameworks can process annotation information to automatically generate boilerplate code, configuration files (like XML), or mappings.
3. **Runtime Processing:** Some annotations are kept available at runtime. Frameworks like Spring or Hibernate use Java Reflection to inspect these annotations and dynamically inject dependencies, map database tables, or handle web requests based on them.

## How do we use them?
Annotations can be applied to declarations of classes, fields, methods, parameters, and even other annotations. 

### Example of Built-in Annotation
```java
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override // Tells the compiler we intend to override the superclass method
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
```

---

## Use Case: Custom Validation Annotation

Let's look at a practical use case where we create our own custom annotation to mark certain fields as required and write a processor to validate them at runtime.

### Step 1: Define the Custom Annotation
First, we create the annotation using the `@interface` keyword. We also use "meta-annotations" to define *where* it can be applied and *how long* it should be retained.

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Keep this annotation at runtime so we can inspect it using Reflection
@Retention(RetentionPolicy.RUNTIME) 
// This annotation is only allowed to be placed on fields (variables)
@Target(ElementType.FIELD) 
public @interface Required {
    // You can define elements (properties) here, e.g., String message() default "Field is required";
}
```

### Step 2: Apply the Annotation
Now, let's use our new `@Required` annotation in a simple data model.

```java
class User {
    @Required
    private String username;

    private String bio; // Not annotated, so it's optional

    public User(String username, String bio) {
        this.username = username;
        this.bio = bio;
    }
}
```

### Step 3: Process the Annotation at Runtime
Finally, we write logic that uses Java Reflection to inspect the object, check for the annotation, and perform the validation.

```java
import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        
        // Loop through all fields in the class
        for (Field field : clazz.getDeclaredFields()) {
            // Check if the current field has the @Required annotation
            if (field.isAnnotationPresent(Required.class)) {
                
                field.setAccessible(true); // Allow us to read private fields
                Object value = field.get(obj);
                
                // Perform the validation logic
                if (value == null || value.toString().trim().isEmpty()) {
                    System.out.println("Validation Error: The field '" + field.getName() + "' cannot be empty!");
                }
            }
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        User validUser = new User("alice123", "Hello world!");
        User invalidUser = new User("", "No username provided");

        System.out.println("Validating validUser:");
        validate(validUser); // No output, validation passes

        System.out.println("Validating invalidUser:");
        validate(invalidUser); // Prints validation error
    }
}
```

### Why this is powerful:
By using annotations here, we cleanly separate the **metadata** (defining *what* needs validation using `@Required`) from the **business logic** (the `Validator` class that performs the actual check). This makes the `User` class much cleaner and the validation logic highly reusable across different classes!
