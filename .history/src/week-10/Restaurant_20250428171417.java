import java.util.concurrent.Semaphore;

public class Restaurant {
    private final Semaphore seats;

    public Restaurant(int seatCount) {
        this.seats = new Semaphore(seatCount);
    }
    
    public void enterRestaurant(String customer) {
        try {
            
        }
    }
}
