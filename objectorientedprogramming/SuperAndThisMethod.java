package objectorientedprogramming;

class Fruits {
    public Fruits() {
        // Super method is used to call the constructor of the parent class.
        // Whether we write it or not, it will be called by default in Java.
        super();
        System.out.println("Constructor of class Fruits");
    }

    public Fruits(int a) {
        System.out.println("Parameterized Constructor of class A");
    }

    void display() {
        System.out.println("Display method of class A");
    }
}

// Single level Inheritance
class SummerFruits extends Fruits {
    public SummerFruits() {
        super();
        System.out.println("Constructor of class SummerFruits");
    }

    public SummerFruits(int b) {
        // This method is used to call the constructor of the same class.
        this();
        System.out.println("Parameterized Constructor of class SummerFruits");
    }

    void display() {
        System.out.println("Display method of class B");
    }
}

public class SuperAndThisMethod {
    public static void main(String[] args) {
        SummerFruits b = new SummerFruits();
        b.display();
    }
}
