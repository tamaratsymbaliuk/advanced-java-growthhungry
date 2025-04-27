package multiThreadLibrarySimulation;

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

    public synchronized boolean checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book checked out: " + title);
            return true;
        }
        System.out.println("Book not available: " + title);
        return false;
        
    }

    public void returnBook(Book book) {
        System.out.println(book + " was returned");
        book.isAvailable = true;
    }
    
}
