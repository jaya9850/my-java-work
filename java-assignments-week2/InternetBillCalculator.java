import java.util.Scanner;

public class InternetBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total data consumed (in GB): ");
        double dataUsed = sc.nextDouble();

        double billAmount;

        if (dataUsed < 10) {
            billAmount = 300;
        } else if (dataUsed <= 30) {
            billAmount = 300 + 5 * (dataUsed - 10);
        } else {
            billAmount = 400 + 3 * (dataUsed - 30);
        }

        System.out.println("Total Monthly Bill: Rs. " + billAmount);

        sc.close();
    }
}
