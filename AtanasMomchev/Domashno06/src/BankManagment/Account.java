package BankManagment;

import CredentialManager.Credentials;

public class Account {
    private String name;
    private String govld;
    private double balance = 0;
    Credentials user ;

    public Account(String Name, String id, String userName,String pass){
        name = Name;
        govld = id;
        user = new Credentials(userName,pass);
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
    public boolean hasAccess(String password){
    return user.passwordCheck(password);
    }
    public String getUser(){
        return user.getUsername();
    }
    public String getName(){
        return name;
    }

    public String getGovld() {
        return govld;
    }
}
