package string;

// String is a class in Java that is used to store strings.
// String is immutable in Java.

public class StringDemo {
    public static void main(String[] args) { 
        // String name = new String("Tushar");
        String name1 = "Tushar";
        System.out.println(name1);
        System.out.println(name1.toUpperCase());
        System.out.println(name1.toLowerCase());
        System.out.println(name1.length()); // To print the size of the string
        System.out.println(name1.charAt(0)); // To print the character at a specific index
        System.out.println(name1.indexOf("h")); // To print the index of a specific character
        System.out.println(name1.substring(2)); // To print the substring of a string

        // String is immutable
        String name2 = "Tushar";
        System.out.println(name1 == name2);
    }
}
