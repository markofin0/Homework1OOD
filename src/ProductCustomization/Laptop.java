package ProductCustomization;

public class Laptop extends Device implements LaptopBuilder {

    // methods implemented from the LaptopBuilder interface
    @Override
    public Laptop getLaptop() {
        return this;
    }

    @Override
    public String toString() {
        return name + " [Processor: " + processor + ", RAM: " + ram + ", Storage: " + storage + ", GPU: " + gpu + ", OS: " + os + ", Price: " + price + "]";
    }

}
