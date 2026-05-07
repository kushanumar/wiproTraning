package Day9.Assigment;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private double balance;
    private final Lock lock = new ReentrantLock();

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". Balance: " + balance);
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". Balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " failed to withdraw " + amount + " (Insufficient funds).");
            }
        } finally {
            lock.unlock();
        }
    }
}

public class Que3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Runnable depositTask = () -> {
            for (int i = 0; i < 3; i++) account.deposit(200);
        };

        Runnable withdrawTask = () -> {
            for (int i = 0; i < 3; i++) account.withdraw(500);
        };

        Thread t1 = new Thread(depositTask, "ATM-1");
        Thread t2 = new Thread(withdrawTask, "Mobile-App");
        Thread t3 = new Thread(withdrawTask, "Online-Web");

        t1.start();
        t2.start();
        t3.start();
    }
}
