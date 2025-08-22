//
// Q11. Create a program where:
//Student implements Comparable to sort by name
//Use Comparator to sort by marks
//Demonstrate both sorting techniques in the same program.
//

package Comparable_comparator;
import java.util.*;


class Studentss implements Comparable<Studentss> {
 private int rollNo;
 private String name;
 private int marks;


 public Studentss(int rollNo, String name, int marks) {
     this.rollNo = rollNo;
     this.name = name;
     this.marks = marks;
 }


 public String getName() {
     return name;
 }

 public int getMarks() {
     return marks;
 }


 
 public String toString() {
     return "Student{rollNo=" + rollNo + ", name='" + name + "', marks=" + marks + "}";
 }

 
 public int compareTo(Studentss other) {
     return this.name.compareToIgnoreCase(other.name);
 }

 public static final Comparator<Studentss> MARKS_COMPARATOR = new Comparator<Studentss>() {
     public int compare(Studentss s1, Studentss s2) {
         return Integer.compare(s1.getMarks(), s2.getMarks());
     }
 };
}
public class Comparable_comparator {
	public static void main(String[] args) {
        List<Studentss> s = new ArrayList<>();
        s.add(new Studentss(101, "Ravi", 85));
        s.add(new Studentss(102, "Anita", 92));
        s.add(new Studentss(103, "Mohit", 78));
        s.add(new Studentss(104, "Geeta", 90));

       
        System.out.println("Original List:");
        s.forEach(System.out::println);
       
        Collections.sort(s);
        System.out.println("\nSorted by Name (Alpha):");
        s.forEach(System.out::println);


        Collections.sort(s, Studentss.MARKS_COMPARATOR);
        System.out.println("\nSorted by Marks (Asc):");
        s.forEach(System.out::println);
    }
}

