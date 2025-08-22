package Collection_Framework;
import java.util.*;
import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(1,2,3,4,5));
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(5);
    
        int elementToSearch = 3;
        boolean isFound = arrayList1.contains(elementToSearch);
        System.out.println("Element " + elementToSearch + " found: " + isFound);
        
        
        Integer[] array = new Integer[arrayList1.size()];
        arrayList1.toArray(array);
        System.out.print("Array: ");
        for (Integer num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(4);
        arrayList2.add(5);
        arrayList2.add(6);
        arrayList2.add(7);
        
        for (Integer element : arrayList2) {
            if (!arrayList1.contains(element)) {
                arrayList1.add(element);
            }
        }
        
        System.out.println("Merged ArrayList (without duplicates): " + arrayList1);
    }
}