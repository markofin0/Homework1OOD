package ProductCustomization;

public interface DeviceBuilder {

    // methods to be implemented by the Device class
    void buildName(String name);
    void buildProcessor(String processor);
    void buildRam(String ram);
    void buildStorage(String storage);
    void buildGpu(String gpu);
    void buildOs(String os);
    void buildPrice(double price);
    Device getDevice();

}
