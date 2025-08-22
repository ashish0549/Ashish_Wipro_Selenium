package Multi_Threading;
class BankAccount {
    int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + " Balance: " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw " + amount);
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> 
        {
            for (int i = 0; i < 3; i++) account.deposit(100);
        });

        Thread t2 = new Thread(() -> 
        {
            for (int i = 0; i < 5; i++) account.withdraw(70);
        });

        t1.start();
        t2.start();
    }
}
