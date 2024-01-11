import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private BankAccount account;
    private List<BankAccount> bankAccounts;

    // private static BankAccount instance;

    public User(String username, String password, BankAccount account, List<BankAccount> bankAccounts) {
        this.username = username;
        this.password = password;
        this.account = account;
        this.bankAccounts = bankAccounts;
    }

    // public static BankAccount getInstance() {
    // if (instance == null) {
    // instance = new BankAccount();
    // }
    // return instance;
    // }

    // public User(String username, String password, String string) {

    // this.username = username;
    // this.password = password;
    // this.bankAccounts = new ArrayList<>();
    // }

    // public User(String username2, String password2, String string) {
    // }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    // public void performTransaction(double amount) {
    // account.processTransaction(amount);
    // }

    public boolean createBankAcount() {

        if (isUsernameUnique()) {

            bankAccounts.add(new BankAccount(username));
            System.out.println("Bank Account Created");
            return true;

        } else {
            System.out.println("Bank Accout creation failed.");
            return false;
        }
    }

    public void updateAccountDetails(String newUsername, String newPassword) {

        if (newUsername != null && newPassword != null) {
            if (!newUsername.equals(username)) {
                if (isUsernameUnique()) {
                    username = newUsername;
                    System.out.println(" username updated.");
                } else {
                    System.out.println("username update failed");
                }
            }

            password = newPassword;
            System.out.println("password updated");

        } else {
            System.out.println("invaild username or password ");
        }
    }

    public void displayAccountDetails() {
        System.out.println("account user details " + username);
        for (BankAccount account : bankAccounts) {
            System.out.println("Bank account" + account.getAccountNumber());
        }
    }

    private boolean isUsernameUnique() {

        return bankAccounts.stream().noneMatch(account -> account.getUsername().equals(username));
    }

    public void deposit(int i) {
    }

    public void withdraw(int i) {
    }

}

// // class BankAccount {

// private String username;

// public BankAccount(String username) {

// this.username = username;

// }

// public String getUsername() {

// return username;

// }

// }

// }
