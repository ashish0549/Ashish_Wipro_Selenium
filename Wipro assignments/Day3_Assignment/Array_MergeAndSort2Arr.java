package Day_3_Assignment;

public class Array_MergeAndSort2Arr {

	 public static void main(String[] args) {
	        int[] array1 = {30, 10, 50};
	        int[] array2 = {20, 40, 60};

	        int n1 = array1.length;
	        int n2 = array2.length;
	        int[] mergedArray = new int[n1 + n2];

	    
	        for (int i = 0; i < n1; i++) {
	            mergedArray[i] = array1[i];
	        }
	        for (int i = 0; i < n2; i++) {
	            mergedArray[n1 + i] = array2[i];
	        }

	      
	        for (int i = 0; i < mergedArray.length - 1; i++) {
	            for (int j = 0; j < mergedArray.length - 1 - i; j++) {
	                if (mergedArray[j] > mergedArray[j + 1]) {
	             
	                    int temp = mergedArray[j];
	                    mergedArray[j] = mergedArray[j + 1];
	                    mergedArray[j + 1] = temp;
	                }
	            }
	        }

	 
	        System.out.println("Merged and sorted array:");
	        for (int num : mergedArray) {
	            System.out.print(num + " ");
	        }
	    }
	}
