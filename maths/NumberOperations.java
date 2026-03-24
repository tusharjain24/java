import java.util.Scanner;

public class NumberOperations {
    public void IntegerLength(Scanner scanner) {
        System.out.println("Enter an Integer: ");
        Integer num = scanner.nextInt();
        int len = (int) Math.log10(num) + 1;
        System.out.println(len);
    }

    public void ReversedNumber(Scanner scanner) {
        System.out.println("Enter the number: ");
        Integer num = scanner.nextInt();
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNum = (reversedNum * 10) + digit;
            num = num / 10;
        }
        System.out.println("Reversed number: " + reversedNum);
    }

    public void PalindromeNumber(Scanner scanner) {
        System.out.println("Enter the number you want to check if it is palindrome or not: ");
        int num = scanner.nextInt();
        int originalNumber = num;
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNum = (reversedNum * 10) + digit;
            num = num / 10;
        }
        if (reversedNum == originalNumber) {
            System.out.println("The Number is a Palindrome");
        } else {
            System.out.println("The number is not a Palindrome");
        }
    }

    public boolean ArmstrongNumber(Scanner scanner) {
        System.out.println("Enter the number you want to check if it is Armstrong or not:");
        Integer num = scanner.nextInt();
        int duplicateNum = num;
        double numLength = num.toString().length();
        double sum = 0;

        while (duplicateNum > 0) {
            double lastDigit = duplicateNum % 10;
            sum = (sum * 10) + Math.pow(lastDigit, numLength);
            duplicateNum = duplicateNum / 10;
        }
        if (sum == num) {
            System.out.println("The number is an \"Armstrong Number\"");
            return true;
        } else {
            System.out.println("The number is not an \"Armstrong Number\"");
            return false;
        }
    }

    public void Divisors(Scanner scanner) {
        System.out.println("Enter the number to know all it's divisors:");
        double userNum = scanner.nextInt();
        // no: 26
        /*
         * 1 * 26,
         * 2 * 13,
         * 13 * 2,
         * 26 * 1;
         */
        double squareRootResult = Math.sqrt(userNum);
        for (int i = 1; i <= squareRootResult; i++) {
            if ((userNum % i) == 0) {
                System.out.println(i);
                System.out.println(userNum / i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberOperations problems = new NumberOperations();

        System.out.println("Enter the Problem Number: ");
        int problem_num = sc.nextInt();
        switch (problem_num) {
            case 1:
                problems.IntegerLength(sc);
                break;
            case 2:
                problems.ReversedNumber(sc);
                break;
            case 3:
                problems.PalindromeNumber(sc);
                break;
            case 4:
                problems.ArmstrongNumber(sc); // Print if the number is Armstrong or not.
                break;
            case 5:
                problems.Divisors(sc); // Print all Divisors
                break;
            default:
                System.out.println("Chose the wrong problem Number");
                break;
        }
    }
}
