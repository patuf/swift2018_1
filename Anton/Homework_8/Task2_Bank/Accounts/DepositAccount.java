package Task2_Bank.Accounts;

public class DepositAccount {
    private String name;
    private double balance = 0.0;
    private double monthyInterestRate = 0.0;
    private int IBAN;

    public DepositAccount(String name, int IBAN, double balance, double monthyInterestRate){
        this.name = name;
        this.IBAN = IBAN;
        this.balance = balance;
        this.monthyInterestRate = monthyInterestRate;

    }


    public void deposit ( int amount){
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public int getIBAN(){
        return IBAN;
    }

    public void setIBAN(int IBAN){
        this.IBAN = IBAN;
    }
}
