package ProductCustomization;

public class Device implements DeviceBuilder {

    // attributes
    public String name;
    public String processor;
    public String ram;
    public String storage;
    public String gpu;
    public String os;
    public double price = 800.00;

    // methods implemented from the DeviceBuilder interface
    @Override
    public void buildName(String name) {
        this.name = name;
    }

    @Override
    public void buildProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public void buildRam(String ram) {
        this.ram = ram;
    }

    @Override
    public void buildStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public void buildGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public void buildOs(String os) {
        this.os = os;
    }

    @Override
    public void buildPrice(double price) {
        this.price = price;
    }

    @Override
    public Device getDevice() {
        return this;
    }

    @Override
    public String toString() {
        return name + " [Processor: " + processor + ", RAM: " + ram + ", Storage: " + storage + ", GPU: " + gpu + ", OS: " + os + ", Price: " + price + "]";
    }

}
