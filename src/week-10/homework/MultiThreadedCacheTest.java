package homework;

public class MultiThreadedCacheTest {
    public static void main(String[] args) {
        Cache cache = new Cache();
        // Writer thread to add entries to the cache
        Runnable writer = () -> {
            for (int i = 0; i < 5; i++) {
                String key = "Key-" + i;
                String value = "Value-" + i;
                cache.put(key, value);
                try {
                    Thread.sleep(100); // Simulate delay
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        // Reader thread to retrieve entries from the cache
        Runnable reader = () -> {
            for (int i = 0; i < 5; i++) {
                String key = "Key-" + i;
                cache.get(key);
                try {
                    Thread.sleep(50); // Simulate delay
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        // Start multiple writer and reader threads
        Thread writer1 = new Thread(writer, "Writer-1");
        Thread writer2 = new Thread(writer, "Writer-2");
        Thread reader1 = new Thread(reader, "Reader-1");
        Thread reader2 = new Thread(reader, "Reader-2");
        writer1.start();
        writer2.start();
        reader1.start();
        reader2.start();
        // Wait for all threads to finish
        try { 
            writer1.join();
            writer2.join();
            reader1.join();
            reader2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Cache operations completed.");
    }
}
        
