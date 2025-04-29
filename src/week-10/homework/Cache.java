package homework;

import java.util.concurrent.ConcurrentHashMap;

public class Cache {
    private final ConcurrentHashMap<String, String> cache = new ConcurrentHashMap<>();

    // add an antry to the cashe
    public void put(String key, String value) {
        System.out.println(Thread.currentThread().getName() + " putting: " + key + " -> " + value);
        cache.put(key, value);
    }
    // Retrieve an entry from the cache
    public String get(String key) {
        String value = cache.get(key);
        System.out.println(Thread.currentThread().getName() + " getting: " + key + " -> " + (value != null ? value : "null"));
        return value;
    }
    
}
