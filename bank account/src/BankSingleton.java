import java.util.List;
// import java.util.ArrayList;

public class BankSingleton {
    private static BankSingleton instance;
    // private double totalBalance;
    private List<User> userrs;

    public boolean authenticaterUser(String username, String passwordd) {
        for (User user : userrs) {
            if (user.getUsername().equals(username) && user.getPassword().equals(passwordd))
                return true;
        }
        return false;
    }

    // private static class UserCredentials {
    // private String username;
    // private String password;
    // }

    // public userCredentialsList(String username, String password){
    // this.username = username;
    // this.password = password;
    // }

    // public String getUsername() {
    // return username;
    // }

    // public String getPassword() {
    // return password;
    // }

    public static BankSingleton getInstance() {
        if (instance == null) {
            synchronized (BankSingleton.class) {
                if (instance == null) {
                    instance = new BankSingleton();
                }
            }
        }
        return instance;
    }

    // public void deposit(double amount) {
    // totalBalance += amount;
    // }

    // public void withdraw(double amount) {
    // if (totalBalance >= amount) {
    // totalBalance -= amount;
    // } else {
    // System.out.println("insufficient funds");
    // }
    // }

    // public double getTotalBalance() {
    // return totalBalance;
    // }
}