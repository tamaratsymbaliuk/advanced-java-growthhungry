package multiThreadLibrarySimulation;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

    public Library(Book book) {
        this.books.add(book);
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book + " was added");
    }

    public boolean isAvailable(Book book) {
       return (books.contains(book) ? true : false);
    }

    public void displayAvailableBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
    
    
}
