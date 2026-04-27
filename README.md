# Java Learning Journey

Welcome to the **Java Learning Repository**! This repository is designed as a structured path to mastering Java, from fundamental concepts to advanced Object-Oriented Programming (OOP) and Data Structures. 

Whether you are a beginner picking up Java for the first time or someone looking to brush up on specific concepts (like Typecasting, Memory Management, or Access Modifiers), you'll find categorized, easy-to-read code and documentation here.

---

## Quick Start (How to run the code)

### Prerequisites
- **Java Development Kit (JDK):** Ensure you have Java installed on your machine. You can verify this by running:
  ```bash
  java -version
  javac -version
  ```

### Running the Programs locally
Each code file is a standalone concept or module. To run a specific Java file from your terminal, compile it first using `javac` and execute it using `java`:

```bash
# Example: Running the Hello World program
cd helloworld
javac Hello.java
java Hello
```
*Note: If the class is inside a package (like in the OOP examples), you will need to compile and run it from the root directory.*

---

## 📚 Documentation (Markdown Files)
Throughout this repository, we have created various Markdown (`.md`) files that explain core Java concepts. Be sure to read them as you progress to get a strong theoretical foundation:
- [`JDK.md`](objectorientedprogramming/JDK.md): Overview of Java Development Kit and how Java works.
- [`java-naming-convention.md`](java-naming-convention.md): Best practices for naming classes, methods, and variables.
- [`Typecasting.md`](typecasting/Typecasting.md): Explains implicit, explicit, upcasting, and downcasting.
- [`ClassAndObjects.md`](objectorientedprogramming/ClassAndObjects.md): Theory of classes and objects in Object-Oriented Programming.
- [`access-modifiers.md`](accessmodifiers/access-modifiers.md): Detailed explanation of `public`, `private`, `protected`, and default modifiers.
- [`polymorphism.md`](objectorientedprogramming/polymorphism.md): Concept of polymorphism and dynamic method dispatch.
- [`errors.md`](exceptions/errors.md): Explanation of compile-time, run-time, and logical errors in Java.
- [`AbstractClass.md`](abstractclass/AbstractClass.md): Introduction to abstract classes and abstract methods.
- [`TypesOfInterface.md`](interfaces/TypesOfInterface.md): Categorization of interfaces into Normal, Functional, and Marker.
- [`Annotations.md`](annotations/Annotations.md): Explanation of annotations, their purposes, and how to create custom ones.

---

## 🛤️ Recommended Learning Path
Follow this numbered sequence to explore the repository in a logical, step-by-step order:

### 1. Setup and Basics
1. Read [`objectorientedprogramming/JDK.md`](objectorientedprogramming/JDK.md) to understand the Java environment.
2. Read [`java-naming-convention.md`](java-naming-convention.md) for syntax and naming best practices.
3. Explore [`helloworld/Hello.java`](helloworld/Hello.java) for your first Java "Hello World" program.

### 2. Variables & Data Types
4. Explore [`variables/Variables.java`](variables/Variables.java) to understand how data is stored.

### 3. Operators
5. [`maths/Arithmetic.java`](maths/Arithmetic.java)
6. [`maths/NumberOperations.java`](maths/NumberOperations.java)
7. [`maths/RelationalOperators.java`](maths/RelationalOperators.java)
8. [`maths/LogicalOperators.java`](maths/LogicalOperators.java)

### 4. Typecasting
9. Read [`typecasting/Typecasting.md`](typecasting/Typecasting.md) to grasp type conversion concepts.
10. Review [`typecasting/typecasting.java`](typecasting/typecasting.java) for code examples of explicit, implicit, upcasting, and downcasting.

### 5. Control Flow (Conditional Statements)
11. [`conditionalstatements/IfElse.java`](conditionalstatements/IfElse.java)
12. [`conditionalstatements/SwitchCase.java`](conditionalstatements/SwitchCase.java)

### 6. Loops
13. [`loops/ForLoop.java`](loops/ForLoop.java)
14. [`loops/DoWhile.java`](loops/DoWhile.java)

### 7. Arrays
15. [`arrays/ArrayDemo.java`](arrays/ArrayDemo.java)
16. [`arrays/MultiDimensionalArray.java`](arrays/MultiDimensionalArray.java)
17. [`arrays/ArrayOfObjects.java`](arrays/ArrayOfObjects.java)

