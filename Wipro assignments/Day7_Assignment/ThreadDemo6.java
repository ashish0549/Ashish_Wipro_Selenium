package Day_7_Assignment;

//6. Two threads print even and odd numbers
class EvenThread extends Thread {
 public void run() {
     for(int i = 2; i <= 10; i += 2) {
         System.out.println("Even: " + i);
     }
 }
}

class OddThread extends Thread {
 public void run() {
     for(int i = 1; i <= 9; i += 2) {
         System.out.println("Odd: " + i);
     }
 }
}

class ThreadDemo6 {
 public static void main(String[] args) {
     EvenThread evenThread = new EvenThread();
     OddThread oddThread = new OddThread();
     
     evenThread.start();
     oddThread.start();
 }
}