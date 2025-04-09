import java.util.*;


public class LibraryManagementSystem {

    Map<String, Integer> borrowedBooks = new HashMap<>();
  //  Queue<String> borrowRequests = new LinkedList<>(); // booking requests
  Map<String, Queue<String>> borrowRequests = new HashMap<>(); // borrow requests per book
    Map<String, Integer> bookCopiesAvailable = new HashMap<>(); // how many books available

    public void addBook(String book, int numOfCopies) {
        bookCopiesAvailable.put(book, bookCopiesAvailable.getOrDefault(book, 0) + numOfCopies); // using getOrDefault in case the copy of book doesn't exist yet
        borrowedBooks.remove(book);
    }

    public void borrowBook(String book) {
        // if book is available then decrement availability, if not then add a pending request
        if (bookCopiesAvailable.containsKey(book)) {
            bookCopiesAvailable.put(book, bookCopiesAvailable.get(book) - 1);
            borrowedBooks.put(book, borrowedBooks.getOrDefault(book, 0) + 1);
        } else {
            if(!borrowRequests.containsKey(book)) {
                borrowRequests.put(book, new LinkedList<>());
            }
            borrowRequests.get(book).add(book); // get returns a queue and we add a book to the queue
        }
    }

    public void returnBook(String book) {
        // checking if borrowedRequest contains book if not adding to the availability
        if (borrowRequests.containsKey(book) && borrowRequests.get(book).size() > 0) {
            borrowRequests.get(book).remove(); // removing the head of the queue
        } else {
            bookCopiesAvailable.put(book, bookCopiesAvailable.get(book) + 1);
            borrowRequests.put(book, )
        }
    }

    // Method to display the current status of the library (inventory and borrowed books)
    public void displayLibraryStatus() {
        System.out.println("\nLibrary Inventory:");
        for (String book : bookCopiesAvailable.keySet()) {
            System.out.println(book + " - Copies Available: " + bookCopiesAvailable.get(book));
        }

        System.out.println("\nPending Borrow Requests:");
        for (String book : borrowRequests.keySet()) {
            if (!borrowRequests.get(book).isEmpty()) {
            System.out.println("Borrow requests for " + book + ": " + borrowRequests.get(book).size());
          }
        }
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
