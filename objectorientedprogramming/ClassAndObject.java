package objectorientedprogramming;

public class ClassAndObject {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Initialize the object of class Calculator
        Calculator obj = new Calculator();

        // Call the addition method of class Calculator
        double result = obj.addition(num1, num2);

        System.out.println("Addition: " + result);
    }
}

class Calculator {

    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    public double substraction(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        return num1 / num2;
    }
}