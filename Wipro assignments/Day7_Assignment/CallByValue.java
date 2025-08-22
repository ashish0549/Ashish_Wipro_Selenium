package Day_7_Assignment;
//7. Java is strictly "call by value" even when passing objects
class CallByValue {
 static void changeReference(Student s) {
     s = new Student("New Student", 100);
     System.out.println("Inside method: " + s.name + ", " + s.marks);
 }
 
 public static void main(String[] args) {
     Student student = new Student("Original", 80);
     System.out.println("Before method: " + student.name + ", " + student.marks);
     changeReference(student);
     System.out.println("After method: " + student.name + ", " + student.marks);
 }
}
