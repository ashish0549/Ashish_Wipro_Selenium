package Day_7_Assignment;
//5. Use Thread.yield()
class YieldThread extends Thread {
 String threadName;
 
 YieldThread(String name) {
     this.threadName = name;
 }
 
 public void run() {
     for(int i = 1; i <= 3; i++) {
         System.out.println(threadName + ": " + i);
         Thread.yield();
     }
 }
}

class ThreadDemo5 {
 public static void main(String[] args) {
     YieldThread t1 = new YieldThread("Thread-1");
     YieldThread t2 = new YieldThread("Thread-2");
     
     t1.start();
     t2.start();
 }
}

