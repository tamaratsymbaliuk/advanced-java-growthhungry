package homework;

public class SafeCounterTest {
    public static void main(String[] args) {
        SafeCounter counter = new SafeCounter();

        // Create multiple threads to increment and decrement the counter
        Thread incrementThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        Thread decrementThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
            }
        });

        // Start the threads
        incrementThread.start();
        decrementThread.start();
        // Wait for both threads to finish
        try {
            incrementThread.join();
            decrementThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        }
        // Print the final counter value
        System.out.println("Final Counter Value: " + counter.getValue());
    }
}
