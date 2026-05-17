package exceptions;

public class ExceptionHandlingUsingTryCatch {
    public static void main(String[] args) {
        int i = 5;
        int j = 0;

        try {
            j = 18 / i;
            System.out.println(j);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Result = " + j);
        System.out.println("Bye");
    }
}
