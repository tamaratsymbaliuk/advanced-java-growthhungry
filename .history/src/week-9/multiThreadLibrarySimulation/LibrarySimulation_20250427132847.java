package multiThreadLibrarySimulation;

public class LibrarySimulation {
    public static void main(String[] args) {
        Library library = new Library();
        String[] bookTitles = {
            "Java Programming", "Data Structures", "Algorithms in Java", "Operating Systems", "Database Systems"};

            // Add books to the library
        for (int i = 0; i < bookTitles.length; i++) {
            library.addBook(new Book(i + 1, bookTitles[i], "Author "
                    + (i + 1)));
        }
        // Create multiple users
        Thread user1 = new Thread(new User(library, bookTitles), "User1");
        Thread user2 = new Thread(new User(library, bookTitles), "User2");
        Thread user3 = new Thread(new User(library, bookTitles), "User3");
    
}
}
