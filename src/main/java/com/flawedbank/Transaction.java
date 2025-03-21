package com.flawedbank;

public class Transaction {
    private final String transactionId;
    private final String date; // Could use LocalDate, but using a simple String instead
    public double amount;

    public Transaction(String transactionId, String date, double amount) {
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
    }

    public String getTransactionDetails() {
        return "Transaction ID: " + this.transactionId +
                ", Date: " + this.date +
                ", Amount: " + this.amount;
    }
}
