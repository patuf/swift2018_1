package Bank;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    private final String name;
    private  int IBAN;
    private double balance;
    private double monthlyInterestRate;
    private List<Customers> owner = new ArrayList<Customers>();

    Account(String name, double balance,double monthlyIR){
        this.name = name;
        this.balance = balance;
        monthlyInterestRate = monthlyIR;
    }
    public boolean addOwner( Customers person){
        if(findByName(person.getName()) >-1){
            this.owner.add(person);
            return true;
        }
        return false;
    }
    public boolean deposit(double sum){
        if(sum<0)return false;
        balance += sum;
        return true;
    }

    protected int findByName(String name) {
        for(int i=0; i<owner.size();i++){
            if(owner.get(i).getName().equals(name)) return i;
        }
        return -1;
    }

    public double getBalance() {
        return balance;
    }

    public void setIBAN(int IBAN) {
        this.IBAN = IBAN;
    }

    public int getIBAN() {
        return IBAN;
    }
}
