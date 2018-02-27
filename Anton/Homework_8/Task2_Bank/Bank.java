package Task2_Bank;
import Task2_Bank.Accounts.*;

import java.util.Scanner;

public class Bank extends Accounts{
    private static Bank FIB = new Bank();

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        outerLoop:
        while(true){
            String op = scan.next();

            switch (op){
                case "END":
                    System.out.print("Bye!");
                    break outerLoop;
                case "OPEN":
                    System.out.printf("%d%n", FIB.OpenAccount(scan.next(), scan.nextInt(),scan.nextInt(), scan.nextDouble(),scan.nextDouble()));
                    break;
            }
        }
    }

}
