package com.natewarneck.bank;
import com.natewarneck.bank.model.Account;
import com.natewarneck.bank.model.Transaction;
import com.natewarneck.bank.model.User;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String username = "nate";
        
    }

    public void createAccount() {
        Account someAccount = new Account("ACC-001", "CHECKING", 0.0, new ArrayList<>());
    }
}