package string;

// By default String is IMMUTABLE
public class MutableString {
    public static void main(String[] args) {
        // StringBuffer and StringBuilder is used to create a MUTABLE STRING

        StringBuffer sb = new StringBuffer("Tushar");
        System.out.println("Capacity of string buffer Object: " + sb.capacity());

        // Append some string in the string at the end
        sb.append("Jain");

        // Insert some string at a specific space
        sb.insert(5, " Learning Java");
        System.out.println(sb);

        // Print sub-string
        System.out.println(sb.substring(0, 3));

        // Reverse the string
        System.out.println(sb.reverse());
    }
}
