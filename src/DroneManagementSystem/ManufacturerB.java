package DroneManagementSystem;

public class ManufacturerB implements Manufacturer{

    // implements the methods from the Manufacturer interface
    @Override
    public SurveillanceDrone createSurveillanceDrone() {
        return new SurveillanceDrone(1500, 150, "8K Sony");
    }

    @Override
    public DeliveryDrone createDeliveryDrone() {
        return new DeliveryDrone(2500, 250, "eBay Air");
    }

    @Override
    public AgriculturalDrone createAgriculturalDrone() {
        return new AgriculturalDrone(3500, 350, "Insecticide");
    }
}
