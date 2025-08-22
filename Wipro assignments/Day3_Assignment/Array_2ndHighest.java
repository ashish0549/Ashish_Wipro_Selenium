package Day_3_Assignment;
import  java.util.Arrays;
public class Array_2ndHighest 
{
public static void main(String[] args) 
{
        int[] arr = {12, 35, 1, 10, 34, 35};
        Arrays.sort(arr);
        int largest = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                System.out.println("Second largest element is: " + arr[i]);
                return;
            }
        }
        System.out.println("No second largest element found.");
}
}