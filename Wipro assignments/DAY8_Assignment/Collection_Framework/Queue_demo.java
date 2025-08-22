package Collection_Framework;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_demo {
	public static void main(String[] args) 
	{
		Queue<String> q= new PriorityQueue<String>();
		q.add("Apple");
		q.add("Watermelon");
		q.add("Mango");
		q.add("Kiwi");
		q.add("Banana");
		
		
		System.out.println(q);
		System.out.println("Removing Element : "+q.element());
        q.offer("Pine Apple");
        System.out.println(q);
        System.out.println("Peeking :"+q.peek());
        q.poll();// Removes Apple as According to the Alphabetical order
        System.out.println("Removing Head of Queue : "+q);
        q.poll();//Removes Banana as According to the Alphabetical order 
        System.out.println("Removing Head of Queue : "+q);
        q.remove("Kiwi");
        System.out.println(q);
		
		
		
	}
}
