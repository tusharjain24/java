package objectorientedprogramming;

class A {
    public A() {
        System.out.println("Constructor of class A");
    }

    void display() {
        System.out.println("Display method of class A");
    }
}

// Single level Inheritance
class B extends A {
    public B() {
        System.out.println("Constructor of class B");
    }

    void display() {
        System.out.println("Display method of class B");
    }
}

// Multi Level Inheritance
class C extends B {
    public C() {
        System.out.println("Constructor of class C");
    }

    void display() {
        System.out.println("Display method of class C");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        C c = new C();
        c.display();
    }
}
