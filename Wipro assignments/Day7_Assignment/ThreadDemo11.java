package Day_7_Assignment;

//11. Solve race condition using synchronized keyword
class SyncCounter {
 int count = 0;
 
 synchronized void increment() {
     count++;
 }
 
 int getCount() {
     return count;
 }
}

class SyncCounterThread extends Thread {
 SyncCounter counter;
 
 SyncCounterThread(SyncCounter counter) {
     this.counter = counter;
 }
 
 public void run() {
     for(int i = 0; i < 1000; i++) {
         counter.increment();
     }
 }
}

class ThreadDemo11 {
 public static void main(String[] args) {
     SyncCounter counter = new SyncCounter();
     
     SyncCounterThread t1 = new SyncCounterThread(counter);
     SyncCounterThread t2 = new SyncCounterThread(counter);
     
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
