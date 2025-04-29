package homework;

public class ParkingLotSimulation {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(5);

        // Simulating 10 cars trying to park
for (int i = 1; i <= 10; i++) {
String carName = "Car-" + i;
new Thread(() -> parkingLot.parkCar(carName)).start();
}
}
}
    }
    
}
