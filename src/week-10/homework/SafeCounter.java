package homework;

import java.util.concurrent.locks.ReentrantLock;

public class SafeCounter {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
            System.out.println(Thread.currentThread().getName() + " successfully incremented. Current count: " + count);
        } finally {
            lock.unlock();
        }
    }

    public void decrement() {
        lock.lock();
        try {
            count--;
            System.out.println(Thread.currentThread().getName() + " successfully descremented. Current count: " + count);
        } finally {
            lock.unlock();
        }
    }
    // Method to get the current count value
    public int getValue() {
        lock.lock(); // Acquire the lock
        try {
            return count;
        } finally {
            lock.unlock(); // Release the lock
        }
    }
}

    

