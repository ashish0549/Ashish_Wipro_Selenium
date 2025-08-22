package Day_7_Assignment;
//6. Class Student with name and marks
class Student {
 String name;
 int marks;
 
 Student(String name, int marks) {
     this.name = name;
     this.marks = marks;
 }
}

class CallByReference3 {
 static void updateMarks(Student s, int newMarks) {
     System.out.println("Before update: " + s.marks);
     s.marks = newMarks;
     System.out.println("After update: " + s.marks);
 }
 
 public static void main(String[] args) {
     Student student = new Student("Alice", 85);
     System.out.println("Original marks: " + student.marks);
     updateMarks(student, 95);
     System.out.println("Final marks: " + student.marks);
 }
}
