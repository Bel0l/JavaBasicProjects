
abstract class Vehicle {
    private String vehicleType;
    private int regNo;

    Vehicle(String vehicleType, int regNo) {
        this.vehicleType = vehicleType;
        this.regNo = regNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getRegNo() {
        return regNo;
    }

    abstract int parkingSlotsAvailable(int slots);

    abstract void park();
}
