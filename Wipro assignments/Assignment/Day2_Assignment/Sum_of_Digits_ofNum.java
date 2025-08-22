package Day_2_Assignment;

public class Sum_of_Digits_ofNum {

	public static void main(String[] args) {
		 int number = 6785;  // You can change this number
	        int sum = 0;
	        int temp = number;

	        while (temp > 0) {
	            sum += temp % 10;  
	            temp /= 10;        
	        }

	        System.out.println("Sum of digits of " + number + " is: " + sum);
	    }
	}