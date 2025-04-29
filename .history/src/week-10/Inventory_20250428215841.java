import java.util.concurrent.locks.ReentrantLock;

public class Inventory {
    private int stock = 100;
    private final ReentrantLock lock = new ReentrantLock();
    
}
