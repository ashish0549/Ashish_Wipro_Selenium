package Day_7_Assignment;
//8. Assign a new object to a reference passed into a method
class ReferenceDemo {
 static void assignNewObject(StringBuilder sb) {
     sb = new StringBuilder("New String");
     sb.append(" Modified");
     System.out.println("Inside method: " + sb);
 }
 
 public static void main(String[] args) {
     StringBuilder original = new StringBuilder("Original");
     System.out.println("Before method: " + original);
     assignNewObject(original);
     System.out.println("After method: " + original);
 }
}
