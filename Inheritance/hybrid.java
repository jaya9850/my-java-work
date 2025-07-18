package inheritance;
import java.util.Scanner;

public class Hybrid {
    int[] num;
    int i;
    Scanner sc = new Scanner(System.in);

    // Method for finding greatest among 3 numbers
    void calgrt() {
        num = new int[3];
        System.out.println("Enter 3 numbers:");
        for (i = 0; i < 3; i++) {
            num[i] = sc.nextInt();
        }
        if (num[0] > num[1] && num[0] > num[2]) {
            System.out.println(num[0] + " is greatest");
        } else if (num[1] > num[0] && num[1] > num[2]) {
            System.out.println(num[1] + " is greatest");
        } else {
            System.out.println(num[2] + " is greatest");
        }
    }

    void swap() {
        num = new int[2];
        System.out.println("Enter two numbers:");
        for (i = 0; i < 2; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Before Swapping: " + num[0] + " and " + num[1]);
        int temp = num[0];
        num[0] = num[1];
        num[1] = temp;
        System.out.println("After Swapping: " + num[0] + " and " + num[1]);
    }

    // Method for Armstrong number
    void checkArmstrong() {
        System.out.println("Enter number to check Armstrong:");
        int nums = sc.nextInt();
        int org = nums, remd, result = 0;
        while (org != 0) {
            remd = org % 10;
            result += remd * remd * remd;
            org /= 10;
        }
        if (result == nums) {
            System.out.println(nums + " is an Armstrong number.");
        } else {
            System.out.println(nums + " is NOT an Armstrong number.");
        }
    }

    // Main method to call all methods
    public static void main(String[] args) {
        Hybrid obj = new Hybrid();
        obj.calgrt();
        obj.swap();
        obj.checkArmstrong();
    }
}
