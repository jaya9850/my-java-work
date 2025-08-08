combination of charachters, sequence of char
String class
common operation 
concatenation
length
Here’s a summary of your requested concepts related to Java’s String:

1. **Combination of characters / Sequence of char:**  
   In Java, a String is a sequence of characters. Internally, it is implemented as an array of char values.

2. **String class:**  
   - String is a built-in class in Java (java.lang.String).
   - String objects are immutable, meaning once created, their values cannot be changed.
   - You can create strings like:  
     ```java
     String s1 = "Hello";
     String s2 = new String("World");
     ```

3. **Common operations on String:**

   - **Concatenation (joining strings):**
     - Using + operator:
       ```java
       String s3 = s1 + " " + s2; // "Hello World"
       ```
     - Using concat() method:
       ```java
       String s4 = s1.concat(" Java"); // "Hello Java"
       ```
   - **Length (finding the number of characters):**
     - Use length() method:
       ```java
       int len = s3.length(); // returns length of s3
       ```

**Example:**
```java
String s1 = "Hello";
String s2 = "World";
String combined = s1 + " " + s2; // Concatenation
int length = combined.length(); // Length
System.out.println(combined); // Output: Hello World
System.out.println(length);   // Output: 11
```

If you want more details or other String operations (like substring, compare, etc.), let me know!
