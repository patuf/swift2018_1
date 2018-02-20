package hmw06_objectsdebuging.task03bankamanagment;

import hmw06_objectsdebuging.CredentialManager;

public class Account {

    private final String  acName;
    private final String govld;
    private Credentials cr; // obejct crredential
    private double balance;// money deposit
    //constructor
    // We think what nedd to create acount and make construcotr
    Account(String acName,String govld,Credentials user){
        this.acName=acName;
        this.govld=govld;
        this.cr=user;

    }






    //methods- must thinka what we can do whit account
    /* acoount ine bank can do:
    1) make deposit;
    2) make whitdraw;
    3) give balance;
    4) give name hwo account(get name)
    5) give years (e.g.n) of people hwo use
    6) give name who use account(get user name)
     */


    // must think what need to grow deposit: 1)input money.
    // than think what method do whit param from 1)- we must add to deposit(sum)
    // 2) put in deposit money from 1). we added to curent money
    void deposit(double moneyIn){// grow up deposit
            balance+=moneyIn;
    }
// think what need to increase money in deposit: 1) remove money.
// method substract from deposit balance
    // 2) remove money from balance whit money from 1)
    void whithDraw(double moneyOut){// redutin deposit
        balance-=moneyOut;
    }

    // this method must give info for balance money and take money balance
    double getBalance(){// return current balance account
        return balance;
    }

    boolean hasAccess(String password){// check input password
    return cr.passMatch(password);
    }

    String getUserName(){// return name account credential
        return cr.getUserName();
    }

    String getGovId(){// return e.g.n of  person
        return this.govld;
    }

    String getName(){// return name user account
       return this.acName;
    }

}
