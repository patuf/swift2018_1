package hmw06_objectsdebuging.task2credential;

import java.util.Scanner;

public class CredentialManager {
    private Credentials[] credentialList = new Credentials[200];

    private int dbSize;


    void setname(String name) {

    }

    public static void main(String[] args) {
        CredentialManager cm = new CredentialManager();

        System.out.println();
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("enter operation:");
            String op = sc.next();
            System.out.println();
            if (op.equalsIgnoreCase("END")) {
                System.out.println("Credential out!");
                break;
            }
            System.out.println("enter name");
            String name = sc.next();
            System.out.println("enter password");
            String password = sc.next();

            switch (op.toUpperCase()) {
                case "ENROLL":
                    System.out.println("Enroll " + ((cm.signIn(name, password,0)) ? "success" : "fail"));
                    break;
                case"CHPASS":
                    System.out.println("enter new password");
                    String newPass=sc.next();
                    System.out.println("CHPASS " + ((cm.changePassword(name,password,newPass)) ? "success" : "fail"));
                    break;

                case"AUTH":
                    System.out.println("AUTH " + ((cm.auth(name,password)) ? "success" : "fail"));
                    break;
                    default:
                        System.out.println("Uregonazilbe operation");
                        break;
            }

            }
    }

    public boolean auth(String name, String password) {
        if (searchDBCredentials(name)<0){// found name in data base
           // search for equivalent passwords
            for (int i = 0; i <dbSize ; i++) {
                if (credentialList[i].getUserName().equals(name)){
                   return credentialList[i].passwordIsMatch(password);
                }
            }
        }
        // no name in tdata base
        return false;
    }

    public boolean signIn(String name, String password,int num) {// num use for method search in data base to know when num=0 is for sigh and num=1 is for change password
        if (searchDBCredentials(name) < 0) {
            return false;// can't sign in data base
        }
        // fil in data base
        return addBase(name, password);

    }

    public boolean changePassword(String name,String password,String newPassword){
        // exist name we give access to change password eventually
        if (searchDBCredentials(name)<0){
            for (int i = 0; i <dbSize ; i++) {
                // we found name and place in data base
                if (credentialList[i].getUserName().equals(name)){
                    // look for current pass is match whit write pass to give acces to change whit the new pass
                    return credentialList[i].changePassword(password,newPassword);

                }
            }
        }
    // no change because no username
        return false;
    }

    public int searchDBCredentials(String name) {
        for (int i = 0; i < dbSize; i++) {
            if (credentialList[i].getUserName().equals(name)) {

                return -1;// we have in data base
            }
        }
        return dbSize;
    }

    public boolean addBase(String name, String password) {
        credentialList[dbSize++] = new Credentials(name, password);
        return true;
    }
}


