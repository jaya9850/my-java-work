Exception:run time error / exection mode process is stop or break
error: syntax error, logical error error can resolved 
If you tell your program to open a file that isn’t there, it throws an exception to warn you, so you can fix the issue or prevent a crash.

Summary:
Exception = Run-time error that needs special handling in your code.


for eg college picnic, we are going tp picnic by bus suddenly  bus is stop after an hrs
 Bank machine : cash withdraw and deposite machine and last get you recpit

expection object:
why expection handling 
Exception object:
In Java, an exception object stores information about an error that happens during your program’s execution. It contains details like the error type, where it happened, and a message describing the problem.

Why exception handling?
Exception handling is used to manage errors gracefully in your program. Instead of crashing when something goes wrong, exception handling helps you:

Catch errors: Detect problems and respond.
Show friendly messages: Explain the error to users.
Continue program: Allow your program to keep running safely.
Debug easily: Find and fix mistakes faster.
Summary:
Exception handling lets you control what happens when errors occur, making your program safer and easier to use.

1. try block
You write the code that might cause an exception inside a try block.

2. catch block
If an exception happens, Java jumps to the catch block, where you can write code to handle the error (like showing a message or fixing the problem).

3. finally block (optional)
Code inside finally always runs, whether there was an exception or not. It’s useful for things like closing files or cleaning up resources.

Example:

Java
try {
    // Code that might cause an exception
    int result = 10 / 0;
} catch (ArithmeticException e) {
    // Code to handle the exception
    System.out.println("Cannot divide by zero!");
} finally {
    // Code that always runs
    System.out.println("This will always print.");
}
Summary:
Use try to watch for errors, catch to handle them, and finally for cleanup. This way, your program doesn’t crash and can deal with problems smoothly.

1. Checked Exceptions
These are exceptions that the compiler checks at compile time.
You must handle these using try-catch or declare them with throws.
Example: IOException, SQLException.
2. Unchecked Exceptions
These are exceptions that occur at runtime; the compiler does not check them.
Handling them is optional.
Example: NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException.
3. Errors
These are serious problems your program usually cannot handle (like running out of memory).
Example: OutOfMemoryError, StackOverflowError.
