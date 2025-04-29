package homework;

import java.util.concurrent.locks.ReentrantLock;

public class SafeCounter {
    private int count;
    private final ReentrantLock lock = new ReentrantLock();

    public void increment(int count) {
        lock.lock();
        try {
            count += count;
            System.out.println(Thread.currentThread().getName() + " successfully incremented. Current count: " + count);
        } finally {
            lock.unlock();
        }
    }

    public void 
}
    

