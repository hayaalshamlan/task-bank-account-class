import java.util.ArrayList;
import java.util.List;

public class BankAccount {
  private String accountNumber;

  private int balance;
  private List<String> transactionHistory;
  private String username;

  public BankAccount(String accountNumber, int balance) {
    this.accountNumber = accountNumber;
    this.balance = 0;
    this.transactionHistory = new ArrayList<>();
  }

  // public BankAccount(int balance) {
  // this.balance = balance;
  // }

  // public BankAccount(List<String> transactionHistory) {
  // this.transactionHistory = transactionHistory;
  // }

  // public BankAccount(String accountNumber) {
  // this.accountNumber = accountNumber;
  // }

  // public List<String> getTransactionHistory() {
  // return transactionHistory;
  // }

  public BankAccount() {
  }

  public BankAccount(String username2) {
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public int getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      transactionHistory.add("Deposit  " + amount + "succesfull. New Balance: " + balance);
    } else {
      System.out.println("invalid amount");
    }

  }

  public String getUsername() {
    return username;
  }

  public void withdraw(double amount) {
    if (amount <= 0 && amount <= balance) {
      balance -= amount;
      transactionHistory.add("Withdrawl:-" + amount);
      System.out.println("wihdrawl of " + "succesful new balance" + balance);
    } else {
      System.out.println("withdrawl failed. no funds.");
    }
  }

  public void displayTransactionHistory() {
    System.out.println("Transaction History for account" + accountNumber + ":");
    for (String transaction : transactionHistory) {
      System.out.println(transaction);
    }
  }
}