package ExceptionPro;
import java.util.Scanner;

public class expdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Addition: " + (a + b));
            System.out.println("Subtraction: " + (a - b));
            System.out.println("Multiplication: " + (a * b));
            System.out.println("Division: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter integers.");
        } finally {
            System.out.println("hi");
            System.out.println("bye");
            sc.close();
        }
    }
}

// sample output:

Enter first number: 4
Enter second number: 6
Addition: 10
Subtraction: -2
Multiplication: 24
Division: 0
hi
bye
