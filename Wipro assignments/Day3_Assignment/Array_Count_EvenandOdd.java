package Day_3_Assignment;
import java.util.Arrays;
public class Array_Count_EvenandOdd {
	 public static void main(String[] args) {
	        int[] arr = {5, 7, 2, 4, 9}; 
	        
	        int countEven = 0;
	        for (int num : arr) {
	            if (num % 2 == 0) {
	                countEven++;
	            }
	        }
	        int countOdd = arr.length - countEven;

	        System.out.println("Original Array: " + Arrays.toString(arr));
	        System.out.println("Number of even numbers: " + countEven);
	        System.out.println("Number of odd numbers: " + countOdd);
	    }
	}