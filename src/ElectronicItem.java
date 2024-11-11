public class ElectronicItem extends CISItem{
    private int storageCapacity;
    private String model;
    private String maker;
    private String operatingSystem;
    public ElectronicItem(String name, String location, String description, int price, int storageCapacity, String model, String maker, String operatingSystem){
        super(name, location, description, price);
        this.storageCapacity = storageCapacity;
        this.model = model;
        this.maker = maker;
        this.operatingSystem = operatingSystem;
    }
    public String getModel() {
        return model;
    }
    public int getStorageCapacity() {
        return storageCapacity;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public String getMaker() {
        return maker;
    }
}
