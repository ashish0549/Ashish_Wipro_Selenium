package Day_3_Assignment;

public class String_CountCharacters {

	public static void main(String[] args) {
        String input = "Hello World! 123 @Java";

        // Count digits, letters, spaces, and special characters
        int[] counts = countCharacters(input);

        System.out.println("Digits: " + counts[0]);
        System.out.println("Letters: " + counts[1]);
        System.out.println("Spaces: " + counts[2]);
        System.out.println("Special Characters: " + counts[3]);
    }

    public static int[] countCharacters(String str) {
        int[] counts = new int[4]; // [0] for digits, [1] for letters, [2] for spaces, [3] for special characters

        // Traverse through the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                counts[0]++; // Count digits
            } else if (Character.isLetter(ch)) {
                counts[1]++; // Count letters
            } else if (Character.isSpaceChar(ch)) {
                counts[2]++; // Count spaces
            } else {
                counts[3]++; // Count special characters
            }
        }

        return counts;
    }
}
