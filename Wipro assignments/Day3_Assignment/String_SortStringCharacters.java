package Day_3_Assignment;
import java.util.Arrays;
public class String_SortStringCharacters {

	public static void main(String[] args) {
        String input = "programming";

        String sortedString = sortString(input);

        System.out.println("Original String: " + input);
        System.out.println("Sorted String: " + sortedString);
    }

    public static String sortString(String str) {
   
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}