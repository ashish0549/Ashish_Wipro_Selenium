package Collection_Framework;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
public class Vector_practise {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Orange");
		v.add("Blue");
		v.add("White");
		v.add("Black");
		v.add(4, "Gray");
		v.add(null);
		v.add("Black");
		
		System.out.println(v);
		System.out.println(v.indexOf("Black"));
		System.out.println(v.subList(0, 3));
		System.out.println(v.contains("Purple"));
		System.out.println(v.equals("Purple"));// Checks if Entire List is equal to that value we passed
		System.out.println(v.getFirst());
		System.out.println(v.getLast());
		v.add("Purple");
		System.out.println(v.getLast());
		System.out.println(v.indexOf("Gray"));
		System.out.println(v.isEmpty());
		v.remove(0);
		System.out.println(v);
		v.remove("Purple");
		System.out.println(v);
		System.out.println(v.reversed());
		
		
		
		List<String> AL = new ArrayList<>(v);
		System.out.println(AL);
		
		LinkedList<String> LL = new LinkedList<>(v);
		System.out.println(LL);
		
 
	}
 
}
