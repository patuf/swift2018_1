package com.swift.academy.homework06.task3;

import com.swift.academy.homework06.task2.Credentials;

public class Bank {
    private final Account[] accounts;
    private int accountsCount = 0;
    private double assets = 0;

    public Bank() {
        this(5);
    }

    public Bank(int maxAcocunts) {
        this.accounts = new Account[maxAcocunts];
    }

    public boolean openAccount(String userName, String password, String name, String govId) {
        if (accountsCount >= accounts.length)
            // We're over the max acocunt limit for this bank
            return false;
        // Existing user check by userName
        int accIdx = findAccountIdx(userName);
        if (accIdx > -1)
            return false;
        // In case we need to check Gov Id duplications as well
//        accIdx = findAccountIdxbyGovId(govId);
//        if (accIdx > -1)
//            return false;

        Credentials cred = new Credentials(userName, password);
        this.accounts[accountsCount++] = new Account(name, govId, cred);
        return true;
    }

    public boolean closeAccount(String userName, String password) {
        int accIdx = findAccountIdx(userName);
        if (accIdx > -1 && accounts[accIdx].hasAccess(password)) {
            assets -= accounts[accIdx].getBalance();
            accountsCount--;
            for (int i = accIdx; i < accountsCount; i++) {
                accounts[i] = accounts[i + 1];
            }
            return true;
        } else
            return false;
    }

    public boolean deposit(String userName, double amount) {
        if (amount < 0)
            return false;
        int accIdx = findAccountIdx(userName);
        if (accIdx > -1) {
            accounts[accIdx].deposit(amount);
            assets += amount;
            return true;
        } else
            return false;
    }

    public boolean withdraw(String userName, String password, double amount) {
        if (amount < 0)
            return false;

        int accIdx = findAccountIdx(userName);
        if (accIdx > -1 && accounts[accIdx].hasAccess(password) && accounts[accIdx].getBalance() > amount) {
            accounts[accIdx].withdraw(amount);
            assets -= amount;
            return true;
        } else
            return false;
    }

    public boolean transfer(String userName, String password, double amount, String recipient) {
        if (amount < 0)
            return false;
        int accIdx = findAccountIdx(userName);
        int recAccIdx = findAccountIdx(recipient);
        if (accIdx > -1 && recAccIdx > -1 && accounts[accIdx].hasAccess(password) && accounts[accIdx].getBalance() > amount ) {
            accounts[accIdx].withdraw(amount);
            accounts[recAccIdx].deposit(amount);
            return true;
        } else
            return false;
    }

    public double getAssets() {
        return assets;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    private int findAccountIdx(String userName) {
        for (int i = 0; i < accountsCount; i++) {
            if (accounts[i].getUserName().equals(userName))
                return i;
        }
        return -1;
    }

    private int findAccountIdxbyGovId(String govId) {
        for (int i = 0; i < accountsCount; i++) {
            if (accounts[i].getGovId().equals(govId))
                return i;
        }
        return -1;
    }
}
