package Day_7_Assignment;

//7. Three threads with different priorities
class PriorityThread extends Thread {
 String threadName;
 
 PriorityThread(String name) {
     this.threadName = name;
 }
 
 public void run() {
     for(int i = 1; i <= 3; i++) {
         System.out.println(threadName + ": " + i);
     }
 }
}

class ThreadDemo7 {
 public static void main(String[] args) {
     PriorityThread t1 = new PriorityThread("High");
     PriorityThread t2 = new PriorityThread("Medium");
     PriorityThread t3 = new PriorityThread("Low");
     
     t1.setPriority(Thread.MAX_PRIORITY);
     t2.setPriority(Thread.NORM_PRIORITY);
     t3.setPriority(Thread.MIN_PRIORITY);
     
     t1.start();
     t2.start();
     t3.start();
 }
}

