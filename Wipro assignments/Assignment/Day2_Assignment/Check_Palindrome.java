package Day_2_Assignment;

public class Check_Palindrome {

	public static void main(String[] args) {
		int num = 12321;  
        int rev = 0;
        int temp = num;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (num == rev) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }
}