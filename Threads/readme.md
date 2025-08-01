threds in java

In Java, a thread is a lightweight process that allows your program to perform multiple tasks at the same time (concurrent execution). Threads are a fundamental part of Java’s concurrency model, enabling efficient use of CPU resources and improving the performance of programs that handle many tasks simultaneously (like server applications, GUIs, or games).

### What is a Thread?
- A thread is a single sequence of execution within a program.
- Every Java application has at least one thread (the main thread), but you can create additional threads as needed.

### How Do Threads Work in Java?
1. **Thread Creation**
   - By extending the Thread class and overriding its run() method.
   - By implementing the Runnable interface and passing it to a Thread object.

2. **Starting a Thread**
   - Call the start() method on a Thread object. This invokes the run() method in a new thread of execution.

3. **Thread Lifecycle**
   - New: Thread is created but not yet started.
   - Runnable: Thread is ready to run and waiting for CPU.
   - Running: Thread is executing.
   - Blocked/Waiting: Thread is waiting for a resource or another thread.
   - Dead: Thread’s run() method has finished executing.

4. **Concurrency and Synchronization**
   - Multiple threads can run concurrently, sharing resources.
   - Java provides tools like synchronized blocks/methods and locks to control access to shared resources, preventing data corruption.

### Simple Example

```java
// Method 1: Extending Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running!");
    }
}

// Method 2: Implementing Runnable
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Using Thread
        MyThread t1 = new MyThread();
        t1.start();

        // Using Runnable
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }
}
```

### Why Use Threads?
- To perform tasks in parallel (e.g., downloading files, handling user input, etc.)
- To keep user interfaces responsive.
- To make better use of multicore processors.
