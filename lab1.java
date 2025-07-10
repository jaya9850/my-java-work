import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[n];
        String[] addresses = new String[n];
        int[][] marks = new int[n][5];
        int[] total = new int[n];
        double[] average = new double[n];
        char[] grade = new char[n];

        // Input data
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.print("Address: ");
            addresses[i] = sc.nextLine();

            System.out.println("Enter marks of 5 subjects:");
            total[i] = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
                total[i] += marks[i][j];
            }
            sc.nextLine(); // consume newline

            average[i] = total[i] / 5.0;

            // Grade calculation
            if (average[i] >= 90)
                grade[i] = 'A';
            else if (average[i] >= 75)
                grade[i] = 'B';
            else if (average[i] >= 60)
                grade[i] = 'C';
            else if (average[i] >= 50)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        // Output data
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Name: " + names[i]);
            System.out.println("Address: " + addresses[i]);
            System.out.print("Marks: ");
            for (int j = 0; j < 5; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println("\nTotal: " + total[i]);
            System.out.println("Average: " + average[i]);
            System.out.println("Grade: " + grade[i]);
        }

        sc.close();
    }
}
