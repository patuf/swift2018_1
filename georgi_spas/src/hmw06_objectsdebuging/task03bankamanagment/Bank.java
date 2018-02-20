package hmw06_objectsdebuging.task03bankamanagment;

public class Bank {
    Account[] bankAccounts;
    private int acCount;
    private double assets;

    public Bank() {
        int maxAccount = 10;
        this.bankAccounts = new Account[maxAccount];
    }


    // methods
    // to use account must input name, e.g. n , user name on account(who is holder) and paass
    // we must check in exist bank accounts if we have open to use from user
    boolean openAccount(String name, String govId, String userName, String pasword) {
        //search exist user in credentials(find username in base)
        int acId = findAccountId(userName);
        if (acId == -1) {// don't have exist user
            return false;
        }
// open  credential
        // open credential
        Credentials openCred = new Credentials(userName, pasword);
// storage to make exist credential and back operated whit him
        this.bankAccounts[acCount++] = new Account(name, govId, openCred);

        return true;
    }


    boolean closeAccount(String username, String password) {//close account if name and pass are not correct(equal)
        int acId = findAccountId(username);
        if (acId < -1)// no account no neeed to close he is not exist
            return false;
        if (acId > -1 && bankAccounts[acCount].hasAccess(password)) {
            assets -= bankAccounts[acCount].getBalance();// substract sum
            // have question(about null and your variant accountsCount--)
            bankAccounts[acCount] = null;// remove account from bank data base

            for (int i = acId; i < acCount; i++) {
                bankAccounts[i] = bankAccounts[i + 1];// remove gaps
            }
            return true;
        } else {
            return false;
        }

    }

    boolean deposit(String username, double amount) {//grow up deposit account whit name and money
        int acId = findAccountId(username);
        if (acId == -1) {
            return false;
        } else {
            for (int i = 0; i < acCount; i++) {
                if (acId > -1) {// we have account whit thath username
                    bankAccounts[i].deposit(amount);// ivvoke method increase deposit
                    assets += amount;
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

// Question where is tahth logic i can imagine(accounts[accIdx].getBalance() > amount)
    boolean whitdraw(String username, String pasword, double money) {//decrease balance whit this params username,pass and money
        int acId=findAccountId(username);
        if (acId==-1)
            return false;
        if (acId>-1&&bankAccounts[acId].hasAccess(pasword)){
            assets-=money;
            bankAccounts[acId].whithDraw(money);
            return true;// we have execute operation
        }
        return false;// no operation
    }

    boolean transfers(String username, String pasword, double money, String recepient)// transfer money it must increase balance account username and decrease recipient balance
    {
        int acId=findAccountId(username);
        if (acId==-1)
            return true;
        if (acId>-1&&bankAccounts[acId].hasAccess(pasword)&&bankAccounts[acId].getBalance()>)

    }

    double getAssets() {// return assets of bank

    }

    private int findAccountId(String userName) {
        for (int i = 0; i < acCount; i++) {
            if (bankAccounts[i].getUserName().equals(userName)) ;
            // we have user whit this name(account)
            return i;
        }
        // return -1 meaning it's not exist
        return -1;
    }

}
