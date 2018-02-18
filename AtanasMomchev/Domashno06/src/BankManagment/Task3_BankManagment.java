package BankManagment;

import java.util.Scanner;

public class Task3_BankManagment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("Input commands: ");
        endLable:
        while (true){
            String str = input.next();
            str = str.toUpperCase();
            switch (str){
                case ("END"): bank.getAssets(); break endLable;
                case ("OPEN"): bank.openAccount(input.next(),input.next(),input.next(),input.next());
                case ("CLOSE"): bank.closeAcc(input.next(),input.next());
                case ("DEPOSIT"): bank.deposit(input.next(),input.nextDouble());
                case ("WITHDRAW"): bank.withdraw(input.next(),input.next(),input.nextDouble());
                case ("TRANSFER"): bank.transfer(input.next(),input.next(),input.nextDouble(),input.next());
                default:
                    System.out.println("No such command.");
            }
        }
    }
}
