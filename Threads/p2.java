class RaceThread extends Thread {
    public RaceThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - iteration " + i);
            try {
                Thread.sleep(500); // 500ms delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RaceDemo {
    public static void main(String[] args) {
        RaceThread t1 = new RaceThread("Thread-A");
        RaceThread t2 = new RaceThread("Thread-B");
        RaceThread t3 = new RaceThread("Thread-C");

        t1.setPriority(Thread.MIN_PRIORITY); // Lowest priority
        t2.setPriority(Thread.NORM_PRIORITY); // Normal priority
        t3.setPriority(Thread.MAX_PRIORITY); // Highest priority

        t1.start();
        t2.start();
        t3.start();
    }
}
