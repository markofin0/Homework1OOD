package DroneManagementSystem;

public class SurveillanceDrone implements Drone{

    int batteryCapacity;
    int flightRange;
    String camera;

    // constructor
    public SurveillanceDrone (int batteryCapacity, int flightRange, String camera){
        this.batteryCapacity = batteryCapacity;
        this.flightRange = flightRange;
        this.camera = camera;
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

    public String getCamera() {
        return camera;
    }

    @Override
    public String displayDrone() {
        return "Battery Capacity: " + this.batteryCapacity() + "\n" + "Flight Range: " + this.flightRange() + "\n" + "Camera: " + camera;
    }

}
