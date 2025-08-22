package Collection_Framework;
import java.util.*;
//Indexed access(get elements only index)
//Allows duplicates
//maintains insertion order
//supports null elements

public class List_demo {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add(0,"Apple");
		list.add(1,"Mango");
		list.add(2,"Kiwi");
		list.add(3,"Orange");
		System.out.println(list);
		System.out.println(list.get(3));//Gets an elements at particular index
		list.set(2,"Avacado");// replace an element at an index
		System.out.println(list);
		
		list.add(3,"Kiwi");// add an element at particular index and move the next element by 1 index 
		System.out.println(list);
		
		System.out.println(list.contains("Kiwi"));
		System.out.println(list.equals("Kiwi"));// Checks if Entire List is equal to that value we passed
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.indexOf("Kiwi"));
		System.out.println(list.isEmpty());
		list.remove(0);
		System.out.println(list);
		list.remove("Kiwi");
		System.out.println(list);
		System.out.println(list.reversed());
		
	/*	
		//Using Iterator
		Iterator<String> itr=list.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Using ListIterator
		Iterator<String> itrs=list.iterator();
		while (itrs.hasNext())
		{
			System.out.println(itrs.next());
		}  
	*/
		

	}
	

}
