package Collection_Framework;

//Tree set Follows Increasing(Alphabetical order)
//No Duplicate Elements allowed
//No Null is Allowed
//Elements stored on basis of a Hash code Value
import java.util.Iterator;
import java.util.TreeSet;

public class Tree_set {

	public static void main(String[] args) {
		TreeSet<String> set= new TreeSet<String>();
		set.add("Maggi");
		set.add("Pizza");
		set.add("Ice Cream");
		set.add("Chocolate");
		set.add("Coco Cola");
		System.out.println(set);
		
		System.out.println(set.contains("Pizza"));
		System.out.println(set.clone());
		
		System.out.println(set.ceiling("Maggi"));// if given not present : null
		System.out.println(set.floor("Pepsi"));// Print perivous of the Given value
		System.out.println(set.floor("Zebra"));// based on their value given 
		
		System.out.println(set.higher("Maggi"));
		System.out.println(set.lower("Maggi"));
		set.pollFirst();
		System.out.println(set);
		set.pollLast();
		System.out.println(set);
/*		
      //Iterator makes the set to iterate through elements
      Iterator<String> itr = set.iterator();
      while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
*/

	}

}