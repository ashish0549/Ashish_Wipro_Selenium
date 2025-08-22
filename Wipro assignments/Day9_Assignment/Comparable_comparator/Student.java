//
//Q1. Sort a list of students by roll number (ascending) using Comparable.
//Create a Student class with fields: rollNo, name, and marks. Implement the Comparable interface to sort students by their roll numbers.


package Comparable_comparator;
import java.util.*;
class Student implements Comparable<Student> 
   {
	int id;
	String name;
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
//	public int compareTo(Student s) 
//	{
//		return id - s.id;// Sorting id
//	}
	
	public int compareTo(Student s) 
	{
		return this.name.compareTo(s.name);// For comparing String(Sorting String)
	}
//	public int compareTo(Student s) 
//	{
//		return 0;// Incase of returning zero  the it won't sort 
//	}
	
	public String toString() 
	{
		return id + " " + name;
	}
	
	public static void main (String[] args) 
	{
		List<Student> list = Arrays.asList(
				new Student(9,"Amit"),
				new Student(0,"Raghav"),
				new Student(2,"Krishna")
				);// adding to a list
		
		Collections.sort(list);// Uses Comparable
		list.forEach(System.out::println);
	}
	

}
