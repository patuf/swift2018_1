package Task3;
import java.util.Scanner;

public class Task3_BankManagement {
    private static Bank FIB = new Bank();
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        outerLoop:
        while (true){
            String op = scan.next();

            switch (op) {
                case "END":
                    System.out.printf("Bank Assets: %.2f BGN %n", FIB.getAssets());
                    for(Account acc : FIB.getAccounts()){
                        System.out.printf("Account: %s, %s, %.2f BGN %n", acc.getName(), acc.getGovId(), acc.getBalance());
                        }
                    break outerLoop;
                case "BALANCE":
                    System.out.printf("BALANCE %.2f BGN %n", FIB.showBalance(scan.next(), scan.next()));
                    break;
                case "OPEN":
                    System.out.printf("OPEN %s%n", FIB.openAccount(scan.next(), scan.next(), scan.next(), scan.next()) ? "success" : "fail");
                    break;
                case "CLOSE":
                    System.out.printf("CLOSE %s%n", FIB.closeAccount(scan.next(), scan.next()) ? "success" : "fail");
                    break;
                case "DEPOSIT":
                    System.out.printf("DEPOSIT %s%n", FIB.deposit(scan.next(), scan.nextDouble()) ? "success" : "fail");
                    break;
                case "WITHDRAW":
                    System.out.printf("WITHDRAW %s%n", FIB.withdraw(scan.next(), scan.next(), scan.nextDouble()) ? "success" : "fail");
                    break;
                case "TRANSFER":
                    System.out.printf("TRANSFER %s%n", FIB.transfer(scan.next(), scan.next(), scan.nextDouble(), scan.next()) ? "success" : "fail");
                    break;
                default:
                    System.out.println("Unrecognized command!");
                    break;
            }
        }
    }
}
