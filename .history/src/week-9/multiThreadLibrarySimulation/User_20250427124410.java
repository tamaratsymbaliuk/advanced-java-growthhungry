package multiThreadLibrarySimulation;

import java.util.Random;

public class User implements Runnable {
    Book book;
    private Random random = new Random();

    public User(Book book) {
        this.book = book;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            int choise = random.nextInt(3);

            if (choise == 0) {
                book.checkOut(book);
            } else if (choise == 1) {
                book.returnBook(book);
            } else {
                book.isAvailable
            }

        }
        
    }
    
}
