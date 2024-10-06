package DroneManagementSystem;

public class ManufacturerA implements Manufacturer {

    // implements the methods from the Manufacturer interface
    @Override
    public SurveillanceDrone createSurveillanceDrone() {
        return new SurveillanceDrone(800, 100, "4K Sony");
    }

    @Override
    public DeliveryDrone createDeliveryDrone() {
        return new DeliveryDrone(1800, 200, "Amazon");
    }

    @Override
    public AgriculturalDrone createAgriculturalDrone() {
        return new AgriculturalDrone(2500, 300, "Fungicide");
    }
}
