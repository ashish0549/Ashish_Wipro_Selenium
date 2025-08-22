package Collection_Framework;
import java.util.Stack;
public class Stack_demo {
	public static void main(String[] args) 
	{
		Stack<Integer> s= new Stack<Integer>();
		s.push(2);
		s.push(8);
		s.push(9);
		s.push(3);
		s.push(5);
		s.push(10);
		System.out.println(s);
		s.pop(); // Removes last element from the Stack
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());// to peek at the last element (i.e 3)
		
		
		
		
	}

}
