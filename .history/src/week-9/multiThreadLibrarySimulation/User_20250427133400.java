package multiThreadLibrarySimulation;

import java.util.Random;

/*
mplements Runnable, representing a user performing actions on the
Library. Each User thread randomly chooses to check out or return a
book
*/

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
            String title = bookTitles[random.nextInt(bookTitles.length)];
            Book book = library.getBookByTitle(title);

            if (book != null) {
                int action = random.nextInt(2); // 0 for checkout, 1 for return
                if (action == 0) {
                    book.checkOut();
                } else {
                    book.returnBook();
                }
        }
        try {
            Thread.sleep(100); // Simulate time taken for transaction
        } catch (InterruptedException e) {
            System.out.println("Transaction interrupted");
        }
        
    }
}
}
