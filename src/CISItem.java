public class CISItem {
    private String name;
    String location;
    private String description;
    private int price;

    public CISItem(String name, String location, String description, int price){
        this.name = name;
        this.location = location;
        this.description = description;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public String getDescription(){
        return description;
    }
    public int getPrice() {
        return price;
    }

    public void setLocation(String location) {
        this.location=location;
    }
}
