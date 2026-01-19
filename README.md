Multithreaded Bank Account Simulation (Java)
Overview

This project is a multithreaded banking simulation implemented in Java. It demonstrates how multiple users (threads) can safely perform deposit and withdrawal operations on a shared bank account using proper thread synchronization.

Real-life analogy:
Imagine a single bank account accessed by multiple ATM machines at the same time. Without coordination, balances could become incorrect. This project shows how Java ensures that only one ATM updates the balance at a time.

Key Concepts Demonstrated

Multithreading in Java

Thread synchronization

Race condition prevention

Shared resource management

Object-oriented design

Tech Stack

Language: Java

Core Concepts:

Threads

synchronized methods / blocks

OOP principles

Project Structure
Multithreaded-Bank-Account/
│
├── BankAccount.java        # Shared bank account (critical resource)
├── UserTransaction.java    # Thread representing a user transaction
├── Main.java               # Entry point of the application
└── README.md               # Documentation

How the System Works

A single BankAccount object is created

Multiple UserTransaction threads are spawned

Each thread performs either:

Deposit

Withdrawal

Synchronization ensures balance consistency

Analogy:
Only one person is allowed inside the bank vault at a time. Others must wait until the vault is free.

Class Responsibilities
BankAccount.java

Maintains the account balance

Provides synchronized methods for:

deposit()

withdraw()

Prevents inconsistent balance updates

UserTransaction.java

Implements or extends Thread

Represents a user performing a transaction

Knows:

Transaction type (deposit/withdraw)

Amount

Target bank account

Main.java

Application entry point

Creates:

Shared BankAccount

Multiple UserTransaction threads

Starts all threads to simulate concurrency

Why Synchronization Is Important

Without synchronization:

Two withdrawals may read the same balance

Money could be withdrawn twice

Final balance becomes incorrect

Analogy:
If two cashiers give money from the same drawer without checking updates, cash disappears.

How to Run the Project
Compile
javac Main.java

Run
java Main

Sample Output
User 1 deposited 500
User 2 withdrew 300
Final Balance: 1200


(Actual output may vary due to thread scheduling)

Learning Outcomes

Practical understanding of Java concurrency

Handling shared resources safely

Writing thread-safe classes

Real-world simulation of banking systems

Possible Enhancements

Add transaction logs

Support multiple bank accounts

Introduce thread pools

Add exception handling for insufficient balance

Implement ReentrantLock instead of synchronized