### 8. Strings
18. [`string/StringDemo.java`](string/StringDemo.java)
19. [`string/MutableString.java`](string/MutableString.java)

### 9. Object-Oriented Programming (OOP) - Basics
20. Read [`objectorientedprogramming/ClassAndObjects.md`](objectorientedprogramming/ClassAndObjects.md).
21. [`objectorientedprogramming/ClassAndObject.java`](objectorientedprogramming/ClassAndObject.java)
22. [`objectorientedprogramming/AnonymousObject.java`](objectorientedprogramming/AnonymousObject.java)
23. [`objectorientedprogramming/Methods.java`](objectorientedprogramming/Methods.java)
24. [`objectorientedprogramming/MethodOverloading.java`](objectorientedprogramming/MethodOverloading.java)
25. [`objectorientedprogramming/StaticDemo.java`](objectorientedprogramming/StaticDemo.java)

### 10. Memory Management
26. Refer to the visual guide `Stack_And_Heap.pdf` to understand how Java manages memory behind the scenes.

### 11. Encapsulation & Access Modifiers
27. [`objectorientedprogramming/Encapsulation.java`](objectorientedprogramming/Encapsulation.java)
28. Read [`accessmodifiers/access-modifiers.md`](accessmodifiers/access-modifiers.md) along with the diagram `accessmodifiers/public-private-access-modifiers.png`.
29. Explore [`accessmodifiers/AccessModifiers.java`](accessmodifiers/AccessModifiers.java) and [`accessmodifiers/School.java`](accessmodifiers/School.java) to see how access modifiers work across packages.

### 12. Advanced OOP Concepts (Inheritance, Polymorphism & Keywords)
30. [`objectorientedprogramming/Inheritance.java`](objectorientedprogramming/Inheritance.java)
31. [`objectorientedprogramming/SuperAndThisMethod.java`](objectorientedprogramming/SuperAndThisMethod.java)
32. [`objectorientedprogramming/MethodOverriding.java`](objectorientedprogramming/MethodOverriding.java)
33. Read [`objectorientedprogramming/polymorphism.md`](objectorientedprogramming/polymorphism.md).
34. [`objectorientedprogramming/DynamicMethodDispatch.java`](objectorientedprogramming/DynamicMethodDispatch.java)
35. [`objectorientedprogramming/FinalKeyword.java`](objectorientedprogramming/FinalKeyword.java)

### 13. Data Structures & Abstract Data Types
36. [`dsa/AbstractDataType.java`](dsa/AbstractDataType.java)
37. [`dsa/arrays/LinearSearch.java`](dsa/arrays/LinearSearch.java)
38. [`dsa/arrays/BinarySearch.java`](dsa/arrays/BinarySearch.java)

### 14. Exceptions & Errors
39. Read [`exceptions/errors.md`](exceptions/errors.md) to understand different types of errors in Java.

### 15. Abstract Classes & Interfaces
40. Read [`abstractclass/AbstractClass.md`](abstractclass/AbstractClass.md).
41. [`abstractclass/AbstractClass.java`](abstractclass/AbstractClass.java)
42. [`interfaces/NeedForInterface.java`](interfaces/NeedForInterface.java)
43. [`interfaces/InterfaceDemo.java`](interfaces/InterfaceDemo.java)
44. Read [`interfaces/TypesOfInterface.md`](interfaces/TypesOfInterface.md).

### 16. Inner Classes & Enums
45. [`innerclass/InnerClass.java`](innerclass/InnerClass.java)
46. [`innerclass/AnonymousInnerClass.java`](innerclass/AnonymousInnerClass.java)
47. [`enums/EnumsDemo.java`](enums/EnumsDemo.java)

### 17. Annotations & Lambda Expressions
48. Read [`annotations/Annotations.md`](annotations/Annotations.md).
49. [`annotations/AnnotationDemo.java`](annotations/AnnotationDemo.java)
50. [`lambdaexpression/LambdaExpression.java`](lambdaexpression/LambdaExpression.java)

### 18. Projects
51. `quizconsoleapp/` project: A mini console-based quiz app. Entry point is [`quizconsoleapp/Main.java`](quizconsoleapp/Main.java).

---
*Happy Coding! Feel free to explore, experiment, and break the code to learn.*