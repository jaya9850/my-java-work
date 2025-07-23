
import java.util.Scanner;

// Abstract class
abstract class MyBank {
    int acNo = 121;
    int pin = 111;

    Scanner sc = new Scanner(System.in);

    // Abstract method
    public abstract void login();
}

// Subclass implementing abstract method
class BankUser extends MyBank {

    @Override
    public void login() {
        System.out.print("Enter Account Number: ");
        int userAc = sc.nextInt();

        System.out.print("Enter PIN: ");
        int userPin = sc.nextInt();

        if (userAc == acNo && userPin == pin) {
            System.out.println("Login Successful ✅");
        } else {
            System.out.println("Login Failed ❌");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        BankUser user = new BankUser();
        user.login();
    }
}
