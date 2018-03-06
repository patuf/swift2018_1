package homeWork.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
	static List<Account> accountList = new ArrayList<Account>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account newAccount;
		Customer newCustomer;

		loop: while (true) {

			System.out.println(" PLEASE ENTER COMMAND");
			String command = sc.next();

			

			if (command.equalsIgnoreCase("END")) {
				break loop;

			}
			switch (command.toUpperCase()) {
			case "OPEN":
				System.out.println(
						"for Individual Customer Please Enter \"1\"\n for Company Customer Please Enter \"2\"");

				int selectCustomerType = sc.nextInt();
				System.out.println(
						"for Deposit Account please Select \"1\" \n for LOAN Account Please select \"2\" \n for MORTGAGE Account please select \"3\" ");
				int selectAccountType = sc.nextInt();

				if (selectCustomerType == 1) {
					System.out.println("Please enter individual customer name ");
					newCustomer = new IndividualCustomer(sc.next());

				} else if (selectCustomerType == 2) {
					System.out.println("Please enter Company customer name ");
					newCustomer = new CompanyCustomer(sc.next());

				} else {
					System.err.println("no such Customer");
					return;
				}

				if (selectAccountType == 1) {
					System.out.println("please enter balance and monthlyInterestRate");
					newAccount = new DepositAccount(newCustomer, sc.nextDouble(), sc.nextDouble());
				} else if (selectAccountType == 2) {
					System.out.println("please enter balance and monthlyInterestRate");
					newAccount = new LoanAccount(newCustomer, sc.nextDouble(), sc.nextDouble());

				} else if (selectAccountType == 3) {
					System.out.println("please enter balance and monthlyInterestRate");
					newAccount = new MortgageAccount(newCustomer, sc.nextDouble(), sc.nextDouble());

				} else {
					System.err.println("no Such Account");
					return;
				}
				accountList.add(newAccount);
				System.out.println("YOUR IBAN IS : "+newAccount.getIBAN());

				break;

			case "PUT":
				newAccount = accountExistence(sc.next());
				if (!newAccount.equals(null)) {
					newAccount.deposit(sc.nextDouble());
					System.out.println(newAccount.getBalance());
				} else {
					System.err.println("no such Account");
					return;
				}
				break;
			case "GET":
				newAccount = accountExistence(sc.next());			
				if (!newAccount.equals(null) && (newAccount instanceof DepositAccount)) {
					((DepositAccount) newAccount).withDraw(sc.nextDouble());
				} else {
					System.err.println("no such Account");
					return;
				}
				break;
			case "INFO":
				newAccount = accountExistence(sc.next());
				int month = sc.nextInt();
				if (month == 0) {
					System.err.println("NO DATA");
					return;
				} else {
					System.out.println(newAccount.calcInterest(month, newAccount.getOwner()));

				}

			default:
				break;
			}

		}
	}

	private static Account accountExistence(String nameOrIBAN) {
		for (Account account : accountList) {
			if ((account.getIBAN().equals(nameOrIBAN))|| account.getOwner().getName().equals(nameOrIBAN)) {
				return account;
			}
			
		}
			return null;
		}

}
