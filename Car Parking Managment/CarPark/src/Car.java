//class Car extends Vehicle {
//    private String model;
//
//    Car(String vehicleType, int regNo, String model) {
//        super(vehicleType, regNo);
//        this.model = model;
//    }
//
//    // Implementing the abstract method
//    @Override
//    int parkingSlotsAvailable(int slots, int carParked) {
//
//        slots = 10;
//
//        // Check available parking slots
//        if (carParked >= slots) {
//            System.out.println("There is no space available.");
//            return slots;
//        } else {
//            int availableSlots = slots - carParked;
//            System.out.println("Available slots: " + availableSlots);
//            return availableSlots;
//        }
//    }
//
//
//    public void displayCarModel() {
//        System.out.println("Car Model: " + model);
//    }
//}




import java.util.LinkedList;
import java.util.Queue;

class Car extends Vehicle {
    private String model;
    private static Queue<Car> waitingQueue = new LinkedList<>();
    private static int totalSlots = 10;
    private static int parkedCarsCount = 0;
    private long parkingTime;

    Car(String vehicleType, int regNo, String model) {
        super(vehicleType, regNo);
        this.model = model;
    }

    @Override
    int parkingSlotsAvailable(int slots) {
        int availableSlots = totalSlots - parkedCarsCount;
        System.out.println("Available slots for cars: + availableSlots");
        return availableSlots;
    }

    @Override
    void park() {
        if (parkedCarsCount < totalSlots) {
            parkedCarsCount++;
            parkingTime = System.currentTimeMillis();
            System.out.println("Car parked successfully: " + model);
        } else {
            waitingQueue.add(this);
            System.out.println("No parking space available " + model + " added to waiting queue. ");
        }
    }
    public void removeCar(){
        if (parkedCarsCount > 0){
            long parkedDuration = (System.currentTimeMillis() - parkingTime ) / 1000;
            int charges = (int) parkedDuration; // charged 1$ per second
            parkedCarsCount --;
            System.out.println("Car removed successfully: " + model + " Registration No " + getRegNo()+ ". Invoice amount: $" + charges);

            if (!waitingQueue.isEmpty()){
                Car nextCar = waitingQueue.poll(); // parking first car from the queuee
                nextCar.park();
            }
        }
        else {
            System.out.println(" No Cars to remove");
        }
    }
}


