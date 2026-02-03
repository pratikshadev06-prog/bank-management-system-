package java_bank_app1;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<Integer, Account> accounts = new HashMap<>();

    // Create Account
    public void addAccount(Account account) {
        if (accounts.containsKey(account.getAccountNumber())) {
            System.out.println("Account already exists!");
        } else {
            accounts.put(account.getAccountNumber(), account);
            System.out.println("Account created for " + account.getName());
        }
    }

    // Get Account
    public Account getAccount(int accNumber) {
        return accounts.get(accNumber);
    }

    // Show all accounts
    public void showAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found!");
        } else {
            for (Account acc : accounts.values()) {
                System.out.println(
                    acc.getAccountNumber() + " | " +
                    acc.getName() + " | Balance: " +
                    acc.getBalance()
                );
            }
        }
    }
}
