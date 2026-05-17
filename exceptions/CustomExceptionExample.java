package exceptions;

// Creating a Custom Exception class by extending Exception (Checked Exception)
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        // Calling the constructor of the parent Exception class
        super(message);
    }
}

public class CustomExceptionExample {

    // Using "throws" to declare that this method might throw an InvalidAgeException
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Using "throw" keyword to explicitly throw our custom exception
            throw new InvalidAgeException("Age is less than 18. Not eligible to vote.");
        } else {
            System.out.println("Age is valid. Eligible to vote.");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Testing with age 15 ---");
        try {
            // Calling a method that throws a checked exception requires a try-catch block
            validateAge(15); 
        } catch (InvalidAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("\n--- Testing with age 20 ---");
        try {
            validateAge(20);
        } catch (InvalidAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
        
        System.out.println("\nRest of the code continues...");
    }
}
