package Day_7_Assignment;
//10. Simulate call by reference using wrapper class or array
class SimulateReference {
 static void changeUsingArray(int[] arr) {
     arr[0] = 999;
 }
 
 static void changeUsingWrapper(Integer[] wrapper) {
     wrapper[0] = 888;
 }
 
 public static void main(String[] args) {
     int[] array = {100};
     Integer[] wrapper = {200};
     
     System.out.println("Before - Array: " + array[0]);
     System.out.println("Before - Wrapper: " + wrapper[0]);
     
     changeUsingArray(array);
     changeUsingWrapper(wrapper);
     
     System.out.println("After - Array: " + array[0]);
     System.out.println("After - Wrapper: " + wrapper[0]);
 }
}

