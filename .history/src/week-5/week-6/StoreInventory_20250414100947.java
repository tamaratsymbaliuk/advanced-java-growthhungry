public class StoreInventory {

    class Product<T> {
        private String name;
        private double price;
        private T details;

        public Product(String name, double price, T details) {
            this.name = name;
            this.price = price;
            this.details = details;
        }

        public String getName() {
            return name;
        }
        public double getPrice() {
            return price;
        }
        public T getDetails() {
            returun details;
        }
        public void display() {
            System.out.println("Name: " + name + " , Price: $" + price);
            System.out.println("Details: " + details.toString());
        }
    }

    class Book {
        private Sting author;
        private int pages;

        public Book(String author, int pages) {
            this.author = author;
            this.pages = pages;
        }
        @Override
        public String toString() {
            return "Author: " + author + " , Pages: " + pages;
                }
    }

    class Electronics {
        private Sting brand;
        private int warranty;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Author A", 300);
        Product<Book> product1 = new Product<>("Book A", 15.99);

        Inventory<Book> bookInventory = new Inventory<>();
        bookInventory.addProduct(product1);
        bookInventory.displayInventory();


    }
    
}
