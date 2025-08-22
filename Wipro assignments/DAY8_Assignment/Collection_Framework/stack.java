package Collection_Framework;

import java.util.Stack;
import java.util.Scanner;
public class stack{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		Stack<Integer> n = new Stack<>(); 
		n.push(10);
		n.push(20);
		n.push(30);
		n.push(40);
		n.push(50);
		System.out.println("Stack after pushes: " + n); 
		System.out.println("Popped: " + n.pop());
		System.out.println("Stack after pop: " + n);
		System.out.println("Current top: " + n.peek()); 
		System.out.println("Is stack empty " + n.empty());
		System.out.print("\nEnter a string to reverse: ");
		String input = scanner.nextLine();
		Stack<Character> charStack = new Stack<>(); 
		for (char c : input.toCharArray()) { 
			charStack.push(c);
}
		StringBuilder reversed = new StringBuilder();
		while (!charStack.empty()) { 
			reversed.append(charStack.pop());
			} 
		System.out.println("Reversed string: " + reversed); 
		System.out.print("\nEnter an expression to check parentheses: "); 
		String expr = scanner.nextLine();
		System.out.println("Parentheses balanced " + isBalanced(expr)); 
		scanner.close(); }
	private static boolean isBalanced(String expr) { 
		Stack<Character> stack = new Stack<>(); 
		for (char c : expr.toCharArray()) { 
			if (c == '(') { stack.push(c); } 
			else if (c == ')') { 
				if (stack.empty()) return false; stack.pop();
				}
			}
		
		return stack.empty();
		}
	}