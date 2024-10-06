package ProductCustomization;

public class DeviceDirector {

    private DeviceBuilder deviceBuilder;

    public DeviceDirector(DeviceBuilder deviceBuilder) {
        this.deviceBuilder = deviceBuilder;
    }

    public Device buildDevice(String name, String processor, String ram, String storage, String gpu, String os, double price) {

        deviceBuilder.buildName(name);
        deviceBuilder.buildProcessor(processor);
        deviceBuilder.buildRam(ram);
        deviceBuilder.buildStorage(storage);
        deviceBuilder.buildGpu(gpu);
        deviceBuilder.buildOs(os);
        deviceBuilder.buildPrice(price);
        return deviceBuilder.getDevice();

    }

}
