package ProductCustomization;

public class Smartphone extends Device implements SmartphoneBuilder {

    private String screen;
    private String battery;

    // methods implemented from the SmartphoneBuilder interface
    @Override
    public void buildScreen(String screen) {
        this.screen = screen;
    }

    @Override
    public void buildBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public Smartphone getSmartphone() {
        return this;
    }

    @Override
    public String toString() {
        return name + " [Screen: " + screen + ", Processor: " + processor + ", RAM: " + ram + ", Battery: " + battery + ", Storage: " + storage +  ", Graphics: " + gpu + ", Price: " + price + "]";
    }

}
