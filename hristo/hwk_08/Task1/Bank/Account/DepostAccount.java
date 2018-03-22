package swift2018_1.hristo.hwk_08.Task1.Bank.Account;

import swift2018_1.hristo.hwk_08.Task1.Bank.Customer.Customer;

public class DepostAccount extends Account{


    public DepostAccount(Customer owner, double balance, double montlyInterestRate) {
        super(owner, balance, montlyInterestRate);
    }

    private boolean withdraw(Double amount){

        if (amount > balance){
            balance = balance - amount;
            return false;
        }else return true;
    }

    private void depositing (Double amount){

        balance = balance + amount;
    }

    public boolean setMonthlyInterestRate(){
        return true;




    }


}
