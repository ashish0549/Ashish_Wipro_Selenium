
//Q8. Sort Employee objects by joining date using Comparator.
//Use Comparator to sort employees based on LocalDate or Date.


package Comparable_comparator;
import java.time.LocalDate;
import java.util.*;


class Employe {
    private int id;
    private String name;
    private LocalDate joiningDate;

   
    public Employe(int id, String name, LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.joiningDate = joiningDate;
    }

  
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }
    
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', joiningDate=" + joiningDate + "}";
    }
}
public class Comparator_emp {
	public static void main(String[] args) {
   
        List<Employe> emp = new ArrayList<>();
        emp.add(new Employe(101, "Arya", LocalDate.of(2025, 9, 10)));
        emp.add(new Employe(102, "Bharath", LocalDate.of(2025, 10, 15)));
        emp.add(new Employe(103, "Chitra", LocalDate.of(2025, 8, 1)));
        emp.add(new Employe(104, "Dhruva", LocalDate.of(2025, 11, 20)));

       
        System.out.println("Before Sorting by Joining Date:");
        emp.forEach(System.out::println);


        emp.sort(Comparator.comparing(Employe::getJoiningDate));

     
        System.out.println("\nAfter Sorting by Joining Date (Earliest First):");
        emp.forEach(System.out::println);
    }
}

