package contactmanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContactManagement manager = new ContactManagement();

        // example contacts

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email");
        String email = scanner.nextLine();

        manager.addContact(new Contact(name, phoneNumber, email));
        manager.displayContacts();
        manager.extractEmailDomains();

    }


    
}
