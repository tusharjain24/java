package loops;

public class DoWhile {
    public static void main(String[] args) {
        int i = 0;
        // While Loop
        while (i < 5) {
            System.out.println("Hello World");
            int j = 0;
            // Nested while loop
            while (j < 3) {
                System.out.println("Hello World inside nested **WHILE** loop");
                j++;
            }
            i++;
        }
        // Do While Loop
        int k = 0;
        do {
            System.out.println("Hello World inside **DO-WHILE** loop");
            k++;
        } while (k < 5);
    }
}
