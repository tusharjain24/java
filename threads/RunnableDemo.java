package threads;

class HiRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi (Runnable)");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class HelloRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello (Runnable)");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        // Create Runnable targets
        Runnable obj1 = new HiRunnable();
        Runnable obj2 = new HelloRunnable();

        // Create Thread objects and pass the runnable targets
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Start the threads (this runs them concurrently/parallelly)
        t1.start();

        // Brief sleep to demonstrate interleaving/sequencing behavior
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
    }
}
