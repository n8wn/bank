package com.natewarneck.bank.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Account implements Serializable {
    private String accountId;        // e.g. "ACC-001"
    private String accountType;      // "CHECKING" or "SAVINGS"
    private double balance;
    private List<Transaction> transactionHistory = new ArrayList<>();

    public Account(String accountId,
                   String accountType,
                   double balance,
                   List<Transaction> transactionHistory) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.balance = balance;
        this.transactionHistory = transactionHistory;
    }

    public String generateAccountId() {
        // generate a unique account ID, e.g. "ACC-002"
        return "ACC-001"; // temporary until a better ID generation strategy can be implemented
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }
}