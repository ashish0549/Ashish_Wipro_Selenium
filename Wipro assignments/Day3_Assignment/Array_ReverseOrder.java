package Day_3_Assignment;

public class Array_ReverseOrder {
	 public static void main(String[] args) {
	   
	        int[] numbers = {10, 20, 30, 40, 50};

	        System.out.println("Original array:");
	        for (int number : numbers) {
	            System.out.print(number + " ");
	        }

	        System.out.println("\n\nArray in reverse order:");
	        for (int i = numbers.length - 1; i >= 0; i--) {
	            System.out.print(numbers[i] + " ");
	        }
	    }
	}
