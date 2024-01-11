import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // BankAccount account = new BankAccount("Noura");
        // // BankAccount(account);
        // account.deposit(300);
        // account.withdraw(100);
        // isntcance in main for generateAccountNumber to call it

        BankSingleton bank = BankSingleton.getInstance();

        User username = new User("", "", "", null);
        username.createBankAcount();
        username.displayAccountDetails();
        username.deposit(300);
        username.withdraw(40);
        username.displayAccountDetails();
        // User anotherUser = new User("Haya", "anotherpasword", null);
        anotherUser.createBankAcount();
        // username.updateAccountDetails("amal", "newpassword");
        username.displayAccountDetails();

    }

    private static void displayAccountDetails(BankAccount account) {

        System.out.println("Account details for" + account.getUsername() + ":");
        System.out.println(" Balance: KWD " + account.getBalance());

    }

    {
        Transaction transaction = new Transaction(new Date(), "deposit", 400);
        displayTransactionHistory(transaction);

    }

    private static void displayTransactionHistory(Transaction transaction) {
        System.out.println("Transaction details:");
        System.out.println("Date: " + transaction.getDate());
        System.out.println("type: " + transaction.getType());
        System.out.println("amount: KWD" + transaction.getAmount());
    }
}