public class LogicalOperators {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;

        int num3 = 7;
        int num4 = 5;

        boolean result1 = num1 >= num2 && num3 <= num1;
        boolean result2 = num1 >= num4 && num3 > num1;

        boolean result3 = num1 >= num2 || num3 <= num1;
        boolean result4 = num1 >= num4 || num3 > num1;

        System.err.println("result1: " + result1);
        System.err.println("result2: " + result2);
        System.err.println("result3: " + result3);
        System.err.println("result4: " + result4);
        System.err.println("result5: " + !(num3 <= num1));
    }
}

/*
 * 
 * If we need to combine the result of two or more relational operators, then we
 * use logical operators.
 * We use logical operator in between two or more results of relational
 * operators.
 * AND operator (&&), OR operator (||) and Not operator (!) are logical
 * operators.
 * 
 * 1) In case of AND Operator:
 * If both are true - true
 * If one is true and other is false - false
 * If one is false and other is true - false
 * If both are false - false
 * If first condition is false then it will not check for the another one and it
 * will increase the execution time.
 * Thus, because of its less time it is known as short- circuit.
 * 
 * 2) In case of OR Operator:
 * If both are true - true
 * If one is true and other is false - true
 * If one is false and other is true - true
 * If both are false - false
 * If first condition is true then it will not check for the another one and it
 * will increase the execution time.
 * Thus, because of its less time it is known as short- circuit.
 * 
 * 3) In case of Not Operator:
 * It is basically used to reverse the things.
 * It means if result is false, it will do true.
 * If the result is true, it will do false.
 * Not operator just do the opposite.
 * 
 * We can use as much logical operators as we want in between the relational
 * operations.
 * 
 */
