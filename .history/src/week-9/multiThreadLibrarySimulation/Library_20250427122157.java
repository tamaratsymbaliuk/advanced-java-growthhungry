package multiThreadLibrarySimulation;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book + " was added");
    }

    public boolean isAvailable(Book book) {
       return if (books.contains(book) ? true : false)
    }
    
    
}
