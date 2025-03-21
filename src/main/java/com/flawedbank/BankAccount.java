package com.flawedbank;

// Comment explaining public data members - bad practice
public class BankAccount {
    public String accountHolderName; // Non-private fields
    public String accountNumber;     // Exposes sensitive information
    public double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Lengthy method for deposit, violates SRP
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited " + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrew " + amount);
        } else if (amount > this.balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + this.balance);
    }
}
