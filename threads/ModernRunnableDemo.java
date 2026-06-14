package threads;

public class ModernRunnableDemo {
    public static void main(String[] args) {
        // Since Runnable is a Functional Interface (has only one abstract method: run()),
        // we can use Java Lambda Expressions instead of creating separate classes.
        
        Runnable hiTask = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi (Lambda)");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };

        Runnable helloTask = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello (Lambda)");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };

        // Create and start threads
        Thread t1 = new Thread(hiTask);
        Thread t2 = new Thread(helloTask);

        t1.start();
        
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        t2.start();
    }
}
