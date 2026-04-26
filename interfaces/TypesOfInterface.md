# Types of Interfaces in Java

In Java, interfaces can be broadly categorized into three types based on the number of abstract methods they contain:

## 1. Normal Interface
A normal interface contains **two or more** abstract methods. This is the traditional way interfaces have been used to define a contract for classes.

**Example:**
```java
interface Vehicle {
    void start();
    void stop();
    void accelerate();
}
```

**Use Case:**
Used when designing a comprehensive contract that requires multiple related behaviors to be implemented by a class. For instance, creating a system with various types of vehicles where every vehicle must guarantee the implementation of `start()`, `stop()`, and `accelerate()` functionalities.

---

## 2. Functional Interface (SAM Interface)
A functional interface contains **exactly one** abstract method. It is also known as a Single Abstract Method (SAM) interface. Introduced in Java 8, they are the foundation for lambda expressions. You can optionally use the `@FunctionalInterface` annotation to let the compiler enforce this rule.

**Example:**
```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

// Can be used with a lambda expression:
// Calculator add = (a, b) -> a + b;
```

**Use Case:**
Used extensively in functional programming to represent a single action or behavior. A very common use case is the `Runnable` interface in multithreading (which only has the `run()` method), or passing behavior as a parameter to methods (e.g., event listeners like `ActionListener`, sorting with `Comparator`).

---

## 3. Marker Interface
A marker interface is an interface that contains **zero** methods or fields. It is completely empty. Its purpose is to "mark" a class to indicate to the compiler or JVM that the objects of the class possess a special property or behavior.

**Example:**
```java
// Custom marker interface example
interface PermissionRequired {
    // Empty
}
```

**Use Case:**
Used to provide metadata or runtime type information about objects. A classic use case is Java's built-in `java.io.Serializable` interface. By implementing `Serializable`, a class simply signals to the JVM that its instances are allowed to be serialized (converted to a byte stream for saving to a file or network transfer). Another common example is the `Cloneable` interface.
