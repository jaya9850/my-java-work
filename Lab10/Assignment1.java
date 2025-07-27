interface BankOperations {
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
}

class BankAccount implements BankOperations {
    String accountHolderName;
    String bankName;
    double accountBalance;

    public BankAccount(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println(accountHolderName + " deposited ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println(accountHolderName + " withdrew ₹" + amount);
        } else {
            System.out.println("Insufficient balance for " + accountHolderName);
        }
    }

    public void display() {
        System.out.println(accountHolderName + " (" + bankName + ") - Balance: ₹" + accountBalance);
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Aarav", "ICICI", 10000);
        BankAccount acc2 = new BankAccount("Meera", "HDFC", 12000);
        BankAccount acc3 = new BankAccount("Ravi", "SBI", 15000);

        acc1.deposit(2000);
        acc1.withdraw(3000);
        acc1.display();

        acc2.deposit(1500);
        acc2.withdraw(4000);
        acc2.display();

        acc3.deposit(500);
        acc3.withdraw(10000);
        acc3.display();
    }
}
