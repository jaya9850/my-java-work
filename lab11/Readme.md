# Java Lab 11 - Abstract Classes & Multilevel Inheritance

This lab includes two key concepts of Object-Oriented Programming in Java:

- ✅ Abstract Classes and Method Implementation
- ✅ Method Overriding using Multilevel Inheritance

---

## 📂 File Structure

Assignment1.java # Abstract class Shape with Circle and Rectangle
Assignment2.java # Multilevel inheritance with Animal, Dog, Cat



---

## ✅ Assignment 1: Abstract Class `Shape`

### 🔹 Description:
- An abstract class `Shape` with an abstract method `calculateArea()`.
- Two subclasses:
  - `Circle` implements `calculateArea()` as π × r²
  - `Rectangle` implements `calculateArea()` as length × width
- Program calculates and prints areas of both shapes.

### 🏃 Run:
```bash
javac Assignment1.java
java Assignment1

🧾 Sample Output:
mathematica
Copy code
Area of Circle: 78.53981633974483
Area of Rectangle: 24.0



✅ Assignment 2: Method Overriding (Multilevel Inheritance)
🔹 Description:
Superclass Animal with method makeSound().

Subclass Dog overrides makeSound() to print: The dog barks.

Subclass Cat (extending Dog) overrides makeSound() to print: The cat meows.

Demonstrates method overriding and multilevel inheritance.

🔁 Although Dog and Cat are normally parallel subclasses, this lab uses multilevel inheritance as per instructions.

🏃 Run:
bash
Copy code
javac Lab11_Assignment2.java
java Lab11_Assignment2
🧾 Sample Output:
bash
Copy code
The animal makes a sound.
The dog barks.
The cat meows.

