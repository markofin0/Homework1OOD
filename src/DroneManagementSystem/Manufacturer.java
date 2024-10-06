package DroneManagementSystem;

public interface Manufacturer {

    // methods to be implemented by the Manufacturer classes
    SurveillanceDrone createSurveillanceDrone();
    DeliveryDrone createDeliveryDrone();
    AgriculturalDrone createAgriculturalDrone();

}
