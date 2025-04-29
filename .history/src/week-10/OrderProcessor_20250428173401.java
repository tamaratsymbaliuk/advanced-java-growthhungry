import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class OrderProcessor {
    private final BlockingQueue<String> orderQueue = new ArrayBlockingQueue<>(10);

    public void placeOrder(String order) {
        try {
            orderQueue.put(order); // add order to the queue
            System.out.println("Placed order: " + order);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void processOrder() {
        try {
            while (true) {
                String order = orderQueue.take(); // Process order from the queue
                System.out.println("Processing order: " + order);
                Thread.sleep(1000); // Simulate processing time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();

    }
    
}
