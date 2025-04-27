public class Customer implements Runnable {
    private BankAccount account;
    private Random random = new Random();

    // Constructor
    public Customer(BankAccount account) {
        this.account = account;
    }

    // Run method for random deposit and withdrawal operations
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) { // Each customer performs 5 random transactions
            int choice = random.nextInt(2);
            int amount = random.nextInt(100) + 1; // Random amount between 1 and 100
            if (choice == 0) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
            try {
                Thread.sleep(100); // Simulate transaction processing time
            } catch (InterruptedException e) {
                System.out.println("Transaction interrupted");
            }
        }
    }
}
public class BankSimulation {
public static void main(String[] args) {
// Create shared bank account
BankAccount account = new BankAccount();
// Create multiple customer threads
Thread customer1 = new Thread(new Customer(account), "Customer1");
Thread customer2 = new Thread(new Customer(account), "Customer2");
Thread customer3 = new Thread(new Customer(account), "Customer3");
// Start each customer thread
customer1.start();
customer2.start();
customer3.start();
// Wait for threads to finish
try {
customer1.join();
customer2.join();
customer3.join();
} catch (InterruptedException e) {
System.out.println("Main thread interrupted");
}
// Display the final balance
System.out.println("Final Balance: " + account.getBalance());
}
}

}
