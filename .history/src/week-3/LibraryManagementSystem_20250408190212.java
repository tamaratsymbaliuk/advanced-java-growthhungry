import java.util.*;


public class LibraryManagementSystem {

    List<String> books = new ArrayList<>();
    Set<String> borrowedBooks = new HashSet<>();
    Queue<String> borrowRequests = new LinkedList<>(); // booking requests
    Map<String, Integer> bookCopiesAvailable = new HashMap<>(); // how many books available

    public void addBook(String book, int numOfCopies) {
        bookCopiesAvailable.put(book, bookCopiesAvailable.getOrDefault(book, 0) + numOfCopies); // add numOfCopies to the existing numOfCopies to get the total;
        borrowedBooks.remove(book);
    }

    public void borrowBook(String book) {
        // if book is available then decrement availability, if not then add a pending request
        if (bookCopiesAvailable.containsKey(book)) {
            bookCopiesAvailable.remove
        }
    }

    public void returnBook(String book) {
        borrowedBooks.remove(book);
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
