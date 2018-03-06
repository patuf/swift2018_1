package hmw08.school.bank;

public class IndividualCustomer extends Client {


    // constructor
    IndividualCustomer(String name) {
        super(name);
    }

    // make account
    @Override

    public boolean openAccount(double balance, double montlyInterestRate) {

        Account account = new Account(this, balance, montlyInterestRate);
        if (account == null) {
            // no new account to create(exist account)
            return false;
        }
        // add new account
        return true;
    }
}
