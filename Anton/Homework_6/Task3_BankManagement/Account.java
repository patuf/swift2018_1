package Task3;

public class Account {
    private Credentials Creds;
    private String name;
    private String govId;
    private double balance;

    public Account(String Name, String GovId, Credentials Creds) {
        this.name = Name;
        this.govId = GovId;
        this.Creds = Creds;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public boolean hasAccess(String password) {
        if (Creds.passMatch(password)) {
            return true;
        }
        return false;
    }

    public String getCredentialName() {
        return this.Creds.getUserName();
    }

    public String getGovId () {
        return govId;
    }

    public String getName(){
        return name;
    }
}