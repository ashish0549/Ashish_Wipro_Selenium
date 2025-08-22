package Exceptions_practise;

public class Test_1 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			int[] a=new int[4];
			System.out.println(a[6]);//ArrayIndexOutOfBoundsException
			System.out.println(5/0);//ArithmeticException
			
			String str="Hello";
			System.out.println(str.charAt(6));//StringIndexOutOfBoundsException
			}
		catch(ArithmeticException e) 
		{
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e) 
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e);
		}
		
	    System.out.println(4);
	    System.out.println(5);
	}
	
}
