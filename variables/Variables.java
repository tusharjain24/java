package variables;

public class Variables {
    int num; // Instance Variable

    public static void main(String[] args) {
        int age = 25; // Local Variable of the method
        byte age2 = 127;
        short age3 = 32767;
        long age4 = 9223372036854775807l;

        float age5 = 25.5f;
        double age6 = 25.5;

        char age7 = 'A';
        boolean age8 = true;

        System.out.println(age);
        System.out.println(age2);
        System.out.println(age3);
        System.out.println(age4);
        System.out.println(age5);
        System.out.println(age6);
        System.out.println(age7);
        System.out.println(age8);
    }
}
