

//Q6. Sort a list of students by marks using Comparator.
//Create a Comparator class or use a lambda expression to sort by marks.


package Comparable_comparator;
 
import java.util.*;
 
class Student1 {
    int id;
    String name;
    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return id + " " + name;
    }
}
 
public class TestComparator implements Comparator<Student1> {
	public int compare(Student1 s1,Student1 s2)
		{
			return Integer.compare(s1.id,s2.id);
		}
    public static void main(String[] args) {
        List<Student1> list =new ArrayList<>();
 
        list.add(new Student1(0, "Amit"));
        list.add(new Student1(3,"Mishra"));
        list.add(new Student1(1, "Rahul"));
        list.add(new Student1(2, "Kiran"));
        System.out.println(list);
        Collections.sort(list, new TestComparator());
     //   list.sort((s1, s2) -> s1.name.compareTo(s2.name));  // use comparator
 
        list.forEach(System.out::println);
    }
}
