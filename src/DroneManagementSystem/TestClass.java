package DroneManagementSystem;

public class TestClass {
    public static void main(String[] args) {

        // Creates instances of ManufacturerA and ManufacturerB
        ManufacturerA manufacturerA = new ManufacturerA();
        ManufacturerB manufacturerB = new ManufacturerB();

        // Creates instances of the drones from ManufacturerA
        AgriculturalDrone agriculturalDrone = manufacturerA.createAgriculturalDrone();
        DeliveryDrone deliveryDrone = manufacturerA.createDeliveryDrone();
        SurveillanceDrone surveillanceDrone = manufacturerA.createSurveillanceDrone();

        // Displays the drones from ManufacturerA
        System.out.println(agriculturalDrone.displayDrone());
        System.out.println(deliveryDrone.displayDrone());
        System.out.println(surveillanceDrone.displayDrone());

        // Creates instances of the drones from ManufacturerB
        agriculturalDrone = manufacturerB.createAgriculturalDrone();
        deliveryDrone = manufacturerB.createDeliveryDrone();
        surveillanceDrone = manufacturerB.createSurveillanceDrone();

        // Displays the drones from ManufacturerB
        System.out.println(agriculturalDrone.displayDrone());
        System.out.println(deliveryDrone.displayDrone());
        System.out.println(surveillanceDrone.displayDrone());

    }
}
