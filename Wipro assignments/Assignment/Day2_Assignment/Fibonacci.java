package Day_2_Assignment;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 10; 
        int first = 1, second = 2;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            
            int next = first + second;
            first = second;
            second = next;
        }
    }
}