public class Rectangle {
    double width;
    double height;

    enum Color {
        RED, GREEN, BLUE
    }

    Color boxColor;

    public static void main(String[] args) {
        System.out.println(Color.BLUE); // Prints: BLUE
    }
}
