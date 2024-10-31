package DroneManagementSystem;

public interface Manufacturer {


    // methods to be implemented by the Manufacturer classes
    // now requires the parameters for Drone creation to give the client more control and allows for more customization and extensibility
    SurveillanceDrone createSurveillanceDrone(int batteryCapacity, int Range, String Feature);
    DeliveryDrone createDeliveryDrone(int batteryCapacity, int Range, String Feature);
    AgriculturalDrone createAgriculturalDrone(int batteryCapacity, int Range, String Feature);

}
