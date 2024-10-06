package ProductCustomization;

public interface SmartphoneBuilder {

    // methods to be implemented by the Smartphone class
    void buildName(String name);
    void buildScreen(String screen);
    void buildBattery(String battery);
    void buildProcessor(String processor);
    void buildRam(String ram);
    void buildStorage(String storage);
    void buildGpu(String gpu);
    void buildOs(String os);
    void buildPrice(double price);
    Smartphone getSmartphone();

}
