package Day_7_Assignment;
//1. Create a thread by extending the Thread class
class NumberThread extends Thread {
 public void run() {
     for(int i = 1; i <= 5; i++) {
         System.out.println("Number: " + i);
     }
 }
}

class ThreadDemo1 {
 public static void main(String[] args) {
     NumberThread thread = new NumberThread();
     thread.start();
 }
}


