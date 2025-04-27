package multiThreadLibrarySimulation;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book (int id, String title, String author, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public void checkOut(Book book) {
        System.out.println(book + " was successfully checked out");
        book.isAvailable = false;
    }

    public void returnBook(Book book) {
        System.out.println("")
    }
    
}
