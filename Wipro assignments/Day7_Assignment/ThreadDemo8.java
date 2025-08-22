package Day_7_Assignment;
//8. Demonstrate Thread.join()
class JoinThread extends Thread {
 String name;
 
 JoinThread(String name) {
     this.name = name;
 }
 
 public void run() {
     for(int i = 1; i <= 3; i++) {
         System.out.println(name + ": " + i);
         try {
             Thread.sleep(500);
         } catch(InterruptedException e) {
             System.out.println("Interrupted");
         }
     }
 }
}

class ThreadDemo8 {
 public static void main(String[] args) {
     JoinThread t1 = new JoinThread("First");
     JoinThread t2 = new JoinThread("Second");
     
     t1.start();
     
     try {
         t1.join();
     } catch(InterruptedException e) {
         System.out.println("Main interrupted");
     }
     
     t2.start();
     System.out.println("Main thread finished");
 }
}
