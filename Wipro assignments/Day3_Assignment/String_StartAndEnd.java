//Check if String starts with “j” and
//end with “a” . example. “java”

package Day_3_Assignment;

public class String_StartAndEnd {

	public static void main(String[] args) {
        String input = "java";

        if (startsWithJEndsWithA(input)) {
            System.out.println("\"" + input + "\" starts with 'j' and ends with 'a'.");
        } else {
            System.out.println("\"" + input + "\" does not start with 'j' and end with 'a'.");
        }
    }

    public static boolean startsWithJEndsWithA(String str) {
        // Check if the string starts with 'j' and ends with 'a' (case_sensitive)
        return str.startsWith("j") && str.endsWith("a");
    }
}
