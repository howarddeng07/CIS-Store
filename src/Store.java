import java.lang.reflect.Method;
import java.util.ArrayList;
public class Store {
    static ArrayList<CISItem> cisItems;

    public Store(){
         cisItems = new ArrayList<>();
    }

    public static void addBook(Book book){
        cisItems.add(book);
    }
    public static void addPhone(Phone phone){
        cisItems.add(phone);
    }
    public static void addMagazine(Magazine magazine){
        cisItems.add(magazine);
    }
    public static void addArduino(Arduino arduino){
        cisItems.add(arduino);
    }

    public static void updatePhonesLocation(String location){
        for(int i = 0; i < cisItems.size(); i++){
            if (cisItems.get(i) instanceof Phone){
                cisItems.get(i).setLocation(location);
            }
        }
    }
    public static ArrayList<Phone> getAllPhones(){
        ArrayList<Phone> Phones = new ArrayList<>();
        for(int i = 0; i < cisItems.size(); i++){
            if (cisItems.get(i) instanceof Phone){
                Phones.add((Phone) cisItems.get(i));
            }
        }
        return Phones;
    }

    public ArrayList<CISItem> getItems(String itemType) {
        ArrayList<CISItem> items = new ArrayList<>();
        if (itemType.equals("Phone")){
            for (CISItem cisItem : cisItems) {
                if (cisItem instanceof Phone) {
                    items.add(cisItem);
                }
            }
            return items;
        }
        else if (itemType.equals("Magazine")){
            for (CISItem cisItem : cisItems) {
                if (cisItem instanceof Magazine) {
                    items.add(cisItem);
                }
            }
            return items;
        }
        else if (itemType.equals("Book")){
            for (CISItem cisItem : cisItems) {
                if (cisItem instanceof Book) {
                    items.add(cisItem);
                }
            }
            return items;
        }
        else if (itemType.equals("Arduino")){
            for (CISItem cisItem : cisItems) {
                if (cisItem instanceof Arduino) {
                    items.add(cisItem);
                }
            }
            return items;
        }
        return items;
    }

    public void updateItems(String itemType, String property, String value) {
        for (CISItem item : cisItems) {
            if (item.getClass().getSimpleName().equalsIgnoreCase(itemType)) {
                try {
                    String capitalizedProperty = property.substring(0, 1).toUpperCase() + property.substring(1);
                    Method setter = item.getClass().getMethod("set" + capitalizedProperty, String.class);
                    setter.invoke(item, value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //AI is used to implement the code that catches exception
            }
        }
    }
    public static void showAllInfo() {
        for (CISItem item : cisItems) {
            System.out.println(item.toString());
        }
    }
}
