package hmw06_objectsdebuging.task3bankmanagment;

import hmw06_objectsdebuging.task2credential.Credentials;

public class Bank {
    // fields
    private final Account[] account;
    private int count;
    private double assets;// total amount money

    Bank() {// constructor
      this.account = new Account[5];
    }

    //Property

    public Double getAssets() {
        return this.assets;
    }
    // bank return accounts
    public Account[] getAccount(){
        return this.account;
    }



    // Open account new account
    //1) make method to search
    boolean openAccount(String name, String govId, String username, String password) {
        if (count == account.length) {
            // we over the limit in bank accountsope
            return false;
        }
        // if return account(not null mean no such account) we have this account and we can't open new account
        if (searchInBankCredential(username) != null&&!searchInBankCredential(username).equals(username)) {
            // search by govermnt Id to be sure are name is for   person whit that name
            if (searchInBankCredential(username).getGovId().equals(govId))// name and govId is same person( he have acoount)

                return false;
        }

        // 2) add new client
        // we make new account
        // first make new Credential
        Credentials newCred = new Credentials(username, password);
        // second make new Account
        Account newAccount = new Account(name, govId);//create  new account

        // account link whit credential(it's account access from user whit username and password)
        newAccount.setCr(newCred); // addAccount int data bsea bank(accounts)n
        account[count++] = newAccount;


        return true;

    }


    // Close account serach by user name and password
    void closeAccount(String username, String password) {

        Account currentAccount = searchInBankCredential(username);
        // search for user whit that name and check passoword is equal to close account
        if (currentAccount != null && currentAccount.hasAccess(password)) {

            // search in data base for current acount to remove from data base
            for (int i = 0; i < count; i++) {
                if (account[i].equals(currentAccount)) {
                    // take balance to remove from assets
                    assets -= account[i].getBalance();
                    // delete account from data base
                    account[i] = null;
                    // delete gap from data base
                    rearrangementDataBase();
                    System.out.println("ClOSE success");
                    return;
                }
            }

            // close account


            System.out.println("CLOSE fail");

        }
    }


    // Deposit add money

    public boolean deposit(String username, double amount) {
        Account currenAccount = searchInBankCredential(username);
        if (amount > 0) {// add money to balance
            if (currenAccount != null) {// we have thath account
                currenAccount.deposit(amount);
                assets += amount;// imcrease assets
            }
            return true;
        }
        // else money<0( we can't add negative money
        return false;
    }

    // make Withdraw
    public void withdraw(String username, String password, double amount) {
        Account currentCredential = searchInBankCredential(username);
        double moneyInAccount = 0;
        // we have that user account and password is matching  than make eventually withdraw
        if (amount > 0 && currentCredential != null && currentCredential.hasAccess(password)) {
            if (currentCredential.getBalance() - amount < moneyInAccount) {//when withdraw we don't have positive amount of money in account

                System.out.println("WITHDRAW fail ");
                return;
            }
            // have enought money make full withdraw

            currentCredential.withdraw(amount);
            assets -= amount;
            System.out.println("WITHDRAW success");

        }

    }


    // Transfer(username,password,ammount,recipient)
    public void transfers(String username, String password, double amount, String recipient) {
        Account opAccount = searchInBankCredential(username);
        Account recipAccount = searchInBankCredential(recipient);
        double moneyInAccount = 0;
        if (amount > 0 && ((opAccount.getBalance() - amount) > moneyInAccount) && opAccount.hasAccess(password)) {// check user balance is not negative when take money from his account
            opAccount.withdraw(amount);// remove money from account
            recipAccount.deposit(amount);// add money
            System.out.println("TRANSFER success");
            return;
        }
        System.out.println("TRANSFER fail");
    }

    // Remove holes in data base
    private void rearrangementDataBase() {
        int placegap = count;// last position in data base(array from accounts)

        if (count == 0) {
            System.out.println("CLOSE success");
            return;
        }

        for (int i = count; i >= 0; i--) {
            //
            if (account[count - 1] == null) {// we have last is gap
                count--; // we don't have gaps becaouse is on last place
                return;
            } else {// iterate and search gap(keep first fill in placegap) in data base when found gap(data base item=null) take placegap(storage fill item) and fill on palce equal on null
                if ((account[count - 1] != null) && (count - 1 == i - 1)) {// take last item which is not null and take place to move on place where is have gap in base and decrease count to remove last elementh
                    // take place on last full array index
                    placegap = count - 1;
                    i = placegap;

                }             // we found holl in array and fill
                // take current account position and iterate to search null place

                if (account[i] == null) {
                    account[i] = account[placegap];
                    count--;// iterate one position on left because when add new account we override the old record which is on two place in owr array(first is on gap when fill and last palce we took it)
                    return;
                }


            }
        }


    }

    // Search in data base accounts

    // Search in data base credential base
    private Account searchInBankCredential(String userName) {
        // search in data base account
        for (int i = 0; i < count; i++) {
            // found exist account
            if (account[i].getUserName().equals(userName)) {
                // search govId to be sure there is not same name
                return account[i];
            }
        }
        // no exist account ready to make new account
        return null;
    }

}
