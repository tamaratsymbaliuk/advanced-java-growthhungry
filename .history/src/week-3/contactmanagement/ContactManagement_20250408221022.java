package contactmanagement;
import java.util.*;
public class ContactManagement {

    List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact);
        }
        System.out.println("Contact already exist");
    }

    public void displayContacts() {
        System.out.println("List of contacts below: ");
    }
    
}
