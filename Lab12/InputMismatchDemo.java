import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("That's not an integer!");
        } finally {
            scanner.close();
        }
    }
}


//output:
Enter an integer: asc
That's not an integer!

Enter an integer: 12
You entered: 12
