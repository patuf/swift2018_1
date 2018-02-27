package Task2_Bank.Accounts;
import Task2_Bank.Customers.Clients;

public class Accounts{
    private Clients client;
    private DepositAccount[] depositAccount;
    private MortgageAccount[] mortgageAccount;
    private LoanAccount[] loanAccount;
    private int depAccCounter = 0;
    private int morAccCounter = 0;
    private int loanAccCounter = 0;
    private int IBAN=10000;

    public int OpenAccount(String name, int customerType, int accType, double balance, double monthyRate) {
        if (accType == 1) {
            client.OpenClientType(name, customerType);
            this.depositAccount[++depAccCounter] = new DepositAccount(name, ++IBAN, balance, monthyRate);
            return IBAN;
        }
        if (accType == 2) {
            client.OpenClientType(name, customerType);
            this.loanAccount[++loanAccCounter]= new LoanAccount(name, ++IBAN, balance, monthyRate);
            return IBAN;
        }
        if (accType == 3) {
            client.OpenClientType(name, customerType);
            this.mortgageAccount[++morAccCounter] = new MortgageAccount(name, ++IBAN, balance, monthyRate);
            return IBAN;
        }
        return -1;
    }

    public int getIBAN(){
        return IBAN;
    }

}