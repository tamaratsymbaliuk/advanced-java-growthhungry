public class BankAccount {

    import java.util.Random;


    private int balance = 1000; // Starting balance
    // Deposit method to add funds

public synchronized void deposit(int amount) {
balance += amount;
System.out.println("Deposited " + amount + ", Current Balance: " + balance);
    
}
