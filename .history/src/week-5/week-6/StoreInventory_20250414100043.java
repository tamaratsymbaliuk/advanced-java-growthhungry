public class StoreInventory {

    class Product<T
    public static void main(String[] args) {
        Book book1 = new Book("Author A", 300);
        Product<Book> product1 = new Product<>("Book A", 15.99);

        Inventory<Book> bookInventory = new Inventory<>();
        bookInventory.addProduct(product1);
        bookInventory.displayInventory();


    }
    
}
