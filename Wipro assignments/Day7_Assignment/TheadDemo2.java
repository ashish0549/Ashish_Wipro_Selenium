package Day_7_Assignment;
//2. Create a thread by implementing the Runnable interface
class NameThread implements Runnable {
 public void run() {
     System.out.println("Current thread: " + Thread.currentThread().getName());
 }
}

class ThreadDemo2 {
 public static void main(String[] args) {
     NameThread task = new NameThread();
     Thread thread = new Thread(task);
     thread.start();
 }
}
