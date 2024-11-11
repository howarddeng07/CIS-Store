public class Phone extends ElectronicItem{
    private String networkType;
    private int screenSize;
    public Phone(String name, String location, String description, int price, int storageCapacity, String model, String maker, String operatingSystem, String networkType, int screenSize){
        super(name, location, description, price, storageCapacity, model, maker, operatingSystem);
        this.networkType = networkType;
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public String getNetworkType() {
        return networkType;
    }

    public String toString() {
        return "Phone Details:\n" +
                "Name: " + getName() + "\n" +
                "Location: " + getLocation() + "\n" +
                "Description: " + getDescription() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Storage Capacity: " + getStorageCapacity() + "\n" +
                "Model: " + getModel() + "\n" +
                "Maker: " + getMaker() + "\n" +
                "Operating System: " + getOperatingSystem() + "\n" +
                "Network Type: " + getNetworkType() + "\n" +
                "Screen Size: " + getScreenSize();
    }

}
