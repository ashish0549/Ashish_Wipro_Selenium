package Collection_Framework;
import java.util.*;
//Unordered
//No Duplicate Elements allowed
//Store Null(only One Null allowed
//Elements stored on basis of a Hash code Value
public class Hash_Set {
	public static void main(String[] args) 
	{
		HashSet<String> set= new HashSet<String>();
		set.add("Maggi");
		set.add("Pizza");
		set.add("Ice Cream");
		set.add("Chocolate");
		set.add("Coco Cola");
		set.add(null);
		set.add(null);// Set does not allow multiple elements so only 1 null is printed 
 		System.out.println(set);
		
		
		System.out.println(set.clone());
		System.out.println(set.contains("Pasta"));
		set.remove("Ice Cream");
		System.out.println(set);
		set.clear();
		System.out.println(set);
		System.out.println(set.isEmpty());

		

	
	}
	

}
