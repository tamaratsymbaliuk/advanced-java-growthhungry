public class Book {
    private int id;
    private String title;
    private String author;
    private double price;
    private double rating;

    public Book(int id, String title, String author, double price, double rating) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.rating = rating;
    }
    public int getId() {
        return id; 
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRating() {
        return rating;
    }
    public double getPrice() {
        return price;
    }
    public void setRating(double rating) {
        if (rating >= 0.0 || rating <= 5.0) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';  
    }
    
}
