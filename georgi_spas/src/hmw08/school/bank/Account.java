package hmw08.school.bank;

public class Account {
    // fields
    private String iban;
    private int counterIban;// give acoounts number
    private Client owner;
    private double balance;
    private double montlyInterestRate;
    private static Account[] accountDB = new Account[10];
    private static int countDB;
    private Bank bank;

    // constructor
    Account(Client owner, double balance, double montlyInterestRate) {

        if (setClient(owner) != null) {

            this.owner = owner;
            this.balance = balance;
            this.montlyInterestRate = montlyInterestRate;
            this.iban = "BG 500 STSBG 4566 48211235" + counterIban++;

        } else {
            this.owner = null;
        }

        // no new client owner is eqail to null
    }


    // property
// set iban
    private Client setClient(Client client) {
        for (int i = 0; i < countDB; i++) {
            // check exist name

            Account operAccount = accountDB[i];
            if (operAccount.getClient().getName().equals(client.getName())) {// found equals names
                // check iban to see are different persons
                // we make check for iban are same or different
                if (operAccount.ibanCheck(client.account.getIban())) {
                    return null;
                }


            }

        }
        // make new account
        return client;


    }

    //return counter iban
    public int getCounterIban() {
        return counterIban;
    }

    // return iban client
    public String getIban() {
        return this.iban;
    }


    // retun balance
    public double getBalance() {
        return this.balance;
    }

    // return type client
    public Client getClient() {
        return owner;
    }
    // return month rate

    public double getMonthRate() {
        return this.montlyInterestRate;
    }
    // setters

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMontlyInterestRate(double montlyInterestRate) {
        this.montlyInterestRate = montlyInterestRate;
    }
    // methods
    // make account


    // make new account and  type of account deppends of type client
    public boolean openAccount(Account account) {

        if (setClient(account.owner) != null) {
            // open account in bank take iban
            accountDB[countDB++] = account;
            return bank.openAccount(account);
        }
        // exist account client in bank
        return false;

    }



    // check iban
    public boolean ibanCheck(String iban) {
        // return true if we have exist iban
        return this.iban.equals(iban);
    }

}
