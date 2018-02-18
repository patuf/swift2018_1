package BankManagment;

import CredentialManager.Credentials;

public class Account {
    private String name;
    private String govld;
    private double balance = 0;
    private String username;
    private String password;
    Credentials user = new Credentials(username,password) ;

    public Account(String Name, String id, String userName,String pass){
        name = Name;
        govld = id;
        username = userName;
        password = pass;
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
        return username;
    }
    public String getName(){
        return name;
    }

    public String getGovld() {
        return govld;
    }
}
