# Java Assignments - Week 2

This folder contains Java programs for **Week 2 - Session 1 Lab**, focusing on:
- Conditional statements
- Scanner input handling
- Interest calculation
- Grade evaluation
- Internet bill logic using conditions

---

## 📘 Assignment Details

### 🔹 1. `SimpleInterestCalculator.java`

**Objective:**  
Calculate simple interest based on the principal and time, using different interest rates:
- **10%** if principal > 10000
- **8%** if 5000 ≤ principal ≤ 10000
- **5%** if principal < 5000

**Features:**
- Uses `Scanner` for input
- Calculates interest: `SI = (P × R × T) / 100`
- Uses `if-else` blocks to determine the rate

---

### 🔹 2. `Marks & Grade Calculator`

**Objective:**  
Take input for 5 subjects, calculate total and average, and assign grades.

**Grade Rules:**
- >90%  → `Ex`
- >80%  → `A`
- >60%  → `B`
- ≥40%  → `C`
- <40%  → `F`

**Features:**
- Uses loop for input
- Calculates total and average
- Assigns grades using nested `if-else`

---

### 🔹 3. `InternetBillCalculator.java`

**Objective:**  
Calculate internet bill based on GB consumed.

**Billing Logic:**
- <10GB → Rs. 300 (base charge)
- 10–30GB → Rs. 300 + Rs.5/GB over 10
- >30GB → Rs. 400 + Rs.3/GB over 30

**Features:**
- Conditional `if-else` billing logic
- Input using `Scanner`

---

## 🧪 How to Compile & Run

```bash
javac SimpleInterestCalculator.java
java SimpleInterestCalculator

javac "Marks & Grade Calculator"
java "Marks & Grade Calculator"

javac InternetBillCalculator.java
java InternetBillCalculator
