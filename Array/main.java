




//Suppose you want to store marks for students where each student has a different number of subjects.



public class JaggedArrayExample {
    public static void main(String[] args) {
        // Declare a jagged array
        int[][] marks = new int[3][];
        marks[0] = new int[2]; // Student 1: 2 subjects
        marks[1] = new int[3]; // Student 2: 3 subjects
        marks[2] = new int[1]; // Student 3: 1 subject

        // Assign values
        marks[0][0] = 90; marks[0][1] = 85;
        marks[1][0] = 78; marks[1][1] = 88; marks[1][2] = 92;
        marks[2][0] = 80;

        // Print the jagged array
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i+1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
