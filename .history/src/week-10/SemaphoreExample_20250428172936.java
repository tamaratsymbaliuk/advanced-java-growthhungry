/*
Objective: Limit the number of customers that can be seated simultaneously.
1. Create a Semaphore with a fixed number of permits (e.g., 5 seats).
2. Use threads to simulate customers trying to access a seat.
3. If no seat is available, the customer thread should wait.

public class SemaphoreExample {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(5); // 5 seats available

        for (int i = 1; i <= 10; i++) {
            String customer = "Customer-" + i;
            new Thread(() -> restaurant.enterRestaurant(customer)).start();
        }
    }
    
}
