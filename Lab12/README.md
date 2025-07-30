# Lab12

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



