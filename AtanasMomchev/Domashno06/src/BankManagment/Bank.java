package BankManagment;

public class Bank {
    private Account [] acc = new Account[5];
    private int accCount = 0;
    private double assets = 0;

    public boolean openAccount(String name, String govld, String username, String password){
        if (accCount == 5){
            System.out.println("To many accounts");
            return false;
        }else {
            acc[accCount++] = new Account(name, govld, username, password);
            return true;
        }
    }

    public boolean closeAcc(String username, String password){
        if (acc[indexOf(username)].hasAccess(password)) {
            for (int i = indexOf(username); i < accCount-1; i++) {
                acc[i] = acc[i + 1];
                accCount--;
            }
            return true;
        }
        return false;
    }

    public boolean deposit(String user, double amount){
        if(indexOf(user) != -1) {
            acc[indexOf(user)].deposit(amount);
            assets += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(String user, String pass, double amount){
        if(indexOf(user) == -1){
            System.out.println("No such user.");
            return false;
        }else {
            if (acc[indexOf(user)].hasAccess(pass) && acc[indexOf(user)].getBalance() > amount)
                acc[indexOf(user)].withdraw(amount);
            assets -= amount;
            return true;
        }
    }

    public boolean transfer(String user, String pass, double amount, String recepient){
        Account accidx = acc[indexOf(user)];
        if(indexOf(user) == -1){
            return false;
        }else if(accidx.hasAccess(pass) && accidx.getBalance()>amount){
            accidx.withdraw(amount);
            acc[indexOf(recepient)].deposit(amount);
            return true;
        }
        return false;
    }

    public double getAssets() {
        return assets;
    }
    public void endOfProgramme(){
        for(int i=0; i<accCount;i++){
            System.out.print(acc[i].getName() + ", ");
            System.out.print(acc[i].getGovld() + ", ");
            System.out.println(acc[i].getBalance());
        }
    }

    private int indexOf(String user){
        for(int i=0; i<accCount; i++){
            if(acc[i].getUser().equals(user))
                return i;
        }
        return -1;
    }
}
