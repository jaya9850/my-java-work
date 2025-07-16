class Customer {
    String name = "Pratiksha";
    int accNo = 12345;
    int balance = 2000;

    void showCustomerDetails() {
        System.out.println("\nCustomer Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: Rs." + balance);
    }
}

class Login extends Customer {
    String userId = "pratiksha01";
    String password = "abc123";

    boolean verifyLogin(String uid, String pass) {
        boolean isUserIdCorrect = uid.equals(userId);
        boolean isPasswordCorrect = pass.equals(password);
        if (isUserIdCorrect && isPasswordCorrect) {
            System.out.println("Login Successful!");
            return true;
        }
        System.out.println("Login Failed!");
        return false;
    }
}

class Transaction extends Login {
    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited Rs." + amount + ". New Balance: Rs." + balance);
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Rs." + amount + ". New Balance: Rs." + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Transaction user = new Transaction();
        user.showCustomerDetails();
        
        if (user.verifyLogin("pratiksha01", "abc123")) {
            user.deposit(1000);
            user.withdraw(500);
        }
    }
}
