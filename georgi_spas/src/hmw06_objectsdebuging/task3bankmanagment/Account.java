package hmw06_objectsdebuging.task3bankmanagment;

import hmw06_objectsdebuging.task2credential.Credentials;

public class Account {
    private final String name;
    private final String govId;
    private double balance;
    private Credentials cr;

// constructor
    public Account(String name, String govId) {
        this.name = name;
        this.govId = govId;

    }


    // property return name account
    String getName() {
        return this.name;
    }

    // property return name from credentials
    String getUserName(){
        return cr.getUserName();
    }
    double getBalance() {
        return this.balance;
    }

    //property  take egn
    public String getGovId() {
        return this.govId;
    }
// property
    public void setCr(Credentials cr) {
        this.cr = cr;
    }


    // methods
    public void deposit(double amount) {
        this.balance += amount;
    }

    void withdraw(double amount) {
        this.balance -= amount;
    }


    boolean hasAccess(String password) {

        // i have exist password( is match)
        if (cr.passwordIsMatch(password)) {
            return true;
        }
        // passwprd don't exist(no matches)
        return false;

    }


}