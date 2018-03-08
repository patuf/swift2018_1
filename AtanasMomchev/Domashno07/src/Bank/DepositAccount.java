package Bank;

public class DepositAccount extends Account{
    private double balance;
    DepositAccount(String name,double balance,double monthlyIR){
        super(name,balance,monthlyIR);
        this.balance = balance;
    }

   public boolean withdrawl(String name, double sum){
        if(findByName(name) == -1 || sum<0 || sum>balance) return false;
        balance -= sum;
        return true;
   }
}
