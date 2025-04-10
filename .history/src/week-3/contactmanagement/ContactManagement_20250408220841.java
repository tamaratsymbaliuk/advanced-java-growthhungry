package contactmanagement;
import java.util.*;
public class ContactManagement {

    List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        if (contacts.contains(contact))
        contacts.add(contact);

    }
    
}
