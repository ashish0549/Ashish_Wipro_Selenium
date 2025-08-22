package Multi_Threading;

class myrun1 implements Runnable {
	
public void run()
{
	for(int i=1;i<=5;i++)
	{
	System.out.println("Hello");
	}
	System.out.println("Current thread name = "+Thread.currentThread().getName());
}
}

public class myrun {

	public static void main (String[] args) {
		myrun1 t=new myrun1(); //runnable interface child class object(Runnable state)
	    Thread t1=new Thread(t);
	    Thread t2=new Thread(t);
	    t1.start();
	    t2.start();
	    
	    
	    
	   //Constructor for thread
	   //Thread()
	   //Thread(Runnable state)
	   //Thread(Thread name) 
	   // Thread(Runnable state, Thread name)
	
	}
}	
