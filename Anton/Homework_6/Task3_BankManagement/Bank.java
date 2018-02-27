package Task3;

import javafx.css.ParsedValue;

import java.text.ParseException;

public class Bank {
    private Account[] Accounts;
    private double Assets;
    private int accountsCount = 0;

    public Bank() {
        this(5);
    }

    public Bank(int maxAccounts) {
        this.Accounts = new Account[maxAccounts];
    }

    public boolean openAccount(String name, String govId, String UserName, String Password) {
        if (accountsCount >= Accounts.length) {
            return false;
        }
        if (UserNameCheck(UserName)) {
            return false;
        }
        if (govIdCheck(govId)) {
            return false;
        }
        Credentials Creds = new Credentials(UserName, Password);
        this.Accounts[accountsCount++] = new Account(name, govId, Creds);
        return true;
    }

    public boolean closeAccount(String userName, String pass) {
        int AccID = findUserID(userName);
        if (Accounts[AccID] == null) {
            return false;
        }
        if (UserNameCheck(userName) && Accounts[AccID].hasAccess(pass)) {
            Accounts[AccID] = null;
            accountsCount--;
            return true;
        }
        return false;
    }

    public boolean deposit(String UserName, double amount) {
        int AccID = findUserID(UserName);
        if (Accounts[AccID] == null) {
            return false;
        }
        if (UserNameCheck(UserName)) {
            Accounts[AccID].deposit(amount);
            Assets += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(String UserName, String Password, double amount) {
        int AccID = findUserID(UserName);
        if (Accounts[AccID] == null) {
            return false;
        }
        if (UserNameCheck(UserName) && Accounts[AccID].hasAccess(Password)) {
            Accounts[AccID].withdraw(amount);
            Assets -= amount;
            return true;
        }
        return false;
    }

    public boolean transfer(String UserName, String Password, double amount, String recipient) {
        if (amount < 0)
            return false;
        int accId = findUserID(UserName);
        int recAccId = findUserID(recipient);
            if (accId > -1 && UserNameCheck(UserName) && Accounts[accId].hasAccess(Password) && Accounts[accId].getBalance() > amount) {
                Accounts[accId].withdraw(amount);
                Accounts[recAccId].deposit(amount);
                return true;
            }
        return false;
    }

    public double showBalance(String userName, String Password) {
        int AccID = findUserID(userName);
        if(UserNameCheck(userName) && Accounts[AccID].hasAccess(Password)){
             return Accounts[AccID].getBalance();
        }
        return -1;
    }

    private int findUserID(String UserName) {
        for (int i = 0; i < Accounts.length; i++) {
            if(Accounts[i] == null){
                return -1;
            }
            if (Accounts[i].getCredentialName().equals(UserName))
                return i;
        }
        return -1;
    }

    private boolean UserNameCheck(String userName) {
        for (int i = 0; i < Accounts.length; i++) {
            if (Accounts[i] == null) {
                return false;
            }
            if (Accounts[i].getCredentialName().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    private boolean govIdCheck(String govId) {
        for (int i = 0; i < Accounts.length; i++) {
            if (Accounts[i] == null) {
                return false;
            }
            if (Accounts[i].getGovId().equals(govId)) {
                return true;
            }
        }
        return false;
    }

    public double getAssets() {
        return Assets;
    }

    public Account[] getAccounts() {
        return Accounts;
    }
}