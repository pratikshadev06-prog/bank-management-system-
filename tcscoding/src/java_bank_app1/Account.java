package java_bank_app1;

public class Account {

    private int accountNumber;
    private String name;
    private double balance;

    // Constructor
    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully");
        } else {
            System.out.println("Insufficient balance / Invalid amount");
        }
    }
}
