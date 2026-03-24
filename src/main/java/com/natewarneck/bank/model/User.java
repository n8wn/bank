package com.natewarneck.bank.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    private String userId;
    private String username;
    private String hashedPassword;   // never store plain text
    private boolean isAdmin;
    private List<Account> accounts = new ArrayList<>();

    public User(String userId,
                String username,
                String hashedPassword,
                boolean isAdmin,
                List<Account> accounts) {
        this.userId = userId;
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.isAdmin = isAdmin;
        this.accounts = accounts;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}