package com.natewarneck.bank.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Transaction implements Serializable {
    private String transactionId;
    private String type;          // "DEPOSIT", "WITHDRAWAL", "TRANSFER"
    private double amount;
    private double balanceAfter;  // snapshot of balance at time of transaction
    private String description;   // e.g. "Transfer to ACC-002"
    private LocalDateTime timestamp;

    public Transaction(String transactionId,
                       String type,
                       double amount,
                       double balanceAfter,
                       String description,
                       LocalDateTime timestamp) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.description = description;
        this.timestamp = timestamp;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalanceAfter() {
        return balanceAfter;
    }

    public void setBalanceAfter(double balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}