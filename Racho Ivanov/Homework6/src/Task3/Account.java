package Task3;

import Task2.Credentials;

public class Account extends Credentials
{
    private final String govId;
    private String userName;
    private double balance;

    public Account(String name, String password, String govId, String userName)
    {
        super(name, password);
        this.govId = govId;
        this.userName = userName;
        this.balance = 0;
    }

    public String getGovId()
    {
        return govId;
    }

    public String getUserName()
    {
        return userName;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        if (amount > 0)
            balance+=amount;
    }

    public void withdraw(double amount)
    {
        if (amount > 0)
            balance-=amount;
    }

    public boolean hasAccess(String password)
    {
        return super.getPassword(password);
    }


}
