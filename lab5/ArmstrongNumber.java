import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();
        printArmstrongNumber(start, end);
    }

    static void printArmstrongNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            int num = i, sum = 0;
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num + " is an Armstrong number.");
            }
        }
    }
}
