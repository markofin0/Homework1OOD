package DroneManagementSystem;

public class AgriculturalDrone implements Drone{

    int batteryCapacity;
    int flightRange;
    String pesticide;

    // constructor
    public AgriculturalDrone (int batteryCapacity, int flightRange, String pesticide){
        this.batteryCapacity = batteryCapacity;
        this.flightRange = flightRange;
        this.pesticide = pesticide;
    }

    // implements the methods from the Drone interface
    @Override
    public int batteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public int flightRange() {
        return flightRange;
    }

    public String getPesticide() {
        return pesticide;
    }

    @Override
    public String displayDrone() {
        return "Battery Capacity: " + this.batteryCapacity() + "\n" + "Flight Range: " + this.flightRange() + "\n" + "Pesticide: " + pesticide;
    }

}
