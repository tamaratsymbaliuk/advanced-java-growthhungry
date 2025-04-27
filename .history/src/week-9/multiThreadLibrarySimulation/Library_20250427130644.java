package multiThreadLibrarySimulation;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " was added");
    }

    public Book getBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
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
