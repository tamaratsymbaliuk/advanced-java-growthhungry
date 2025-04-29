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
            System.out.println(car + " got a ")

        } catch () {

        }

    }
    
}
