package DroneManagementSystem;

public class ManufacturerB implements Manufacturer{

    // implements the methods from the Manufacturer interface
    // Previously determined the specifications of the Drones in the Manufacturer concrete classes, it has been since changed to a functionality of the client (Test Class)
    @Override
    public SurveillanceDrone createSurveillanceDrone(int batteryCapacity, int Range, String Feature) {
        return new SurveillanceDrone(batteryCapacity, Range, Feature);
    }

    @Override
    public DeliveryDrone createDeliveryDrone(int batteryCapacity, int Range, String Feature) {
        return new DeliveryDrone(batteryCapacity, Range, Feature);
    }

    @Override
    public AgriculturalDrone createAgriculturalDrone(int batteryCapacity, int Range, String Feature) {
        return new AgriculturalDrone(batteryCapacity, Range, Feature);
    }
}
