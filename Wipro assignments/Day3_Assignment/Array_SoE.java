
 // 1.Write a program to find the sum of all elements in an integer array
package Day_3_Assignment;

public class Array_SoE {
	public static int calculateSum(int[] numbers) {
		int total = 0;
        for (int num : numbers) 
        {
            total += num;
        }
        return total;
    }
	public static void main(String[] args) {
	 int[] numbers = {5, 10, -3, 7, 20};

     int sum = calculateSum(numbers);

     System.out.println("The sum of the array elements is: " + sum);
 }

	
}