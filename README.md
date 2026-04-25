# 💰 Multithreaded Bank Account Simulation (Java)

## 📌 Overview

This project is a **multithreaded banking simulation** built in Java. It demonstrates how multiple users (threads) can safely perform **deposit** and **withdrawal** operations on a shared bank account using proper synchronization techniques.

**Real-life analogy:**
Think of a single bank account accessed by multiple ATMs at the same time. Without coordination, transactions could overlap and corrupt the balance. This system ensures that only one transaction updates the account at a time.

---

## 🧠 Key Concepts Demonstrated

* Multithreading in Java
* Thread synchronization
* Race condition prevention
* Shared resource management
* Object-oriented programming (OOP)

---

## 🛠️ Tech Stack

* **Language:** Java
* **Core Concepts:**

  * Threads
  * `synchronized` methods / blocks
  * OOP principles

---

## 📁 Project Structure

```
Multithreaded-Bank-Account/
│
├── BankAccount.java       # Shared bank account (critical resource)
├── UserTransaction.java   # Thread representing a user transaction
├── Main.java              # Entry point of the application
└── README.md              # Documentation
```

---

## ⚙️ How the System Works

1. A single `BankAccount` object is created
2. Multiple `UserTransaction` threads are initialized
3. Each thread performs either:

   * Deposit
   * Withdrawal
4. Synchronization ensures that only one thread modifies the balance at a time

**Analogy:**
Only one person is allowed inside the bank vault at a time. Others must wait until it becomes available.

---

## 🧩 Class Responsibilities

### 🔹 BankAccount.java

* Maintains account balance
* Provides synchronized methods:

  * `deposit()`
  * `withdraw()`
* Ensures thread-safe updates

---

### 🔹 UserTransaction.java

* Represents a user transaction using threads
* Handles:

  * Transaction type (deposit/withdraw)
  * Transaction amount
  * Target bank account

---

### 🔹 Main.java

* Entry point of the application
* Creates:

  * Shared `BankAccount` object
  * Multiple `UserTransaction` threads
* Starts threads to simulate concurrent execution

---

## ⚠️ Why Synchronization Is Important

Without synchronization:

* Multiple threads may access the same balance simultaneously
* Transactions may overwrite each other
* Final balance becomes inconsistent

**Analogy:**
If two cashiers withdraw money from the same drawer without coordination, the balance becomes incorrect.

---

## ▶️ How to Run the Project

### 🔧 Compile

```bash
javac Main.java
```

### ▶️ Run

```bash
java Main
```

---

## 📊 Sample Output

```
User 1 deposited 500  
User 2 withdrew 300  
Final Balance: 1200
```

> ⚠️ Output may vary due to thread scheduling.

---

## 🎯 Learning Outcomes

* Understanding Java concurrency fundamentals
* Writing thread-safe classes
* Managing shared resources effectively
* Simulating real-world banking scenarios

---

## 🚀 Future Enhancements

* Add transaction history logging
* Support multiple bank accounts
* Use `ExecutorService` for thread management
* Implement `ReentrantLock` instead of `synchronized`
* Add validation for insufficient balance

##
