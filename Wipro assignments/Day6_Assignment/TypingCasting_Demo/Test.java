package TypeCasting_Demo;


public class Test {
public static void main(String[] args) 
  {
	//Widening 
	int num= 12;
	System.out.println("Value of the num = "+num);
	float d=num;
	System.out.println("Value of the d = "+d);

	//Narrowing
	float g= 13.8f;
	System.out.println("Value of the g = "+g);
    int num2 = (int)g;
	System.out.println("Value of the num2 = "+num2);
	
  }
}
