package Day_3_Assignment;

public class Array_CheckPalindrome {

	public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1};

        if (isPalindrome(array)) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false; 
            }
            start++;
            end--;
        }
        return true; 
    }
}
