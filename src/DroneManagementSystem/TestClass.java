package DroneManagementSystem;

public class TestClass {
    public static void main(String[] args) {

        // Creates instances of ManufacturerA and ManufacturerB
        ManufacturerA manufacturerA = new ManufacturerA();
        ManufacturerB manufacturerB = new ManufacturerB();
        ManufacturerC manufacturerC = new ManufacturerC();

        // Creates instances of the drones from ManufacturerA
        AgriculturalDrone agriculturalDrone = manufacturerA.createAgriculturalDrone(500, 5000, "Pesticide");
        DeliveryDrone deliveryDrone = manufacturerA.createDeliveryDrone(700, 10000, "Homing Packages");
        SurveillanceDrone surveillanceDrone = manufacturerA.createSurveillanceDrone(1000, 20000, "UV Light");

        // Displays the drones from ManufacturerA
        System.out.println(agriculturalDrone.displayDrone());
        System.out.println(deliveryDrone.displayDrone());
        System.out.println(surveillanceDrone.displayDrone());

        // Creates instances of the drones from ManufacturerB
        agriculturalDrone = manufacturerB.createAgriculturalDrone(600, 6000, "Fungicide");
        deliveryDrone = manufacturerB.createDeliveryDrone(700, 10000, "1 Day Shipping Speed");
        surveillanceDrone = manufacturerB.createSurveillanceDrone(900, 12000, "Microphone");

        // Displays the drones from ManufacturerB
        System.out.println(agriculturalDrone.displayDrone());
        System.out.println(deliveryDrone.displayDrone());
        System.out.println(surveillanceDrone.displayDrone());

        deliveryDrone = manufacturerC.createDeliveryDrone(700, 10000, "Drop");

        System.out.println(deliveryDrone.displayDrone());

    }
}
