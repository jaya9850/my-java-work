public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    // Constructor
    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter and Setter
    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: Rs. " + amount);
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance to withdraw Rs. " + amount);
        }
    }

    public static void main(String[] args) {
        // Creating a bank account
        BankAccount account = new BankAccount("Sneha Bhosale", 123456, 6000);

        // Performing transactions
        account.deposit(1000);
        account.withdraw(2500);

        int finalBalance = account.getBalance();
        System.out.println("Final Balance: Rs. " + finalBalance);

        // Using ternary operator to check balance status
        String status = (finalBalance >= 5000) ? 
                        "Minimum Balance Maintained" : 
                        "Minimum Balance Not Maintained";

        System.out.println("Status: " + status);
    }
}
