/*
Objective: Safely update shared inventory using a ReentrantLock.
1. Use a ReentrantLock to ensure thread-safe access to inventory.
2. Simulate inventory updates by multiple threads

public class ReentrantLockExample {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Runnable addTask = () -> inventory.addStock(10);
        Runnable removeTask = () -> inventory.removeStock(5);
        Thread t1 = new Thread(addTask);
        Thread t2 = new Thread(removeTask);
        Thread t3 = new Thread(removeTask);

        t1.start();
        t2.start();
        t3.start();
        
    }
}
