package hmw06_objectsdebuging.task3bankmanagment;

import java.util.Scanner;

public class BankManagment {
    public static void main(String[] args) {

        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("enter operation");
            String op = sc.next().toUpperCase();
            if (op.equals("END")) {
                System.out.printf("%.1f%n", bank.getAssets());
                for (Account account : bank.getAccount()) {
                    System.out.printf("%s, %s, %.2f%n", account.getName(), account.getGovId(), account.getBalance());
                }
                break;
            }


            switch (op.toUpperCase()) {

                case "OPEN":
                    System.out.print("enter user name: ");
                    String username = sc.next();
                    System.out.println("enter password:");
                    String password = sc.next();
                    System.out.print("enter  name and goverment ID: ");
                    String name = sc.next();
                    String govId = sc.next();
                    System.out.println("OPEN " + (bank.openAccount(name, govId, username, password) ? "success" : "fail"));

                    break;
                case "CLOSE":
                    System.out.print("enter user name: ");
                    username = sc.next();
                    System.out.print("enter password:");
                    password = sc.next();
                    bank.closeAccount(username, password);
                    break;
                case "DEPOSIT":
                    System.out.print("enter user name: ");
                    username = sc.next();
                    System.out.println("enter amount of money");
                    double amount = sc.nextDouble();
                    System.out.println("DEPOSIT " + (bank.deposit(username, amount) ? "success" : "fail"));
                    break;

                case "WITHDRAW":
                    System.out.print("enter user name: ");
                    username = sc.next();
                    System.out.print("enter password:");
                    password = sc.next();
                    System.out.println("enter amount of money");
                    amount = sc.nextDouble();

                    bank.withdraw(username, password, amount);
                    break;

                case "TRANSFER":
                    System.out.print("enter user name: ");
                    username = sc.next();
                    System.out.print("enter password:");
                    password = sc.next();
                    System.out.println("enter amount of money");
                    amount = sc.nextDouble();
                    System.out.println("enter recipient");
                    String recipient = sc.next();
                    bank.transfers(username, password, amount, recipient);
                    break;
                default:
                    System.out.println("invalid input operation");
                    break;
            }
        }


    }
}
