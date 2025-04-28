/*
Objective: Implement a producer-consumer system using a BlockingQueue.
1. Use a BlockingQueue to store orders.
2. Implement a producer thread to add orders to the queue.
3. Implement a consumer thread to process orders from the queue.
*/

public class BlockingQueueExample {
    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 20; i++) {
                processor.placeOrder("Order-" + i);
                try {
                    Thread.sleep(500); // Simulate order placement delay
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread consumer = new Thread(processor::processOrder);
        producer.start();
        consumer.start();
        
    }
}
