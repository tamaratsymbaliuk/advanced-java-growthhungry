package multiThreadLibrarySimulation;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " was added");
    }

    public Book getBookByTitile(String title) {
        for (Book book : books) {
            if (book.getTitle() == title) {
                return book;
            }
            else {
                System.out.println("Book with this title was not found");
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
