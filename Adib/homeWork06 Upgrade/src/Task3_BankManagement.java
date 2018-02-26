package swiftacadoop.HomeWork;

import java.util.Scanner;

public class Task3_BankManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;

		bank bank = new bank();

		while (!(line = sc.nextLine()).equalsIgnoreCase("END")) {
			String[] s = line.split(" ");
			String command = s[0].trim();
			String username = s[1].trim();
			String password;
			double amount;

			String result = "";

			switch (command.toUpperCase()) {
			case "OPEN":
				result = "OPEN ";
				password = s[2].trim();
				String name = s[3].trim();
				String id = s[4].trim();

				result += bank.openAccount(username, password, name, id) ? "success" : "fail";

				break;
			case "CLOSE":
				result = "CLOSE ";
				password = s[2].trim();

				result += bank.closeAccount(username, password) ? "success" : "fail";

				break;
			case "DEPOSIT":
				result = "DEPOSIT ";
				amount = Double.parseDouble(s[2].trim());

				result += bank.deposit(username, amount) ? "success" : "fail";

				break;
			case "TRANSFER":
				result = "TRANSFER ";
				password = s[2].trim();
				amount = Double.parseDouble(s[3].trim());
				String recipient = s[4].trim();

				result += bank.transfer(username, password, amount, recipient) ? "success" : "fail";

				break;
			case "WITHDRAW":
				result = "WITHDRAW ";
				password = s[2].trim();
				amount = Double.parseDouble(s[3].trim());

				result += bank.withdraw(username, password, amount) ? "success" : "fail";

				break;
			}

			System.out.println(result);
		}

		System.out.println(bank.getAssets());
		bank.printAccounts();
	}

}
