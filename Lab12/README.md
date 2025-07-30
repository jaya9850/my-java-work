# Session 4 – Exception Handling Lab (Java)

## Overview
In this lab you will build two small Java programs that practice **exception handling**. You’ll learn to validate user input and handle common runtime errors using `try`/`catch`/`finally`.

## Learning Objectives
- Handle `InputMismatchException` when reading primitive types from `Scanner`.
- Convert strings to integers with `Integer.parseInt()` and handle `NumberFormatException`.
- Recognize and safely guard against `NullPointerException`.
- Write clear prompts, validation loops, and helpful error messages.

## Tasks
1. **Prompt for an integer** and handle `InputMismatchException` if the user enters a non‑integer value.  
2. **Convert user input to an integer** using `Integer.parseInt()` and handle both `NumberFormatException` and `NullPointerException` during conversion.

## Prerequisites
- Java 17+ (or any modern LTS JDK)
- Terminal/Command Prompt, or an IDE like IntelliJ IDEA / VS Code / Eclipse

## Suggested Project Structure
```
lab-exceptions/
├─ src/
│  ├─ Task1_InputMismatch.java
│  └─ Task2_ParseInt.java
└─ README.md
```

## Getting Started
1. Create a new folder `lab-exceptions` and a subfolder `src`.
2. Inside `src`, create the two Java files shown above.
3. Compile and run from the terminal:
   ```bash
   javac src/*.java
   # Run Task 1
   java -cp src Task1_InputMismatch
   # Run Task 2
   java -cp src Task2_ParseInt
   ```
   > If your classes declare a package, compile and run with the matching folder structure and `-cp` accordingly.

---

## Task 1: Read an Integer Safely (`InputMismatchException`)
**Goal:** Prompt until the user provides a valid integer.  
**Hints:**
- Use `Scanner` and `nextInt()` inside a loop.
- Wrap `nextInt()` in `try { ... } catch (InputMismatchException e) { ... }`.
- On error, print a clear message, consume the invalid token with `scanner.next()`, and re‑prompt.
- Optionally include a `finally` block to close your scanner.

**Sample Interaction**
```
Enter an integer: hello
That isn't an integer. Try again.
Enter an integer: 42
Thanks! You entered: 42
```

---

## Task 2: Convert String to Int Safely
**Goal:** Read a line of text and convert it to an `int` with `Integer.parseInt()` while handling:
- `NumberFormatException` (e.g., input like `abc`, `12.3`, or empty string)
- `NullPointerException` (e.g., if the reference you parse is `null`)

**Notes & Hints:**
- With `Scanner`, `nextLine()` returns an empty string for blank input, not `null`. To demonstrate `NullPointerException` intentionally, you can set the reference to `null` in a controlled branch (for example, if the user types the word `null`, assign `input = null` before parsing).
- Validate the string: trim whitespace, check it’s not empty, then parse.
- Print clear success/error messages and re‑prompt if needed.

**Sample Interactions**
```
Enter a number to parse: abc
Not a valid integer (NumberFormatException). Try again.
Enter a number to parse: 99
Parsed value = 99
```
```
Enter a number to parse: null
Encountered a null reference (NullPointerException). Please enter a non-empty value.
Enter a number to parse: 15
Parsed value = 15
```

---

## Testing Checklist
- Task 1
  - Valid integer (e.g., `7`)
  - Non‑integer token (e.g., `x`, `3.14`, `@`)
  - Multiple invalid attempts followed by a valid integer
- Task 2
  - Valid integer string (e.g., `123`)
  - Non‑numeric string (e.g., `abc`, `12a`)
  - Empty string (should be rejected before parsing)
  - Deliberate `null` case (type `null` to trigger the controlled branch)

## Troubleshooting
- **`InputMismatchException` fires repeatedly**: Make sure to consume the bad token with `scanner.next()` before looping.
- **No `NullPointerException` shows up in Task 2**: Remember that user input via `nextLine()` isn’t `null`. Use a controlled branch to set the reference to `null` for demonstration, or add a path that passes `null` to `parseInt`.
- **`ClassNotFoundException` when running**: Ensure your class names match the file names and your `-cp` includes the `src` directory.

## Extension Ideas (Optional)
- Add attempt limits and exit gracefully after too many failures.
- Log errors to a file.
- Extract parsing logic into utility methods and write unit tests with JUnit.

---

## Example Skeletons (Optional)
> These are minimal templates you can copy into your files.

**`Task1_InputMismatch.java`**
```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_InputMismatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Enter an integer: ");
                try {
                    int n = sc.nextInt();
                    System.out.println("Thanks! You entered: " + n);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("That isn't an integer. Try again.");
                    sc.next(); // consume invalid token
                }
            }
        } finally {
            sc.close();
        }
    }
}
```

**`Task2_ParseInt.java`**
```java
import java.util.Scanner;

public class Task2_ParseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Enter a number to parse: ");
                String input = sc.nextLine();
                if ("null".equalsIgnoreCase(input)) {
                    input = null; // deliberate NPE path for demonstration
                }
                try {
                    if (input == null || input.trim().isEmpty()) {
                        throw new NullPointerException("Input is null or empty");
                    }
                    int value = Integer.parseInt(input.trim());
                    System.out.println("Parsed value = " + value);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Not a valid integer (NumberFormatException). Try again.");
                } catch (NullPointerException e) {
                    System.out.println("Encountered a null reference (NullPointerException). Please enter a non-empty value.");
                }
            }
        } finally {
            sc.close();
        }
    }
}
```
