package Collection_Framework;
import java.util.*;
//Deque Follows FIFO
//Duplicate Elements Allowed
//No Null is allowed
//Elements stored on the basis of Hash Value


import java.util.ArrayDeque;
public class ArrayDeque_Demo {
	public static void main(String[] args) 
	{
		ArrayDeque<String> q= new ArrayDeque<String>();
		q.add("Apple");
		q.add("Watermelon");
		q.add("Mango");
		q.add("Kiwi");
		q.add("Banana");		
		System.out.println(q);
		System.out.println(q.getFirst());
		System.out.println(q.getLast());
		q.offer("PineApple");
		System.out.println(q);
		q.offerFirst("MuskMelon");
		q.offerLast("Grapes");
		System.out.println(q);
		System.out.println("Peeking : "+q.peek());
		q.poll();
		System.out.println("Removing Head of ArrayDeque : "+q);
		q.poll();
		System.out.println("Removing Head of ArrayDeque : "+q);
	}

}
