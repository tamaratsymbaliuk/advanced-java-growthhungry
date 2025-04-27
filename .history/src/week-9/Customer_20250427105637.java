public class Customer implements Runnable {
    private BankAccount account;
    private Random random = new Random();

    // Constructor
    public Customer(BankAccount account) {
this.account = account;
    
}
