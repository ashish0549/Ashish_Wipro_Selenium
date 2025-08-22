package Day_7_Assignment;

//2. Method that takes two integer values and swaps them
class PassByValue2 {
 static void swap(int a, int b) {
     System.out.println("Inside method before swap: a=" + a + ", b=" + b);
     int temp = a;
     a = b;
     b = temp;
     System.out.println("Inside method after swap: a=" + a + ", b=" + b);
 }
 
 public static void main(String[] args) {
     int x = 10, y = 20;
     System.out.println("Before method call: x=" + x + ", y=" + y);
     swap(x, y);
     System.out.println("After method call: x=" + x + ", y=" + y);
 }
}
