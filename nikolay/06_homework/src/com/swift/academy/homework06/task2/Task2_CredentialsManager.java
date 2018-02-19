package com.swift.academy.homework06.task2;

import java.util.Scanner;

public class Task2_CredentialsManager {
    private static Task2_CredentialsManager manager = new Task2_CredentialsManager();

    private Credentials[] database = new Credentials[200];
    private int dbSize = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String op = sc.next();

            if ("END".equals(op)) {
                System.out.println("Bye!");
                break;
            }

            switch (op) {
                case "ENROLL":
                    System.out.printf("ENROLL %s%n", manager.enroll(sc.next(), sc.next()) ? "success" : "fail");
                    break;
                case "CHPASS":
                    System.out.printf("CHPASS %s%n", manager.chPass(sc.next(), sc.next(), sc.next()) ? "success" : "fail");
                    break;
                case "AUTH":
                    System.out.printf("AUTH %s%n", manager.auth(sc.next(), sc.next()) ? "success" : "fail");
                    break;
                default:
                    System.out.println("Unrecognised command!");
                    break;
            }
        }
    }

    public boolean enroll(String userName, String pass) {
        // Check for duplicate userName
        for (int i = 0; i < dbSize; i++) {
            if (database[i].getUserName().equals(userName)) {
                return false;
            }
        }
        database[dbSize++] = new Credentials(userName, pass);
        return true;
    }

    public boolean chPass(String userName, String currPass, String newPass) {
        for (int i = 0; i < dbSize; i++) {
            if (database[i].getUserName().equals(userName)) {
                // Found it!
                return database[i].changePassword(currPass, newPass);
            }
        }
        // UserName not found :(
        return false;
    }

    public boolean auth(String userName, String pass) {
        for (int i = 0; i < dbSize; i++) {
            if (database[i].getUserName().equals(userName)) {
                // Found it!
                return database[i].passMatch(pass);
            }
        }
        // UserName not found :(
        return false;
    }
}
