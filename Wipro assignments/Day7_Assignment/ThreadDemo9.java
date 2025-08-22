package Day_7_Assignment;

//9. Stop a thread using a boolean flag
class StoppableThread extends Thread {
 private boolean running = true;
 
 public void run() {
     int count = 1;
     while(running) {
         System.out.println("Count: " + count++);
         try {
             Thread.sleep(500);
         } catch(InterruptedException e) {
             System.out.println("Thread interrupted");
         }
     }
     System.out.println("Thread stopped");
 }
 
 public void stopThread() {
     running = false;
 }
}

class ThreadDemo9 {
 public static void main(String[] args) {
     StoppableThread thread = new StoppableThread();
     thread.start();
     
     try {
         Thread.sleep(2000);
     } catch(InterruptedException e) {
         System.out.println("Main interrupted");
     }
     
     thread.stopThread();
 }
}
