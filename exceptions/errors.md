# Types of Error
## Compile Time Error
- It is thrown when the code is not able to compile
- These errors are caught by the compiler
- Example: 
    1. Syntax Error
    2. Type Mismatch Error

## Run Time Error
- It is thrown when the code is not able to execute
- These errors are caught by the runtime environment
- Example:
    1. Arithmetic Exception
    2. Null Pointer Exception
    3. Array Index Out Of Bounds Exception

## Logical Error
- Compiler is able to understand the code and it is able to execute the code but it is not able to give the correct output
- These errors are not caught by the compiler or runtime environment
- Example: 

```java
int a = 10;
int b = 20;
System.out.println(a - b);
```