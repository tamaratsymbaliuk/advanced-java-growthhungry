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
        
    }

    public void returnBook(Book book) {
        System.out.println(book + " was returned");
        book.isAvailable = true;
    }
    
}
