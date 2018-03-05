package hmw08.school.bank;

public abstract class Client {
    private final String name;
   protected Account account;

    // constructor
    Client(String name) {
        this.name = name;
    }


    // property

    // return name
    public String getName() {
        return this.name;
    }


    // create account
// type of account depending from owr client
    abstract public boolean openAccount(double balance,double montlyInterestRate);
}