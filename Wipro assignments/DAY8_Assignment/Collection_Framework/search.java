package Collection_Framework;

import java.util.ArrayList; 
import java.util.Scanner; 
public class search {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(); 
		numbers.add(10);
		numbers.add(20); 
		numbers.add(30);
		numbers.add(40);
		numbers.add(50); 
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter a number to search in the list: "); 
		int searchNumber = scanner.nextInt();
		if (numbers.contains(searchNumber)) { 
			System.out.println(searchNumber + " is present in the list."); 
			} else {
				System.out.println(searchNumber + " is not present in the list.");
				}
		} 
	}

