package innerclass;

class A {
    public void show() {
        System.out.println("A is showing");
    }

    static class B {
        public void config() {
            System.out.println("B is showing");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A a = new A();
        a.show();

        // A.B b = a.new B(); // if the inner class is not static
        A.B b = new A.B(); // if the inner class is static
        b.config();
    }
}
