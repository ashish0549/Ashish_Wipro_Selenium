package Multi_Threading;


class Table {

     // Synchronized method
     synchronized void printTable(int n) 
     {
    	 for (int i = 1; i <= 10; i++){
    		 System.out.println(n* i);
             try {
                    Thread. sleep (400);
                 } 
             catch(Exception e) {System.out.println(e);}
            }
     }

class MyThread1 extends Thread {
	Table t;
    MyThread1 (Table t) {
    this.t = t;
    }
    public void run() 
    {
        t.printTable(1);// prints table of 5
        }
}


class MyThread2 extends Thread{
     Table t;
     MyThread2(Table t) {
     this.t = t;
   }
     public void run() {
     t.printTable(5); // prints table of 100
    }
 }

public class Synchronization_Thread {
	public static void main(String[] args) {
		Table obj = new Table(); //Only one object
		MyThread1 t1 = new MyThread1(obj);
				
	}
}

}
