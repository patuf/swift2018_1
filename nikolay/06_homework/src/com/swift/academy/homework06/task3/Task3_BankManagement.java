package com.swift.academy.homework06.task3;

import java.util.Scanner;

public class Task3_BankManagement {
    private static Bank bank = new Bank();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pay attention to this construction - not too common, but has its uses
        outerLoop:
        while (true) {
            String op = sc.next();

            switch (op) {
                case "END":
                    System.out.printf("%.1f%n", bank.getAssets());
                    for(Account acc : bank.getAccounts()) {
                        System.out.printf("%s, %s, %.2f%n", acc.getName(), acc.getGovId(), acc.getBalance());
                    }
                    break outerLoop;
                case "OPEN":
                    System.out.printf("OPEN %s%n", bank.openAccount(sc.next(), sc.next(), sc.next(), sc.next()) ? "success" : "fail");
                    break;
                case "CLOSE":
                    System.out.printf("CLOSE %s%n", bank.closeAccount(sc.next(), sc.next()) ? "success" : "fail");
                    break;
                case "DEPOSIT":
                    System.out.printf("DEPOSIT %s%n", bank.deposit(sc.next(), sc.nextDouble()) ? "success" : "fail");
                    break;
                case "WITHDRAW":
                    System.out.printf("WITHDRAW %s%n", bank.withdraw(sc.next(), sc.next(), sc.nextDouble()) ? "success" : "fail");
                    break;
                case "TRANSFER":
                    System.out.printf("TRANSFER %s%n", bank.transfer(sc.next(), sc.next(), sc.nextDouble(), sc.next()) ? "success" : "fail");
                    break;
                default:
                    System.out.println("Unrecognised command!");
                    break;
            }
        }
    }
}
