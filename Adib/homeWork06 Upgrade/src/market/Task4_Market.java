package market;

import java.util.Scanner;

public class Task4_Market {
	static person[] people = new person[200];
	static product[] items = new product[500];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter name and balance");
		String command = sc.nextLine();
		System.out.println("enter products and balance");
		personAndbalance(command);
		String command2 = sc.nextLine();
		productAndPrice(command2);

		while (true) {
			System.out.println("enter person and product");
			String command3 = sc.nextLine();

			for (int i = 0; i < 2; i++) {
				if (command3.contains(people[i].getName())) {

					if (command3.contains(items[i].getName())) {

						people[i].buy(items[i]);
					

					}

				}
			}
			if (command3.equalsIgnoreCase("end")) {
				for (int i = 0; i < people.length; i++) {
				people[i].afterEndCommand();
				
				}

				break;
			}

		}

	}

	static public void personAndbalance(String command) {
		String[] part = command.split(";");
		for (String part2 : part) {

			String[] unit = part2.split("=");

			String name = unit[0];

			String balance = unit[1];

			double value = Double.parseDouble(balance);
			person person = new person(name, value);
			addPerson(person);

		}
	}

	static public void productAndPrice(String command) {
		String[] part = command.split(";");
		for (String part2 : part) {

			String[] unit = part2.split("=");

			String name = unit[0];

			String balance = unit[1];

			double value = Double.parseDouble(balance);
			product product = new product(name, value);
			addProduct(product);

		}
	}

	static public void addPerson(person person) {
		for (int i = 0; i < people.length; i++) {
			if (people[i] == null) {
				people[i] = person;
				break;

			}

		}
	}

	static public void addProduct(product product) {
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				items[i] = product;
				break;
			}

		}
	}
}
