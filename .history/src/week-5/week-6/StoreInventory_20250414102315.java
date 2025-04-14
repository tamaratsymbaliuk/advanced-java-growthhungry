import java.util.ArrayList;
import java.util.List;

    class Product<T> {
        private String name;
        private double price;
        private T details; // Generic attribute for specific product

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

        public Electronics(String brand, int warranty) {
            this.brand = brand;
            this.warranty = warranty;
        }
        @Override
        public String toString() {
            return "Brand: " + brand + " , Warranty: " + warranty;
        }

    }

    class Clothes {
        private String size;
        private String material;

        public Clothes(String size, String material) {
            this.size = size;
            this.material = material;
        }

        @Override
        public String toString() {
            return "Size: " + size + ", Material: " + material;
        }
    }
    
    // Generic Inventory Class
    class Inventory<T> {
        private List<Product<T>> productList = new ArrayList<>();

        public void addProduct(Product<T> product) {
            productList.add(product);
        }
        public void removeProduct(Product<T> product) {
            productList.remove(product);
        }
        public void displayInventory() {
            for (Product<T> product : productList) {
                product.display();
        }
    }
        public static void displayAll(Inventory<? extends Product<?>> inventory) {
            inventory.displayInventory();
        }
}


 class StoreInventory {

    public static void main(String[] args) {
        Book book1 = new Book("Author A", 300);
        Product<Book> product1 = new Product<>("Book A", 15.99);

        // Creating an electronic item
        Electronics electronics1 = new Electronics("Brand X", 24);
        Product<Electronics> product2 = new Product<>("Smartphone", 299.99, electronics1);

        // Creating a clothing item
        Clothes clothes1 = new Clothes("M", "Cotton");
        Product<Clothes> product3 = new Product<>("T-Shirt", 19.99, clothes1);

        // Creating Inventory for each product type
        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Electronics> electronicsInventory = new Inventory<>();
        Inventory<Clothes> clothesInventory = new Inventory<>();

        // Adding products to inventories
        bookInventory.addProduct(product1);
        electronicsInventory.addProduct(product2);
        clothesInventory.addProduct(product3);

        // Displaying all inventories
        System.out.println("Book Inventory:");
        bookInventory.displayInventory();
        System.out.println("\nElectronics Inventory:");
        electronicsInventory.displayInventory();

        System.out.println("\nClothes Inventory:");
        clothesInventory.displayInventory();
        
        // Displaying all inventories using the wildcard method
        System.out.println("\nDisplaying All Products Using
Wildcards:");
Inventory.displayAll(bookInventory);
Inventory.displayAll(electronicsInventory);
Inventory.displayAll(clothesInventory);
}
 }





    }
    
}
