package Day_7_Assignment;
//4. Class Box with variable length
class Box {
 int length;
 
 Box(int length) {
     this.length = length;
 }
}

class CallByReference1 {
 static void modifyBox(Box box) {
     System.out.println("Inside method before: " + box.length);
     box.length = 100;
     System.out.println("Inside method after: " + box.length);
 }
 
 public static void main(String[] args) {
     Box myBox = new Box(50);
     System.out.println("Before method call: " + myBox.length);
     modifyBox(myBox);
     System.out.println("After method call: " + myBox.length);
 }
}

