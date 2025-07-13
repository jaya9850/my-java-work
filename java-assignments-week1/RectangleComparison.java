public class Rectangle {
    int length;
    int width;

    // Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public int getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        // Creating two rectangle objects
        Rectangle rectangle1 = new Rectangle(10, 5);
        Rectangle rectangle2 = new Rectangle(8, 6);

        int area1 = rectangle1.getArea();
        int area2 = rectangle2.getArea();

        System.out.println("Area of Rectangle1: " + area1);
        System.out.println("Area of Rectangle2: " + area2);

        // Comparing using relational operator
        if (area1 > area2) {
            System.out.println("Rectangle1 > Rectangle2");
        } else if (area1 < area2) {
            System.out.println("Rectangle1 < Rectangle2");
        } else {
            System.out.println("They are equal");
        }
    }
}
