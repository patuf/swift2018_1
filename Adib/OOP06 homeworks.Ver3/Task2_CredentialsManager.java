package trainging.oldtasks;

import java.util.Scanner;

public class Task2_CredentialsManager {
	static Credentials[] credentials = new Credentials[200];
	static int count = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			// int counter=0;
			System.out.println("enter command");
			String command = sc.next();
			if (command.equalsIgnoreCase("END")) {
				break;
			}
			// if (counter>5) {
			// System.out.println("PLEASE ENTER USERNAME");
			// String userName=sc.next();
			// System.out.println("PLEASE ENTER PASSWORD");
			// String userPassword=sc.next();
			// for (int i = 0; i < credentials.length; i++) {
			// if (userName.equals(credentials[i].getName())) {
			// if (userPassword.equals(credentials[i].getPassword())) {
			// System.out.println("WELCOME WHAT DO YOU WANT TO DO TO YOR
			// CREDENTIAL");
			// }else{
			// System.err.println("NO SUCH CREDENTIAL");
			// break;
			// }
			//
			// }
			// }
			// }
			switch (command.toUpperCase()) {
			case "ENROLL":
				System.out.println("PLEASE ENTER THE NEW USERNAME AND PASSWORD");
				ENROLL(sc.next(), sc.next());

				break;
			case "CHPASS":
				System.out.println("PLEASE ENTER YOUR USER NAME , CURRENT PASSWORD ,NEW PASSWORD");
				CHPASS(sc.next(), sc.next(), sc.next());
				break;
			case "AUTH":
				AUTH(sc.next(), sc.next());
				break;
			}

		}
	}

	static void ENROLL(String name, String password) {
		Credentials newUser = new Credentials(name, password);
		if (newUser.equals(checkCredentials(name, password))) {
			System.out.println("ENROLL fail");

		} else {
			credentials[count++] = newUser;
			System.out.println("ENROLL success");
		}

	}

	static void CHPASS(String name, String password, String newPassword) {
		for (int i = 0; i < credentials.length; i++) {
			if (name.equals(credentials[i].getName())) {
				if (password.equals(credentials[i].getPassword())) {
					credentials[i].changePass(newPassword);

					break;
				}
				break;
			}

		}
	}

	static void AUTH(String name, String password) {
		if (checkCredentials(name, password)) {
			System.out.println("AUTH sucess");
		}

		else {
			System.err.println("AUTH fail");

		}

	}

	static boolean checkCredentials(String name, String password) {
		for (int i = 0; i < count; i++) {

			if (name.equals(credentials[i].getName())) {
				if (password.equals(credentials[i].getPassword())) {

					return true;

				}
				return true;
			}

		}
		return false;
	}
}
