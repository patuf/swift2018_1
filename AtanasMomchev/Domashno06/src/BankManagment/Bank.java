package BankManagment;

public class Bank {
    private Account [] acc = new Account[5];
    private int accCount = 0;
    private double assets = 0;

    public void openAccount(String name, String govld, String username, String password){
        if (accCount == 5){
            System.out.println("To many accounts");
        }else
        acc[accCount++] = new Account(name,govld,username,password);
    }

    public void closeAcc(String username, String password){
        if(indexOf(username) == -1){
            System.out.println("No such user.");
        }else if (acc[indexOf(username)].hasAccess(password)) {
            for (int i = indexOf(username); i < accCount-1; i++) {
                acc[i] = acc[i+1];
            }
            accCount--;
        }
    }

    public void deposit(String user, double amount){
        acc[indexOf(user)].deposit(amount);
        assets += amount;
    }

    public void withdraw(String user, String pass, double amount){
        if(indexOf(user) == -1){
            System.out.println("No such user.");
        }else {
            if (acc[indexOf(user)].hasAccess(pass) && acc[indexOf(user)].getBalance() > amount)
                acc[indexOf(user)].withdraw(amount);
            assets -= amount;
        }
    }

    public void transfer(String user, String pass, double amount, String recepient){
        Account accidx = acc[indexOf(user)];
        if(indexOf(user) == -1){
            System.out.println("No such user.");
        }else if(accidx.hasAccess(pass) && accidx.getBalance()<amount){
            accidx.withdraw(amount);
            acc[indexOf(recepient)].deposit(amount);
        }
    }

    public double getAssets() {
        return assets;
    }

    private int indexOf(String user){
        int i;
        for(i=0; i<accCount; i++){
            if(acc[i].getUser().equals(user)) return -1;
        }
        return i;
    }
}
