
// write a program to search for a number entered by the user in an array

package Day_3_Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Array_TragetSearch 
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the number of elements: ");
 int n = sc.nextInt();

 int[] arr = new int[n];
 System.out.println("Enter " + n + " integers:");
 for (int i = 0; i < n; i++) {
     arr[i] = sc.nextInt();
 }

 System.out.print("Enter the number to search: ");
 int target = sc.nextInt();
 sc.close();

 int index = -1;
 for (int i = 0; i < arr.length; i++) {
     if (arr[i] == target) {
         index = i;
         break;
     }
 }

 if (index != -1) {
     System.out.println("Number " + target + " found at index " + index + ".");
 } else {
     System.out.println("Number " + target + " not found in the array.");
 }
}
}

