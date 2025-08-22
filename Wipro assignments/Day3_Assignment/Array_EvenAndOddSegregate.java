package Day_3_Assignment;

public class Array_EvenAndOddSegregate {

	public static void main(String[] args) {
        int[] array = {12, 17, 70, 15, 22, 65, 21, 90};
        int n = array.length;

        int[] result = new int[n];
        int evenIndex = 0;     
        int oddIndex = n - 1;   

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                result[evenIndex] = array[i];
                evenIndex++;
            } else {
                result[oddIndex] = array[i];
                oddIndex--;
            }
        }

        
        System.out.println("Array after segregating even and odd numbers:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
