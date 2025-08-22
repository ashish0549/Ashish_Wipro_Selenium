
//show how to stop a thread using boolean flag like if true or false

package Multi_Threading;
class MyTask implements Runnable {
 
    private volatile boolean keepRunning = true;
    public void run() {
        System.out.println("Thread started.");

        while (keepRunning) {
            System.out.println("Thread is working...");
            try {
                Thread.sleep(500);  
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
                System.out.println("Thread interrupted.");
            }
        }

        System.out.println("Thread has stopped.");
    }
    
    public void stop() {
        keepRunning = false;
    }
}
public class Stop_ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
        MyTask task = new MyTask();
        Thread thread = new Thread(task);

        thread.start();  // Start the thread

        // Let it run for 3 seconds
        Thread.sleep(3000);

        // Set flag to false to stop the thread
        System.out.println("Requesting thread to stop...");
        task.stop();

        // Wait for the thread to finish
        thread.join();

        System.out.println("Main thread exiting.");
    }
}



