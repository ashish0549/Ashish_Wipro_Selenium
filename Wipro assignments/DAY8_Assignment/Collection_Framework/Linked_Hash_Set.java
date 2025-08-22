package Collection_Framework;
import java.util.*;
//Linked Hash set Follows insertion order
//No Duplicate Elements allowed
//Store Null(only One Null allowed
//Elements stored on basis of a Hash code Value

public class Linked_Hash_Set {

	public static void main(String[] args) {
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		set.add("Maggi");
		set.add("Pizza");
		set.add("Ice Cream");
		set.add("Chocolate");
		set.add("Coco Cola");
		set.add(null);
		set.add(null);// Set does not allow multiple elements so only 1 null is printed 
 		System.out.println(set);
 		
 		System.out.println(set.contains("Pizza"));
 		System.out.println(set.clone());
 		
 		System.out.println(set.isEmpty());
 		System.out.println("First Element = "+set.getFirst());
 		System.out.println("Last Element = "+set.getLast());
 		
        //Iterator makes the set to iterate through elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext())
		{
			System.out.println(itr.next());
		}


	}

}
