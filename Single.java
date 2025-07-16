import java.util.Scanner;

// Parent class
class swap_3 {
    int a, b;

    void input_num() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num (a): ");
        a = sc.nextInt();
        System.out.print("Enter first num (b): ");
        b = sc.nextInt();
    }

    void swap_2() { // Swap using third variable
        System.out.println("\nSwapping using third variable...");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}

// Child class
class swap_without_3 extends swap_3 {
    void swap_without_3() {
        System.out.println("\nSwapping without using third variable...");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}

// Main class
public class Single {
    public static void main(String[] args) {
        swap_without_3 obj = new swap_without_3();  // create object

        obj.input_num();         // take input
        obj.swap_2();            // swap using 3rd variable
        obj.swap_without_3();    // swap without using 3rd variable
    }
}
