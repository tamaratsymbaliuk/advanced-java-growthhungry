package contactmanagement;
import java.util.*;
public class ContactManagement {

    List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {

        // if (!contacts.contains(contact)) {
        //     contacts.add(contact);
        // }
        // System.out.println("Contact already exist");


        // Check for duplicates based on name
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(contact.getName())) {
                System.out.println("Contact already exist");
                return;
            }
        }
        

    }

    public void displayContacts() {
        System.out.println("List of contacts below: ");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
    
}
