import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000); // starting with ₹1000

        try {
            System.out.println("Current Balance: ₹" + account.getBalance());

            System.out.print("Enter amount to deposit: ");
            double deposit = sc.nextDouble();
            account.deposit(deposit);

            System.out.print("Enter amount to withdraw: ");
            double withdraw = sc.nextDouble();
            account.withdraw(withdraw);

            System.out.println("Final Balance: ₹" + account.getBalance());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
