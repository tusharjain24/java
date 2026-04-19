package interfaces;

/*
* 1. There are by default public and abstract methods.
* 2. The variables in interfaces are by default public, static and final. Meaning we have to define them at the time of declaration.
* 3. In interfaces we can only declare methods, we cannot implement them.
* 4. We cannot create an object of an interface directly, we have to create an object of a class that implements the interface.
*/

/*
* class to class -> extends
* class to interface -> implements
* interface to interface -> extends
* interface to class -> not possible
*/

interface A {
    int age = 20; // public static final
    String area = "Mumbai"; // public static final

    void show();

    void cofig();
}

interface B {
    void run();
}

class X implements A, B {
    public void show() {
        System.out.println("Showing A");
    }

    public void cofig() {
        System.out.println("Configuring A");
    }

    public void run() {
        System.out.println("Running B");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        A obj = new X();
        obj.show();
        obj.cofig();

        B obj1 = new X();
        obj1.run();
    }
}
