import java.util.Scanner;

public class GrossSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter basic salary: ");
            double basic = sc.nextDouble();
            double hra, da, gross;

            if (basic > 15000) {
                hra = 0.2 * basic;
                da = 0.6 * basic;
            } else {
                hra = 3000;
                da = 0.7 * basic;
            }

            gross = basic + hra + da;
            System.out.println("Gross Salary: " + gross);

            System.out.print("Enter -1 to calculate for another employee or any other number to exit: ");
            int choice = sc.nextInt();
            if (choice != -1) break;
        }
    }
}
