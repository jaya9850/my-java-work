class AverageThread extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        double avg = sum / 10.0;
        System.out.println("Average of first 10 numbers: " + avg);
    }
}

class SquareThread extends Thread {
    public void run() {
        int[] arr = {1, 20, 50, 15, 30};
        System.out.println("Squares of array elements:");
        for (int num : arr) {
            System.out.println(num + "^2 = " + (num * num));
        }
    }
}

public class  P1 {
    public static void main(String[] args) {
        AverageThread t1 = new AverageThread();
        SquareThread t2 = new SquareThread();

        t1.start();
        try {
            t1.join(); // Wait for t1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        try {
            t2.join(); // Wait for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
