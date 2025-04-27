package multiThreadLibrarySimulation;

/*
Represents a book with checkOut() and returnBook() methods. Each
method uses synchronized to ensure safe access by multiple threads.
*/

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable = true;

    public Book (int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public synchronized boolean checkOut() { // Only one thread can execute that method on the same object at a time.
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book checked out: " + title);
            return true;
        }
        System.out.println("Book not available: " + title);
        return false;
        
    }

    public synchronized void returnBook() {
        isAvailable = true;
        System.out.println(title + " was returned");
    }

    public String getTitle() {
        return title;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
}
