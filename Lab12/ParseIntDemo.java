import java.util.Scanner;

public class ParseIntDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something to convert to integer: ");
        String input = null;
        try {
            input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        } catch (NullPointerException e) {
            System.out.println("No input provided!");
        } finally {
            scanner.close();
        }
    }
}
