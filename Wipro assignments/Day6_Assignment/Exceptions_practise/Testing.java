package Exceptions_practise;

public class Testing {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3/0);
		}
		catch(ArithmeticException e) 
		{
			System.out.println(e);
		}
	    System.out.println(4);
	    System.out.println(5);
	}
	
}
//simply "Exception e" can aslo be used as it is a super class of all exceptions