package Day_7_Assignment;
//1. Method accepts integer parameter and tries to change its value
class PassByValue1 {
 static void changeValue(int x) {
     x = 200;
     System.out.println("Inside method: " + x);
 }
 
 public static void main(String[] args) {
     int num = 50;
     System.out.println("Before method call: " + num);
     changeValue(num);
     System.out.println("After method call: " + num);
 }
}

