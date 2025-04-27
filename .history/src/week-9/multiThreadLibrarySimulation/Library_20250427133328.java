package multiThreadLibrarySimulation;

import java.util.ArrayList;
import java.util.List;

/*
Holds a collection of Book objects and includes methods to add a book, get a
book by title, and display available books.
*/

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
        return null;
    }

    public boolean isAvailable(Book book) {
       return (books.contains(book) ? true : false);
    }

    public void displayAvailableBooks() {
        System.out.println("Available books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(" - " + book.getTitle());
            }
        }
    }
}
