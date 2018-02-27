package Task2_Bank.Accounts;
import Task2_Bank.Customers.Clients;

public class MortgageAccount {
    private String name;
    private double balance = 0.0;
    private double monthyInterestRate = 0.0;
    private int IBAN;

    public MortgageAccount(String name, int IBAN, double balance, double monthyInterestRate){
        this.name = name;
        this.IBAN = IBAN;
        this.balance = balance;
        this.monthyInterestRate = monthyInterestRate;
    }

    public void deposit ( int amount){
        this.balance += amount;
    }
}
