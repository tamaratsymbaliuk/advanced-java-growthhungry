package contactmanagement;
import java.util.*;
public class ContactManagement {

    List<Contact> contacts = new ArrayList<>();
    Map<String, String> phoneBook = new HashMap<>();

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
        contacts.add(contact);
        System.out.println("Contact added: " + contact);

    }

    public void displayContacts() {
         if (contacts.isEmpty()) {
        System.out.println("No contacts available.");
       }
        System.out.println("List of contacts below: ");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public String getPhoneNumberByName(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        
    }
    
}
