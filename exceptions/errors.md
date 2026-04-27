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
