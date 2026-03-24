package com.natewarneck.bank.storage;

import java.util.ArrayList;
import java.util.List;

import com.natewarneck.bank.model.User;

public class AccountRepository {

    private static final String FILE_PATH = "bank_data.dat";

    public void saveUsers(List<User> users) {
        // write users to FILE_PATH using ObjectOutputStream
    }

    public List<User> loadUsers() {
        // read from FILE_PATH using ObjectInputStream
        // if file doesn't exist yet, return an empty ArrayList
        return new ArrayList<>(); // temporary until a the list of users can be aquired.
    }
}