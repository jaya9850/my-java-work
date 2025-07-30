// File: Exception/DrivingLicenseTest.java
import java.util.Scanner;

public class DrivingLicenseTest {
    public static void checkEligibility(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("You are under age for a driving license!");
        } else {
            System.out.println("You are eligible for a driving license.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkEligibility(age);
        } catch (UnderAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
