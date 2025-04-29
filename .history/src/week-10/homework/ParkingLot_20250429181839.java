package homework;

import java.util.concurrent.Semaphore;

public class ParkingLot {
    private final Semaphore spots;

    public ParkingLot(int spots) {
        this.spots = new Semaphore(spots);
    }

    public void parkCar(String car) {
        try {
            System.out.println(car + " is waiting for a parking spot");
            spots.acquire();
            System.out.println(car + " got a spot");
            Thread.sleep((long) (Math.random() * 5000)); // Simulate parking duration
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            spots.release();
            System.out.println(car + " left the parking lot");
        }
    }
    
}
