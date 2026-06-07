package userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputAndOutput {

    /**
     * Method 1: Using System.in directly.
     * - System.in is an InputStream that reads raw bytes from the console.
     * - It only reads one byte (character) at a time.
     * - Returns the integer ASCII value (e.g., '1' becomes 49).
     * - Leaves the rest of the input (like the newline character '\n' from pressing Enter) in the buffer.
     */
    public static void useSystemIn() {
        System.out.println("--- Method 1: Using System.in directly ---");
        System.out.println("Enter a number: ");
        int input;
        try {
            input = System.in.read(); // Reads only the first byte of input
            System.out.println("You entered (raw ASCII/byte code): " + input);
            System.out.println("As a character: " + (char) input);

            // CRITICAL: Clear the buffer!
            // Since System.in.read() only read 1 character, the rest of the line (like '\n' or other digits)
            // is still in the input stream. We must consume it so subsequent methods don't read it.
            int extra;
            while ((extra = System.in.read()) != '\n' && extra != -1) {
                // Keep reading and discarding until we reach the end of the line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method 2: Using BufferedReader.
     * - Reads text from a character-input stream, buffering characters to provide efficient reading.
     * - Reads a whole line at a time as a String (until it finds '\n').
     * - Synchronized (thread-safe).
     * - Must manually parse numbers (e.g., using Integer.parseInt()).
     */
    public static void useBufferedReader() {
        System.out.println("\n--- Method 2: Using BufferedReader ---");
        System.out.println("Enter a number: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        try {
            String inputLine = bf.readLine(); // Reads the whole line as a String
            int num = Integer.parseInt(inputLine); // Convert String to integer
            System.out.println("You entered: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Failed to parse integer!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // NOTE: Do NOT close 'bf' here!
        // Closing 'bf' closes the underlying InputStreamReader and System.in.
        // Doing so would prevent the Scanner method from working.
    }

    /**
     * Method 3: Using Scanner.
     * - A simple text scanner which can parse primitive types and strings using regular expressions.
     * - Not thread-safe (unsynchronized).
     * - Automatically parses data (e.g., sc.nextInt(), sc.nextDouble()).
     * - Easier to use but slightly slower than BufferedReader for huge datasets.
     */
    public static void useScannerClass() {
        System.out.println("\n--- Method 3: Using Scanner ---");
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        try {
            int num2 = sc.nextInt(); // Automatically parses input to an int
            System.out.println("You entered: " + num2);
        } catch (Exception e) {
            System.out.println("Invalid input! Scanner expected an integer.");
            e.printStackTrace();
        }
        
        // Since this is the final method, closing 'sc' (which closes System.in) is fine here.
        // In a real application, only close a wrapper of System.in when you are completely
        // finished with all console input.
        sc.close();
    }

    public static void main(String[] args) {
        useSystemIn();

        useBufferedReader();

        useScannerClass();
    }
}
