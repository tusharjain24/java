## Types of Error
### Compile Time Error
- It is thrown when the code is not able to compile
- These errors are caught by the compiler
- Example: 
    1. Syntax Error
    2. Type Mismatch Error

### Run Time Error
- It is thrown when the code is not able to execute
- These errors are caught by the runtime environment
- Example:
    1. Arithmetic Exception
    2. Null Pointer Exception
    3. Array Index Out Of Bounds Exception

### Logical Error
- Compiler is able to understand the code and it is able to execute the code but it is not able to give the correct output
- These errors are not caught by the compiler or runtime environment
- Example: 

```java
int a = 10;
int b = 20;
System.out.println(a - b);
```

## Exception
- It is an event which disturbs the normal flow of the program
- When an exception is thrown, the program flow stops
- The stack trace is printed
- It is caught by the runtime environment

## What is Stack Trace
- It is a report of the methods that are currently in the call stack
- It is printed when an exception is thrown
- It shows the sequence of method calls that led to the exception

## Types of Exception
### Checked Exception
- These exceptions are checked by the compiler at compile time
- The programmer is forced to handle them
- Example:
    1. IOException
    2. SQLException
    3. ClassNotFoundException

### Unchecked Exception
- These exceptions are not checked by the compiler at compile time
- The programmer is not forced to handle them
- Example:
    1. Arithmetic Exception
    2. Null Pointer Exception
    3. Array Index Out Of Bounds Exception

## How to Handle Exception
- Using try-catch block
- Using finally block
- Using throws keyword

## Hierarchy of Exceptions and Errors
The root class of the Java Exception Handling hierarchy is `Throwable`, which is a subclass of `Object`.

```text
Object
  └── Throwable
        ├── Error
        │     ├── VirtualMachineError (e.g., OutOfMemoryError, StackOverflowError)
        │     ├── AssertionError
        │     └── LinkageError (e.g., NoClassDefFoundError)
        └── Exception
              ├── RuntimeException (Unchecked Exceptions)
              │     ├── ArithmeticException
              │     ├── NullPointerException
              │     └── IndexOutOfBoundsException
              ├── IOException (Checked Exceptions)
              └── SQLException (Checked Exceptions)
```

## Difference Between Error and Exception

| Feature | Error | Exception |
| :--- | :--- | :--- |
| **Definition** | Serious problems that a reasonable application should not try to catch. | Conditions that a reasonable application might want to catch. |
| **Type** | Unchecked by the compiler. | Can be Checked or Unchecked. |
| **Recoverability** | Irrecoverable. The application usually crashes. | Recoverable by handling them (e.g., using `try-catch`). |
| **Caused by** | The environment in which the application is running (e.g., JVM issues like memory running out). | The application itself or external resources (e.g., bad user input, network failure). |
| **Package** | `java.lang.Error` | `java.lang.Exception` |
| **Examples** | `OutOfMemoryError`, `StackOverflowError` | `NullPointerException`, `IOException` |

## The `throw` and `throws` Keywords

### `throw`
- Used to explicitly throw a single exception from within a method or block of code.
- It is followed by an instance of `Exception` (or its subclasses).
- Used generally for throwing custom exceptions or re-throwing exceptions based on custom conditions.

### `throws`
- Used in a method signature to declare that the method might throw one or more exceptions.
- It delegates the responsibility of handling the exception to the caller method (warning them to use a `try-catch` block).
- Typically used with Checked Exceptions, as Unchecked Exceptions don't mandate explicit declaration.

**Example:**
```java
public void validateAge(int age) throws Exception { // 'throws' declares the exception
    if(age < 18) {
        throw new Exception("Age is not valid!"); // 'throw' actually triggers it
    }
}
```

## Custom Exceptions
- We can create our own exception classes by extending the `Exception` class (for Checked Exceptions) or the `RuntimeException` class (for Unchecked Exceptions).
- This is extremely useful when the built-in exceptions in Java do not accurately describe a domain-specific problem in our application.

**Example:**
```java
// 1. Create the Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // Pass message to parent Exception class
    }
}

// 2. Use it in our code
public void checkAge(int age) throws InvalidAgeException {
    if (age < 18) {
        throw new InvalidAgeException("Not eligible to vote.");
    }
}
```
