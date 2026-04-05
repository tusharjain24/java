# Typecasting in Java

Typecasting refers to converting a variable or object from one data type to another. In Java, this occurs in two main contexts: primitive types and objects.

## Primitive Typecasting

### 1. Implicit Casting (Widening Casting)
Implicit casting is done automatically by the compiler when converting a smaller primitive type to a larger primitive type size, as there is no risk of data loss.
- **Order**: `byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`
- **Example**: Assigning an `int` to a `double`.
  ```java
  int myInt = 9;
  double myDouble = myInt; // Automatically casts to 9.0
  ```

### 2. Explicit Casting (Narrowing Casting)
Explicit casting must be done manually by placing the target type in parentheses in front of the value. This is required when converting a larger type to a smaller type size, because data loss might occur.
- **Order**: `double` -> `float` -> `long` -> `int` -> `char` -> `short` -> `byte`
- **Example**: Assigning a `double` to an `int`.
  ```java
  double myDouble = 9.78d;
  int myInt = (int) myDouble; // Manually casts to 9 (truncates decimal)
  ```

---

## Object Typecasting

Object typecasting is used to cast an object of a class into an object of another class. This involves inheritance (are related by an "is-a" relationship).

### 3. Upcasting (Widening)
Upcasting means casting a child class object to a parent class reference type.
- It is done automatically (implicitly).
- It gives you a generic view of the object: you can only access the generic properties and methods defined in the parent class (or overridden versions).
- **Example**:
  ```java
  // Assuming Dog extends Animal
  Animal a = new Dog(); // Implicit upcasting
  ```

### 4. Downcasting (Narrowing)
Downcasting means casting a parent class reference back to a child class object.
- It must be done explicitly using parentheses, e.g., `(ChildClass)`.
- You must ensure the actual object in memory is genuinely of the child class. Otherwise, Java will throw a `ClassCastException` at runtime.
- It is a good practice to use the `instanceof` operator to safely check the object type before downcasting.
- **Example**:
  ```java
  Animal a = new Dog(); // Upcasted first
  Dog d = (Dog) a;      // Explicit downcasting allows access to Dog-specific methods
  ```
