import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class StoreTester {
    @Test
    public void addBookTest(){
        Store store = new Store();
        Book book = new Book("x","x","x",1,1,"x","x","x","x","x");
        Store.addBook(book);
        assertTrue(store.getItems("Book").contains(book));
    }
    @Test
    public void addPhoneTest(){
        Store store = new Store();
        Book book = new Book("x","x","x",1,1,"x","x","x","x","x");
        Store.addBook(book);
        Phone phone = new Phone("x","x","x",1,1,"x","x","x","x",1);
        Store.addPhone(phone);
        assertTrue(store.getItems("Phone").contains(phone));
    }
    @Test

    public void updatePhonesLocationTest(){
        Store store = new Store();
        Phone phone1 = new Phone("x","x","x",1,1,"x","x","x","x",1);
        Phone phone2 = new Phone("y","x","x",1,1,"x","x","x","x",1);
        Phone phone3 = new Phone("z","x","x",1,1,"x","x","x","x",1);
        Store.addPhone(phone1);
        Store.addPhone(phone2);
        Store.addPhone(phone3);
        Store.updatePhonesLocation("Room 512");
        for(int i = 0; i < Store.getAllPhones().size(); i++){
            if (Store.getAllPhones().get(i).getLocation().equals("Room 512")){
                assertEquals(Store.getAllPhones().get(i).getLocation(), "Room 512");
            }

        }
    }
    @Test
    public void getItemsTest(){
        Store store = new Store();
        Phone phone1 = new Phone("x","x","x",1,1,"x","x","x","x",1);
        Phone phone2 = new Phone("y","x","x",1,1,"x","x","x","x",1);
        Phone phone3 = new Phone("z","x","x",1,1,"x","x","x","x",1);
        Book book1 = new Book("x","x","x",1,1,"x","x","x","x","x");
        Book book2 = new Book("y","x","x",1,1,"x","x","x","x","x");
        Book book3 = new Book("z","x","x",1,1,"x","x","x","x","x");
        Arduino arduino1 = new Arduino("x","x","x",1,1,"x","x","x","x");
        Arduino arduino2 = new Arduino("y","x","x",1,1,"x","x","x","x");
        Arduino arduino3 = new Arduino("z","x","x",1,1,"x","x","x","x");
        Magazine magazine1 = new Magazine("x","x","x",1,1,"x","x","x","x");
        Magazine magazine2 = new Magazine("y","x","x",1,1,"x","x","x","x");
        Magazine magazine3 = new Magazine("z","x","x",1,1,"x","x","x","x");
        Store.addPhone(phone1);
        Store.addPhone(phone2);
        Store.addPhone(phone3);
        Store.addBook(book1);
        Store.addBook(book2);
        Store.addBook(book3);
        Store.addArduino(arduino1);
        Store.addArduino(arduino2);
        Store.addArduino(arduino3);
        Store.addMagazine(magazine1);
        Store.addMagazine(magazine2);
        Store.addMagazine(magazine3);
        ArrayList<CISItem> books = store.getItems("Book");
        ArrayList<CISItem> phones = store.getItems("Phone");
        ArrayList<CISItem> magazines = store.getItems("Magazine");
        ArrayList<CISItem> arduinos = store.getItems("Arduino");

        assertEquals(3, books.size());
        assertTrue(books.contains(book1));

        assertEquals(3, phones.size());
        assertTrue(phones.contains(phone1));

        assertEquals(3, magazines.size());
        assertTrue(magazines.contains(magazine1));

        assertEquals(3, arduinos.size());
        assertTrue(arduinos.contains(arduino1));
        Store.showAllInfo();
    }

    @Test
    public void testUpdateItems() {
        Store store = new Store();

        Phone phone1 = new Phone("x","x","x",1,1,"x","x","x","x",1);

        store.addPhone(phone1);


        store.updateItems("phone", "location", "Room 511");

        ArrayList<CISItem> phones = store.getItems("Phone");
        for (CISItem phone : phones) {
            assertEquals("Room 511", phone.getLocation());
        }
    }
}
