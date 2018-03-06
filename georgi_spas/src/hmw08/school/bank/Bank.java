package hmw08.school.bank;

public class Bank {
    private Account[] accounts;
    private int accountsCount;


    // methods

    // prpeperty
    public Account[] getAccount() {
        return accounts;
    }

    public int getAccountCount() {
        return accountsCount;
    }

    boolean openAccount(Account typeAccount) {
        // take name and iban

        for (int i = 0; i < accountsCount; i++) {
            // we have two equals name
            if (accounts[i].getClient().getName().equals(typeAccount.getClient().getName())){
               if( isIbanMatch(i,typeAccount.getIban())==-1){
                   return false;
                }
            }

        }
        // make new client

        // add client in bank
        accounts[accountsCount++] = typeAccount;
        return true;// return true for new account


    }



    // check iban
    int isIbanMatch(int indx, String iban) {

        if (accounts[indx].getIban().equals(iban)) {
            // we have this account( owr old client)
            return indx;
        }
        // we are ready to make new client( Wellcome!)
        return -1;
    }


}
