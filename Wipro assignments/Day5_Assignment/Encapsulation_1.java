//1. Student with Grade Validation & Configuration
//Ensure marks are always valid and immutable once set.
//•	Create a Student class with private fields: name, rollNumber, and marks.
//•	Use a constructor to initialize all values and enforce marks to be between 0 and 100; invalid values reset to 0.
//•	Provide getter methods, but no setter for marks (immutable after object creation).
//•	Add displayDetails() to print all fields.


package Day_5_Assignment;

 class Student {
 private String name;
 private int rollnum;
 private int marks;

 public Student(String name, int rollnum, int marks) {
     this.name = name;
     this.rollnum = rollnum;

     if (marks >= 0 && marks <= 100) {
         this.marks = marks;
     } else {
         this.marks = 0;
     }
 }

 public String getName() {
     return name;
 }

 public int getRollNumber() {
     return rollnum;
 }

 public int getMarks() {
     return marks;
 }
 
 public void displayDetails() {
     System.out.println("Student Details:");
     System.out.println("Name: " + name);
     System.out.println("Roll Number: " + rollnum);
     System.out.println("Marks: " + marks);
 }
}
public class Encapsulation_1 {
	public static void main(String[] args) {
   
        Student s1 = new Student("Nasir", 101, 85);
        s1.displayDetails();
        System.out.println(); 
        
        Student s2 = new Student("Suhas", 102, -10);
        s2.displayDetails();
        System.out.println();

        
        Student s3 = new Student("Sharath", 103, 95);
        s3.displayDetails();
        System.out.println();

  
    }
}


