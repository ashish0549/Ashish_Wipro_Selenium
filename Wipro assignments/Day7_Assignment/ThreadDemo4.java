package Day_7_Assignment;
//4. Demonstrate Thread.sleep()
class SleepThread extends Thread {
 public void run() {
     for(int i = 1; i <= 3; i++) {
         System.out.println("Count: " + i);
         try {
             Thread.sleep(1000);
         } catch(InterruptedException e) {
             System.out.println("Thread interrupted");
         }
     }
 }
}

class ThreadDemo4 {
 public static void main(String[] args) {
     SleepThread thread = new SleepThread();
     thread.start();
 }
}

