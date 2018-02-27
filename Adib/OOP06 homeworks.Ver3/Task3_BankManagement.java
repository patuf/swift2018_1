package trainging.oldtasks;

import java.util.Scanner;

public class Task3_BankManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String command = "";
		Bank myBank=new Bank();
		while (true) {
			
			System.out.println("enter command");
			command = sc.next();
			if (command.equalsIgnoreCase("END")) {
				System.out.println(myBank.getAssets());
				for (int i = 0; i < myBank.getAccounts().length; i++) {
					System.out.println(myBank.getAccounts()[i].getName()+", "+myBank.getAccounts()[i].getGovId()+", "+myBank.getAccounts()[i].getBalance()+"Lv");
				}
				break;
			}
			switch (command.toUpperCase()) {
			case "OPEN":
				System.out.println("enter your Name,Goverment ID,Username and Password");
				myBank.openAccount(sc.next(), sc.next(), sc.next(),sc.next());
				
				break;
			case "CLOSE":
				System.out.println("enter Username and Password");
				myBank.closeAccount(sc.next(),sc.next());;
				
				break;
			case "DEPOSIT":
				System.out.println("enter Username and Amount To deposit to your account");
				myBank.deposit(sc.next(), sc.nextDouble());
				
				break;
			case "WITHDRAW":
				System.out.println("enter Username,Password and Amount To withdraw from your account");
				myBank.withdraw(sc.next(),sc.next(),sc.nextDouble());
				
				break;
			case "TRANSFER":
				System.out.println("enter Username,Password , Amount \nand Receiver( who you want to send the money)");
				myBank.transfer(sc.next(), sc.next(), sc.nextDouble(), sc.next());
				
				break;

				}

		}

	}
}