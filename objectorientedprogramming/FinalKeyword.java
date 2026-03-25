package objectorientedprogramming;

/*
 If we add a final keyword before a class, then we cannot inherit that class
 */
class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * If we add final keyword here, then we cannot override this method in Calc2
     * class
     */
    public void show() {
        System.out.println("By Tushar");
    }
}

class Calc2 extends Calc {
    public void show() {
        System.out.println("By Someone else");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        final int age = 20;
        // age = 30; // Will throw an error that cannot reassign final variable
        System.out.println("Age: " + age);
        Calc2 obj = new Calc2();
        obj.show();
    }
}

/*
 * - Final Keyword can be used with **variables**, **methods** and **classes**.
 * - In java final keyword is used to define a constant. In some languuages like
 * javascript the keyword is const.
 * - When you make a class final, we are stopping **Inheritence**
 * - When you make a method final, we are stopping **Method Overriding**
 * - When you make a variable final, we are stopping **Variable Reassignment**
 * 
 */