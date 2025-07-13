import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double rate;

        if (principal > 10000) {
            rate = 10;
        } else if (principal >= 5000) {
            rate = 8;
        } else {
            rate = 5;
        }

        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is: Rs. " + interest);

        sc.close();
    }
}
