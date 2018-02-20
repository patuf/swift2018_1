package hmw06_objectsdebuging;

import java.util.Scanner;

public class CredentialManager {
    private Credentials[] database;
    private int endPositionDB;

    private CredentialManager() {
        int sizeDB = 200;
        this.database = new Credentials[sizeDB];
    }

    public static void main(String[] args) {
        CredentialManager cm = new CredentialManager();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter command");


        while (true) {

            String name;
            String password;
            String command = sc.nextLine().toLowerCase();
            if (command.equals("end")) {
                break;
            }
            switch (command) {
                case "enroll":
                    name = sc.nextLine().toLowerCase();
                    password = sc.nextLine().toLowerCase();
                    System.out.println("enrol " + (cm.signIn(name, password) ? "sucess" : "fail"));
                    break;
                case "chpass":
                    name = sc.nextLine().toLowerCase();
                    password = sc.nextLine().toLowerCase();
                    String newPass = sc.nextLine().toLowerCase();
                    System.out.println("CHPass " + (cm.changePass(name, password, newPass) ? "sucess" : "fail"));
                    break;
                case "auth":
                    name = sc.nextLine().toLowerCase();
                    password = sc.nextLine().toLowerCase();

                    System.out.println("AUTH " + (cm.auth(name, password) ? "sucess" : "fail"));
                    break;

            }


        }

    }

    private boolean auth(String name, String password) {
        if (checkSignInName(name)) {
            for (int i = 0; i < endPositionDB; i++) {
                if (database[i].getUserName().equals(name)) {
                    return database[i].comparePass(password);
                }
            }
        }
        return false;
    }

    // change pass on exist user
    private boolean changePass(String name, String password, String newPass) {
        if (checkSignInName(name)) {// we have name change pass whit new
            // take name
            for (int i = 0; i < endPositionDB; i++) {
                if (database[i].getUserName().equals(name)) {
                    database[i].changePassUser(password, newPass);
                    break;
                }
                return true;
            }
        }
        return false;

    }

    // sign new user
    boolean signIn(String name, String password) {
        // check take it name
        if (checkSignInName(name)) {// we have this name no sign in
            return false;
        }
        // sign in new user
        if (password.equals(null) || password.isEmpty()) {
            System.out.println("Pass can't be empty or null");
            return false;
        }
        database[endPositionDB++] = new Credentials(name, password);
        return true;

    }

    // check exist user
    private boolean checkSignInName(String name) {

        // sign  this name
        for (int i = 0; i < endPositionDB; i++) {
            if (database[i].getUserName().equals(name)) {
                return true;
            }

        }

        // not sign this name
        return false;

    }

}
