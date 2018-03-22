package swift2018_1.hristo.hwk_08.Task1.Bank;

import swift2018_1.hristo.hwk_08.Task1.Bank.Account.Account;
import swift2018_1.hristo.hwk_08.Task1.Bank.Account.DepostAccount;
import swift2018_1.hristo.hwk_08.Task1.Bank.Account.LoanAccount;
import swift2018_1.hristo.hwk_08.Task1.Bank.Account.MortgageAccount;
import swift2018_1.hristo.hwk_08.Task1.Bank.Customer.CompanyCustomer;
import swift2018_1.hristo.hwk_08.Task1.Bank.Customer.Customer;
import swift2018_1.hristo.hwk_08.Task1.Bank.Customer.IndividualCustomer;

import java.util.Scanner;

public class Task2_Bank {


    public static void main(String[] args) {

        Account[] accounts = new Account[100];
        int accountCount = 0;

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String [] input = line.split(" ");
        String command = input [0];
        String name = input [1];
        int clientType = Integer.parseInt(input[2]);
        int accountType = Integer.parseInt(input[3]);
        int ballance = Integer.parseInt(input[4]);
        double interestrate = Double.parseDouble(input[5]);
        Account account;

        switch (command) {

            case "OPEN":

                Customer customer;
                if (clientType == 1) {
                    customer = new IndividualCustomer(name);
                } else if (clientType == 2) {
                    customer = new CompanyCustomer(name);
                } else {
                    return;
                }

                if (accountType == 1) {
                    account = new DepostAccount(customer, ballance, interestrate);
                } else if (accountType == 2) {
                    account = new LoanAccount(customer, ballance, interestrate);
                }else if (accountType == 3) {
                    account = new MortgageAccount(customer, ballance, interestrate);
                }else {
                    return;
                }

                accounts[accountCount++] = account;

                System.out.println(customer.getName() + " " + clientType + " " + accountType + " " + ballance + " " + interestrate);
                accounts[accountCount++] = account;
                System.out.println(account.getIBAN());
                System.out.println(accounts[0].getOwner().getName());
        }

    }

}
