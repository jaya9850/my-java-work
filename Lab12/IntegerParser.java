
import java.util.Scanner;

public class IntegerParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        String userInput = scanner.nextLine();
        
        try {
            // Check for null input
            if (userInput == null) {
                throw new NullPointerException("Input cannot be null.");
            }
            
            // Attempt to parse the input to an integer
            int number = Integer.parseInt(userInput);
            System.out.println("The integer value is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter a valid integer.");
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
