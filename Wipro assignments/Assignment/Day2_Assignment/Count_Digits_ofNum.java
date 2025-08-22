package Day_2_Assignment;

public class Count_Digits_ofNum {

	public static void main(String[] args) {
		 int number = 123456; 
	        int count = 0;
	        int temp = number;

	        if (number == 0) {
	            count = 1; 
	        } else {
	            while (temp != 0) {
	                temp /= 10;
	                count++;
	            }
	        }

	        System.out.println("Total digits in " + number + " are: " + count);
	    }
	}