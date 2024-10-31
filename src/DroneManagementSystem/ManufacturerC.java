package DroneManagementSystem;

public class ManufacturerC implements Manufacturer{
    // Previously determined the specifications of the Drones in the Manufacturer concrete classes, it has been since changed to a functionality of the client (Test Class)
    @Override
    public SurveillanceDrone createSurveillanceDrone(int batteryCapacity, int Range, String Feature) {
        return null;
    }

    @Override
    public DeliveryDrone createDeliveryDrone(int batteryCapacity, int Range, String Feature) {
        return new DeliveryDrone(500,5000,"Drop");
    }

    @Override
    public AgriculturalDrone createAgriculturalDrone(int batteryCapacity, int Range, String Feature) {
        return null;
    }
}
