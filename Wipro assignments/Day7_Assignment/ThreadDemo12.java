package Day_7_Assignment;
//12. Synchronized block
class BlockCounter {
 int count = 0;
 Object lock = new Object();
 
 void increment() {
     synchronized(lock) {
         count++;
     }
 }
 
 int getCount() {
     return count;
 }
}

class BlockThread extends Thread {
 BlockCounter counter;
 
 BlockThread(BlockCounter counter) {
     this.counter = counter;
 }
 
 public void run() {
     for(int i = 0; i < 1000; i++) {
         counter.increment();
     }
 }
}

class ThreadDemo12 {
 public static void main(String[] args) {
     BlockCounter counter = new BlockCounter();
     
     BlockThread t1 = new BlockThread(counter);
     BlockThread t2 = new BlockThread(counter);
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

