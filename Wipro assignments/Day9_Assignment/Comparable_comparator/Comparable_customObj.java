
//Q5. Implement a program that sorts a list of custom objects using Comparable, 
//and displays them before and after sorting.


package Comparable_comparator;
import java.util.*;

class WIPRO implements Comparable<WIPRO> {
    private int id;
    private String name;
    private int salary;


    public WIPRO(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

 
    public int compareTo(WIPRO other) {
        return Integer.compare(this.salary, other.salary);
    }

  
    public String toString() {
        return "Emp{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}
public class Comparable_customObj {
	 public static void main(String[] args) {
		 
	        List<WIPRO> emps = new ArrayList<WIPRO>();
	        emps.add(new WIPRO(101, "Arjun", 85000));
	        emps.add(new WIPRO(102, "Babu", 92000));
	        emps.add(new WIPRO(103, "Chethan", 78000));
	        emps.add(new WIPRO(104, "Dinesh", 90000));

	        
	        System.out.println("Before Sorting:");
	        for (WIPRO emp : emps ) {
	            System.out.println(emp);
	        }
	        
	        Collections.sort(emps);

	     
	        System.out.println("\nAfter Sorting by Marks :");
	        for (WIPRO emp : emps) {
	            System.out.println(emps);
	        }
	    }
}
