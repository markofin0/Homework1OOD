package ProductCustomization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVAdaptor implements DeviceBuilder{
    private Device device;
    List<Device> devices = new ArrayList<>();

    // constructor
    public CSVAdaptor() {
        this.device = new Device();
        this.devices = devices;
    }

    // implements the methods from the DeviceBuilder interface
    @Override
    public void buildName(String name) {
        device.buildName(name == null || name.isEmpty() ? null : name);
    }

    @Override
    public void buildProcessor(String processor) {
        device.buildProcessor(processor == null || processor.isEmpty() ? null : processor);
    }

    @Override
    public void buildRam(String ram) {
        device.buildRam(ram == null || ram.isEmpty() ? null : ram);
    }

    @Override
    public void buildStorage(String storage) {
        device.buildStorage(storage == null || storage.isEmpty() ? null : storage);
    }

    @Override
    public void buildGpu(String gpu) {
        device.buildGpu(gpu == null || gpu.isEmpty() ? null : gpu);
    }

    @Override
    public void buildOs(String os) {
        device.buildOs(os == null || os.isEmpty() ? null : os);
    }

    @Override
    public void buildPrice(double price) {
        device.buildPrice(price);
    }

    @Override
    public Device getDevice() {
        return this.device;
    }

    public List<Device> readDevicesFromCSV(String csvFile) { // reads the devices from the CSV file

        String line;
        String csvSplitBy = ","; // split the CSV file by commas

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) { // read the CSV file

            // Skip the header line
            br.readLine();

            while ((line = br.readLine()) != null) {

                // splits the CSV file into separate lines and then makes an array of the data

                String[] rowData = line.split(csvSplitBy);
                CSVAdaptor adaptor = new CSVAdaptor();

                // assigns each variable to the corresponding data in the CSV file for each line
                adaptor.buildName(rowData.length > 0 ? rowData[0] : null); // if the data is empty, assign it to null
                adaptor.buildProcessor(rowData.length > 1 ? rowData[1] : null);
                adaptor.buildRam(rowData.length > 2 ? rowData[2] : null);
                adaptor.buildStorage(rowData.length > 3 ? rowData[3] : null);
                adaptor.buildGpu(rowData.length > 4 ? rowData[4] : null);
                adaptor.buildOs(rowData.length > 5 ? rowData[5] : null);
                adaptor.buildPrice(rowData.length > 6 && !rowData[6].isEmpty() ? Double.parseDouble(rowData[6]) : 0.0);
                devices.add(adaptor.getDevice());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return devices;
    }
}