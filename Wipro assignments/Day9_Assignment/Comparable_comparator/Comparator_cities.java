
// Q9. Write a program that sorts a list of cities by population using Comparator.

package Comparable_comparator;
import java.util.*;


class City {
 private String name;
 private int population;

 public City(String name, int population) {
     this.name = name;
     this.population = population;
 }


 public String getName() {
     return name;
 }

 public int getPopulation() {
     return population;
 }

 
 public String toString() {
     return "City{name='" + name + "', population=" + population + "}";
 }
}
public class Comparator_cities {
	 public static void main(String[] args) {
	      
	        List<City> c = new ArrayList<>();
	        c.add(new City("Mumbai", 20411000));
	        c.add(new City("Delhi", 16787941));
	        c.add(new City("Bangalore", 8443675));
	        c.add(new City("Hyderabad", 6809970));
	        c.add(new City("Ahmedabad", 5570585));
	        c.add(new City("Chennai", 7090000));
	        c.add(new City("Kolkata", 4486679));
	        c.add(new City("Pune", 3124458));

	        System.out.println("Before Sorting by Population:");
	        c.forEach(System.out::println);

	        
	        c.sort(Comparator.comparing(City::getPopulation).reversed());
	        System.out.println("\nAfter Sorting by Population (Desc):");
	        c.forEach(System.out::println);
	    }
}
