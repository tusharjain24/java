package innerclass;

class Electronics {
    public void show() {
        System.out.println("Showing electronics");
    }
}

public class AnonymousInnerClass {

    public static void main(String[] args) {
        Electronics obj = new Electronics() {
            public void show() {
                System.out.println("Showing electronics in anonymous inner class");
            }
        };
        obj.show();
    }
}