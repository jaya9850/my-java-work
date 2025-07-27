enum BankName {
    ICICI(6.3),
    HDFC(5.8),
    SBI(6.0);

    double interestRate;

    BankName(double interestRate) {
        this.interestRate = interestRate;
    }
}

class BankAccount {
    String accountHolderName;
    BankName bankName;
    double accountBalance;

    public BankAccount(double initialBalance, String accountHolderName, BankName bankName) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    public double calculateInterest(int numberOfYears) {
        return (bankName.interestRate * numberOfYears * accountBalance) / 100;
    }

    public void display() {
        System.out.println(accountHolderName + " - " + bankName + " - Balance: ₹" + accountBalance + 
                           " - Interest (5 years): ₹" + calculateInterest(5));
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(12000, "Harry", BankName.SBI);
        BankAccount acc2 = new BankAccount(15000, "Rina", BankName.HDFC);
        BankAccount acc3 = new BankAccount(10000, "Arjun", BankName.ICICI);

        acc1.display();
        acc2.display();
        acc3.display();
    }
}
