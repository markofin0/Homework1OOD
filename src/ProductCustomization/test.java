package ProductCustomization;

public class test {
    public static void main(String[] args) {

        // reads devices from a CSV file and prints them
        CSVAdaptor csvAdaptor = new CSVAdaptor();
        csvAdaptor.readDevicesFromCSV("src/ProductCustomization/Sample CSV.csv");
        System.out.println("Devices:");
        for (Device device : csvAdaptor.devices) {
            System.out.println(device.toString());
        }

        // makes a new laptop builder and builds a laptop
        LaptopBuilder laptopBuilder = new Laptop();
        laptopBuilder.buildName("Laptop");
        laptopBuilder.buildProcessor("Intel Core i7");
        laptopBuilder.buildRam("16GB");
        laptopBuilder.buildStorage("512GB SSD");
        laptopBuilder.buildGpu("NVIDIA GeForce RTX 3060");
        laptopBuilder.buildOs("Windows 10");
        Laptop laptop2 = laptopBuilder.getLaptop();
        System.out.println(laptop2.toString());

        // makes a new device builder and builds a device
        DeviceBuilder deviceBuilder = new Device();
        deviceBuilder.buildName("Device");
        deviceBuilder.buildProcessor("Intel Core i5");
        deviceBuilder.buildRam("8GB");
        deviceBuilder.buildStorage("256GB SSD");
        deviceBuilder.buildGpu("NVIDIA GeForce GTX 1650");
        deviceBuilder.buildOs("Windows 10");
        deviceBuilder.buildPrice(999.99);
        Device device2 = deviceBuilder.getDevice();
        System.out.println(device2.toString());

        // makes a new smartphone builder and builds a smartphone (has no integrated graphics)
        Smartphone smartphone2 = getSmartphone();
        System.out.println(smartphone2.toString());

    }

    private static Smartphone getSmartphone() {

        // example of a director for the smartphone builder
        SmartphoneBuilder smartphoneBuilder = new Smartphone();
        smartphoneBuilder.buildName("Smartphone");
        smartphoneBuilder.buildProcessor("Snapdragon 888");
        smartphoneBuilder.buildScreen("6.7 inches");
        smartphoneBuilder.buildBattery("4500mAh");
        smartphoneBuilder.buildRam("8GB");
        smartphoneBuilder.buildStorage("256GB");
        smartphoneBuilder.buildOs("Android 11");
        smartphoneBuilder.buildPrice(799.99);
        Smartphone smartphone2 = smartphoneBuilder.getSmartphone();
        return smartphone2;
    }
}
