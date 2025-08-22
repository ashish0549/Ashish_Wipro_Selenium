package Day_3_Assignment;

public class String_PalindromeCheck {
	 public static void main(String[] args) {
	        String input = "madam";

	        if (isPalindrome(input)) {
	            System.out.println("\"" + input + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + input + "\" is not a palindrome.");
	        }
	    }

	    public static boolean isPalindrome(String str) {
	        int start = 0;
	        int end = str.length() - 1;

	        while (start < end) {
	            if (str.charAt(start) != str.charAt(end)) {
	                return false; // mismatch found
	            }
	            start++;
	            end--;
	        }
	        return true; // no mismatches, it's a palindrome
	    }
	} 