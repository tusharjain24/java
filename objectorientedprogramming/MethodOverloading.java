package objectorientedprogramming;

public class MethodOverloading {
    public static void main(String[] args) {
        CalculatorClass object = new CalculatorClass();
        double result = object.addition(10, 20);
        System.out.println("Addition: " + result);
    }
}

class CalculatorClass {
    // Method Overloading
    /*
     * Same method name but different number of parameters or different type of
     * parameters.
     */
    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    public double addition(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public double addition(double num1, double num2, double num3, double num4) {
        return num1 + num2 + num3 + num4;
    }
}