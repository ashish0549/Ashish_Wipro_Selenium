package Day_3_Assignment;
import java.util.*;

public class Array_RemoveDuplicate {

	public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 30, 40, 10, 50};

        
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : numbers) {
            uniqueSet.add(num);
        } 
        Integer[] uniqueArray = uniqueSet.toArray(new Integer[0]);
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
}