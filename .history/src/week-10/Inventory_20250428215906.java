import java.util.concurrent.locks.ReentrantLock;

public class Inventory {
    private int stock = 100;
    private final ReentrantLock lock = new ReentrantLock();

    public void addStock(int quantity) {
        lock.lock();
        try {
            stock += quantity;
System.out.println(Thread.currentThread().getName() + "
added stock. Current stock: " + stock);
} finally {
lock.unlock();
    
}
