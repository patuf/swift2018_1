package swift2018_1.hristo.hwk_08.Task1.Bank.Account;

import swift2018_1.hristo.hwk_08.Task1.Bank.Customer.Customer;

import java.time.LocalDate;

public class Account {

    public String IBAN;
    public Customer owner;
    public double balance;
    public double monthlyInterestRate;
    public LocalDate date;
    private static int count = 1;

    public Account(Customer owner, double balance, double montlyInterestRate) {
        this.IBAN = String.format("%08d", count++);
        this.owner = owner;
        this.balance = balance;
        this.monthlyInterestRate = montlyInterestRate;
    }

    public boolean setMonthlyInterestRate(){
        return true;
    }

    public Customer getOwner() {
        return owner;
    }

    public String getIBAN() {
        return IBAN;
    }
}
