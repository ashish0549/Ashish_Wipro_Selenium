package Day_3_Assignment;

public class String_VowelsCount {

	 public static void main(String[] args) {
	        String input = "Programming";

	        int count = countVowels(input);

	        System.out.println("Number of vowels in \"" + input + "\": " + count);
	    }

	    public static int countVowels(String str) {
	        int count = 0;
	        str = str.toLowerCase();  // To handle both uppercase and lowercase letters

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                count++;
	            }
	        }

	        return count;
	    }
	}