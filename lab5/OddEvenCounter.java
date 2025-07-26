import java.util.Scanner;

public class OddEvenCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd = 0, even = 0;

        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            int num = sc.nextInt();
            if (num == -1) break;

            if (num % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Total Even numbers: " + even);
        System.out.println("Total Odd numbers: " + odd);
    }
}
