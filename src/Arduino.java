public class Arduino extends ElectronicItem{
    String version;
    public Arduino(String name, String location, String description, int price, int storageCapacity, String model, String maker, String operatingSystem, String version){
        super(name, location, description, price, storageCapacity, model, maker, operatingSystem);
        this.version = version;
    }
    public String getVersion(){
        return version;
    }

    public String toString() {
        return "Arduino Details:\n" +
                "Name: " + getName() + "\n" +
                "Location: " + getLocation() + "\n" +
                "Description: " + getDescription() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Storage Capacity: " + getStorageCapacity() + "\n" +
                "Model: " + getModel() + "\n" +
                "Maker: " + getMaker() + "\n" +
                "Operating System: " + getOperatingSystem() + "\n" +
                "Version: " + version;
    }
}
