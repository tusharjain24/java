package accessmodifiers;

public class AccessModifiers {
    public static void main(String[] args) {
        School s1 = new School("DPS", 10000, "Delhi", "Mr. Sharma");
        System.out.println(s1.name);
        System.out.println(s1.getFees());
        System.out.println(s1.address);
        System.out.println(s1.principalName);
    }
}
