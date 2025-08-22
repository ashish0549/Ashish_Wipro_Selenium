package TypeCasting_Demo;

class parent
	{
	  void show() 
	  {
	
	    System.out.println("Hello");
	  }
	
	}
class child extends parent
	{
	
	void display() 
	{
	  System.out.println ("Welcome");
	}
	void show()
	
	{
	   System.out.println("How are you?");
	}
	}
class grandchild extends child
	{
	
	void display() 
	{
	  System.out.println ("Good Morning");
	}
	void show()
	
	{
	   System.out.println("Have a nice day");
	}
	}
public class TestDemo {
	
	public static void main (String[] args) 
	{
	  parent p=new parent();
	  p.show();
	  parent pp=new child();//upcasting
	  pp.show();
	  child c=(child)pp;//downcasting
	  c.display();
	  c.show();
	  grandchild gc=(grandchild)c;
	  gc.show();
	}
	
}
    
