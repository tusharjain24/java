package innerclass;

class A {
    public void show() {
        System.out.println("A is showing");
    }

    class B {
        public void config() {
            System.out.println("B is showing");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A a = new A();
        a.show();

        A.B b = a.new B();
        b.config();
    }
}
