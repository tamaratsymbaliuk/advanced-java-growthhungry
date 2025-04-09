import java.util.*;

public class LibraryManagementSystem {

    List<String> books = new ArrayList<>();
    Set<String> borrowedBooks = new HashSet<>();
    Queue<
    Map<String, Integer> bookCopies = new HashMap<>();

    public void addBook(String book, int numOfCopies) {
        bookCopies.put(book, numOfCopies);
        borrowedBooks.remove(book);
    }

    public void borrowBook(String book) {
        borrowedBooks.put(book);
    }

    public void returnBook(String name) {
        borrowedBooks.remove(name);
    }


    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Adding books to the library
        library.addBook("Happy Potter", 5);
        library.addBook("The Lord of the rings", 1);

        // Borrowing books
        library.borrowBook("Harry Poter");
        library.borrowBook("The Lord of the rings");

        // Returning a book
        library.returnBook("Harry Potter");

        // Borrowing after return
    }
    
}
