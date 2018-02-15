package CredentialManager;
import java.util.Scanner;

public class mainCredentials {
    public static void main(String[] args) {
        CredentialsManager CM = new CredentialsManager();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Input commands: ");
            String str = input.next();
            str = str.toUpperCase();
            if (str.equals("END")) break;

            switch (str) {
                case ("ENROLL"):
                    System.out.format("ENROLL %s %n", CM.newUser(input.next(), input.next()) ? "success" : "fail");
                    break;
                case ("CHPASS"):
                    System.out.format("CHPASS %s %n", CM.changePass(input.next(), input.next(), input.next()) ? "success" : "fail");
                    break;
                case ("AUTH"):
                    System.out.format("AUTH %s %n", CM.authenticate(input.next(), input.next()) ? "success" : "fail");
                    break;
                default:
                    System.out.println("No such command!!");break;
            }
        }
    }
}
