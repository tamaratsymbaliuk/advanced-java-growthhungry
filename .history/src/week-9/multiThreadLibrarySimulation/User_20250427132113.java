package multiThreadLibrarySimulation;

import java.util.Random;

public class User implements Runnable {
    private Library library;
    private String[] bookTitles;
    private Random random = new Random();

    public User(Library library, String[] bookTitles) {
        this.library = library;
        this.bookTitles = bookTitles;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String title = bookTitles[random.nextInt()]

            int choise = random.nextInt(3);

            if (choise == 0) {
                book.checkOut(book);
            } else if (choise == 1) {
                book.returnBook(book);
            } else {
                book.isAvailable();
            }

        }
        
    }
    
}
