package java_bank_app1;

	import java.util.Scanner;

	public class Main {

	    public static void main(String[] args) {

	        Bank bank = new Bank();
	        Scanner sc = new Scanner(System.in);
	        boolean running = true;

	        while (running) {

	            System.out.println("\n---- BANK MENU ----");
	            System.out.println("1. Create Account");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Show All Accounts");
	            System.out.println("5. Exit");
	            System.out.print("Choose option: ");

	            int choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter Account Number: ");
	                    int accNo = sc.nextInt();

	                    System.out.print("Enter Name: ");
	                    sc.nextLine(); // buffer clear
	                    String name = sc.nextLine();

	                    System.out.print("Enter Initial Balance: ");
	                    double bal = sc.nextDouble();

	                    Account acc = new Account(accNo, name, bal);
	                    bank.addAccount(acc);
	                    break;

	                case 2:
	                    System.out.print("Enter Account Number: ");
	                    int depAcc = sc.nextInt();

	                    Account depAccount = bank.getAccount(depAcc);
	                    if (depAccount != null) {
	                        System.out.print("Enter Amount: ");
	                        double amt = sc.nextDouble();
	                        depAccount.deposit(amt);
	                    } else {
	                        System.out.println("Account not found!");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter Account Number: ");
	                    int withAcc = sc.nextInt();

	                    Account withAccount = bank.getAccount(withAcc);
	                    if (withAccount != null) {
	                        System.out.print("Enter Amount: ");
	                        double amt = sc.nextDouble();
	                        withAccount.withdraw(amt);
	                    } else {
	                        System.out.println("Account not found!");
	                    }
	                    break;

	                case 4:
	                    bank.showAllAccounts();
	                    break;

	                case 5:
	                    running = false;
	                    System.out.println("Thank you for using Bank App");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	        sc.close();
	    }
	}


