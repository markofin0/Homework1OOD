package DroneManagementSystem;

public class DeliveryDrone implements Drone{

    int batteryCapacity;
    int flightRange;
    String payloadMechanic;

    // constructor
    public DeliveryDrone (int batteryCapacity, int flightRange, String payloadMechanic){
        this.batteryCapacity = batteryCapacity;
        this.flightRange = flightRange;
        this.payloadMechanic = payloadMechanic;
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

    public String getPayloadMechanic() {
        return payloadMechanic;
    }

    @Override
    public String displayDrone() {
        return "Battery Capacity: " + this.batteryCapacity() + "\n" + "Flight Range: " + this.flightRange() + "\n" + "Payload Mechanic: " + payloadMechanic;
    }

}
