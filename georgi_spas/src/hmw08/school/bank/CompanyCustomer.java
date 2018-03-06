package hmw08.school.bank;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

public class CompanyCustomer extends Client {


    // constructor
    CompanyCustomer(String name) {
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

