import java.util.*;
import java.util.stream.Collectors;
import java.util.List;

public class BookManagementSystem {
    public static void main(String[] args) {
        // Data Setup
        List<Book> books = List.of(
                new Book(1, "Effective Java", "Joshua Bloch", 45.99, 4.8),
                new Book(2, "Clean Code", "Robert C. Martin", 37.99, 4.7),
                new Book(3, "Head First Java", "Kathy Sierra", 30.50, 4.5),
                new Book(4, "Java Concurrency in Practice", "Brian Goetz", 55.00, 4.6),
                new Book(5, "Introduction to Algorithms", "Thomas H. Cormen", 89.99, 4.3),
                new Book(6, "Design Patterns", "Erich Gamma", 49.99, 4.4),
                new Book(7, "Refactoring", "Martin Fowler", 60.00, 4.2),
                new Book(8, "The Pragmatic Programmer", "Andrew Hunt", 39.95, 4.9),
                new Book(9, "You Don’t Know JS", "Kyle Simpson", 25.99, 4.1),
                new Book(10, "Cracking the Coding Interview", "Gayle Laakmann McDowell",
                        35.00, 4.0));

        // Filter books by rating
        System.out.println("Books with a rating of 4.0 or higher:");
        List<Book> highRatedBooks = books.stream().filter(b -> b.getRating() >= 4.0).collect(Collectors.toList());
        highRatedBooks.forEach(System.out::println);

        // 2. Find Top 3 Most Expensive Books
        System.out.println("\nTop 3 most expensive books:");
        List<Book> expensiveBooks = books.stream().sorted(Comparator.comparingDouble(Book::getPrice).reversed()).limit(3).collect(Collectors.toList()); 
        expensiveBooks.forEach(System.out::println);

        // 3. Transform Book Titles to Uppercase
        System.out.println("\nBook titles in uppercase:");
        List<String> upperCaseTitles = books.stream().map(b -> b.getTitle().toUpperCase()).collect(Collectors.toList());
        upperCaseTitles.forEach(System.out::println);

        // 4. Sort Books by Rating (Descending) and Price (Ascending)
        System.out.println("\nBooks sorted by rating (desc) and price (asc):");
        List<Book> sortedBooks = books.stream().sorted(Comparator.comparingDouble(Book::getRating).reversed().thenComparingDouble(Book::getPrice)).collect(Collectors.toList());
        sortedBooks.forEach(System.out::println);

        // 5. Average Price by Author
        System.out.println("\nAverage price by author:");
        Map<String, Double> averagePriceByAuthor = books.stream().collect(Collectors.groupingBy(Book::getAuthor, Collectors.averagingDouble(Book::getPrice)));
        averagePriceByAuthor.forEach((author, avgPrice) -> System.out.println(author + ": " + avgPrice));

        // 6. Group Books by Price Range
        System.out.println("\nBooks grouped by price range:");
        Map<String, List<Book>> booksByPriceRange = books.stream().collect(Collectors.groupingBy(book -> {
            if (book.getPrice() > 20) return "<$20";
            else if (book.getPrice() <= 50) return "$20 - $50";
            else return ">$50";
        }));
        booksByPriceRange.forEach((range, bookList) -> {
            System.out.println(range + ":");
            bookList.forEach(System.out::println);
        });     
    }
}
