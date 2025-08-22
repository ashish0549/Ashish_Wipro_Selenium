package Day_3_Assignment;

public class Array_RotateLeft {

	public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int n = array.length;
        int k = 2; 

        System.out.println("Original array:");
        printArray(array);

        leftRotate(array, k);

        System.out.println("\nArray after left rotation by " + k + " positions:");
        printArray(array);
    }

    
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 

        for (int i = 0; i < k; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first; 
        }
    }


    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
