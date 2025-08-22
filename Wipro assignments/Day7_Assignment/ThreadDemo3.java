package Day_7_Assignment;
//3. Create two threads, each printing a different message 5 times
class MessageThread extends Thread {
 String message;
 
 MessageThread(String message) {
     this.message = message;
 }
 
 public void run() {
     for(int i = 1; i <= 5; i++) {
         System.out.println(message + " - " + i);
     }
 }
}

class ThreadDemo3 {
    public static void main(String[] args) {
        MessageThread thread1 = new MessageThread("Hello");
        MessageThread thread2 = new MessageThread("World");
        
        thread1.start();
        thread2.start();
    }
}

