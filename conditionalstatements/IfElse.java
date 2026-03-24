public class IfElse {
    public static void main(String[] args) {
        long num1 = 1258l;
        float num2 = 12.5f;
        int num3 = 145;

        double result = num1 % 2 == 0 ? 1.00 : 0.00; // Ternary Operator

        if (num1 < 123456) {
            System.out.println("num1 < 123456");
        }

        if (num1 >= num2 && num3 <= 150) {
            System.out.println("Inside if condition");
        } else {
            System.out.println("Inside else condition");
        }

        if (result == 1.0) {
            System.out.println("TRUE");
        } else if (result == 0.0) {
            System.out.println(false);
        } else {
            System.out.println("Neither true nor false");
        }
    }

}
/*
 * 
 * #1
 * -- conditional statement is a statement that can be true or false.
 * -- suppose if ask student is pass. (answer yes or no)
 * -- this type of statement of statement is conditional statement.
 * 
 * #2
 * In this part we are only discussing about if-else and
 * in next lecture we are discussing if-else-if ladder, ternary operator and
 * switch statement.
 * 
 * #3
 * syntax of if-else
 * 
 * -- condition is either true or false after evaluation
 * -- remember like c and c++, we cannot use number directly as condition of
 * if-else
 * - if(5) -- not allowed in java
 * -- you get Type mismatch: cannot convert from int to boolean
 * if(condition)
 * {
 * code
 * either this part execute
 * }
 * 
 * else
 * {
 * code
 * or this part execute
 * }
 * 
 * #4
 * example:
 * if want to check a given number is even or odd then;
 * int num=13;
 * if(num%2==0)
 * System.out.println("Even"); //here we not use braces for single statement {}
 * 
 * else
 * System.out.println("Odd"); // here we not use braces {}
 * 
 * Note: for single statement braces is not required but for multiple statement
 * it is required.
 * 
 */

/**
 * if-else
 */