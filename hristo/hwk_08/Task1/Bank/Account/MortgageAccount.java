package swift2018_1.hristo.hwk_08.Task1.Bank.Account;

import swift2018_1.hristo.hwk_08.Task1.Bank.Customer.Customer;

public class MortgageAccount extends Account {


    public MortgageAccount(Customer owner, double balance, double montlyInterestRate) {
        super(owner, balance, montlyInterestRate);
    }

    private void depositing (Double amount){

        balance = balance + amount;
    }
}
