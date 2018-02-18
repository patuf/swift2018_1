package com.swift.academy.homework06.task3;

import com.swift.academy.homework06.task2.Credentials;

public class Account {
    private String name;
    private String govId;
    private Credentials user;
    private double balance = 0;

    public Account(String name, String govId, Credentials user) {
        this.name = name;
        this.govId = govId;
        this.user = user;
    }

    public void deposit(double amount) {
        this.balance+=amount;
    }

    public void withdraw(double amount) {
        this.balance-=amount;
    }

    public double getBalance() {
        return balance;
    }

    public boolean hasAccess(String password) {
        return user.passMatch(password);
    }

    public String getUserName() {
        return user.getUserName();
    }

    public String getName() {
        return this.name;
    }

    public String getGovId() {
        return this.govId;
    }
}
