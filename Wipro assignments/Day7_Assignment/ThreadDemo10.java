package Day_7_Assignment;
//10. Multiple threads access shared counter without synchronization
class Counter {
 int count = 0;
 
 void increment() {
     count++;
 }
 
 int getCount() {
     return count;
 }
}

class CounterThread extends Thread {
 Counter counter;
 
 CounterThread(Counter counter) {
     this.counter = counter;
 }
 
 public void run() {
     for(int i = 0; i < 1000; i++) {
         counter.increment();
     }
 }
}

class ThreadDemo10 {
 public static void main(String[] args) {
     Counter counter = new Counter();
     
     CounterThread t1 = new CounterThread(counter);
     CounterThread t2 = new CounterThread(counter);
     
     t1.start();
     t2.start();
     
     try {
         t1.join();
         t2.join();
     } catch(InterruptedException e) {
         System.out.println("Interrupted");
     }
     
     System.out.println("Final count: " + counter.getCount());
 }
}


