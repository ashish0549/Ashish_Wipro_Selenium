package Day_3_Assignment;

public class Array_SortAscOrder {
	 public static void main(String[] args) {
	        int[] numbers = {50, 20, 40, 10, 30};

	        int n = numbers.length;

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (numbers[j] > numbers[j + 1]) {
	               
	                    int temp = numbers[j];
	                    numbers[j] = numbers[j + 1];
	                    numbers[j + 1] = temp;
	                }
	            }
	        }
	        System.out.println("Array in ascending order:");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	    }
	}



