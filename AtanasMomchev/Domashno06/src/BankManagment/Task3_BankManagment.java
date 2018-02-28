package BankManagment;

import java.util.Scanner;

public class Task3_BankManagment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();

        endLable:
        while (true){
            System.out.println("Input commands: ");
            String str = input.next();
            str = str.toUpperCase();

            switch (str){
                case ("END"): bank.getAssets(); break endLable;
                case ("OPEN"):
                    System.out.format("OPEN %s %n",bank.openAccount(input.next(),input.next(),input.next(),input.next())
                            ? "success" : "fail");break;
                case ("CLOSE"):
                    System.out.format("CLOSE %s %n",bank.closeAcc(input.next(),input.next())
                        ? "success" : "fail");break;
                case ("DEPOSIT"):
                    System.out.format("DEPOSIT %s %n",bank.deposit(input.next(),input.nextDouble())
                        ? "success" : "fail");break ;
                case ("WITHDRAW"):
                    System.out.format("WITHDRAW %s %n",bank.withdraw(input.next(),input.next(),input.nextDouble())
                        ? "success" : "fail");break ;
                case ("TRANSFER"):
                    System.out.format("TRANSFER %s %n",bank.transfer(input.next(),input.next(),input.nextDouble(),input.next())
                        ? "success" : "fail"); break ;
                default:
                    System.out.println("No such command.");
            }
        }
        System.out.println(bank.getAssets());
        bank.endOfProgramme();
    }
}
