package com.flawedbank;

import com.flawedbank.BankAccount; // Unused import
import java.util.ArrayList; // Unused import

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Flawed Banking System");
        // Hardcoded data and lack of any meaningful functionality
        BankAccount account = new BankAccount("John Doe", "1234567890", 1000.0);
        account.deposit(500);
        account.withdraw(200);
        account.displayBalance();

        // Duplicate code for no reason
        BankAccount duplicateAccount = new BankAccount("John Doe", "1234567890", 1000.0);
        duplicateAccount.deposit(500);
        duplicateAccount.withdraw(200);
        duplicateAccount.displayBalance();
    }
}
