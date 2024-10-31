import java.util.LinkedList;
import java.util.Queue;

class Bike extends Vehicle {
    private String model;
    private static Queue<Bike> waitingQueue = new LinkedList<>();
    private static int totalSlots = 5;
    private static int parkedBikesCount = 0; // Count of parked bikes
    private long parkingTime; // Time when the bike was parked


    Bike(String vehicleType, int regNo, String model) {
        super(vehicleType, regNo);
        this.model = model;
    }


    @Override
    int parkingSlotsAvailable(int slots) {
        int availableSlots = totalSlots - parkedBikesCount;
        System.out.println("Available slots for bikes: " + availableSlots);
        return availableSlots;
    }


    @Override
    void park() {
        if (parkedBikesCount < totalSlots) {
            parkedBikesCount++;
            parkingTime = System.currentTimeMillis();
            System.out.println("Bike parked successfully: " + model);
        } else {

            waitingQueue.add(this);
            System.out.println("No parking space available. " + model + " added to waiting queue.");
        }
    }


    public void removeBike() {
        if (parkedBikesCount > 0) {
            long parkedDuration = (System.currentTimeMillis() - parkingTime) / 1000;
            int charges = (int) parkedDuration;
            parkedBikesCount--;
            System.out.println("Bike removed successfully: " + model + " Registration No " + getRegNo() + ". Invoice amount: $" + charges);

            if (!waitingQueue.isEmpty()) {
                Bike nextBike = waitingQueue.poll();
                nextBike.park();
            }
        } else {
            System.out.println("No bikes to remove.");
        }
    }
}
