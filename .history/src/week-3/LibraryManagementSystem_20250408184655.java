import java.util.*;

public class LibraryManagementSystem {

    List<String> books = new ArrayList<>();
    Set<String> borrowedBooks = new HashSet<>();
    Queue<
    Map<String, Integer> bookCopies = new HashMap<>();

    public void addBook(String name, int numOfCopies) {
        bookCopies.put(name, numOfCopies);
        borrowedBooks.remove(name);
    }

    public void 


    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Adding books to the library
        library.addBook("Happy Potter", 5);
        library.addBook("The Lord of the rings", 1);

        // Borrowing books
        library.borrowBook("Harry Poter");
        library.borrowBook("The Lord of the rings");

        // Returning a book
        library.returnBook("Harru Potter");
    }
    
}
