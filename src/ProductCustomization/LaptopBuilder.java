package ProductCustomization;

public interface LaptopBuilder {

    // methods to be implemented by the Laptop class
    void buildName(String name);
    void buildProcessor(String processor);
    void buildRam(String ram);
    void buildStorage(String storage);
    void buildGpu(String gpu);
    void buildOs(String os);
    Laptop getLaptop();

}
