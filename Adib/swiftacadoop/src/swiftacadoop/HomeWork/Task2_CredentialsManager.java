package swiftacadoop.HomeWork;

import java.util.Scanner;

public class Task2_CredentialsManager {

	public static void main(String[] args) {

		for (;;) {//by using the unlimited loop 
			Scanner sc = new Scanner(System.in);
			System.out.println("enter key word : ");
			String keyword = sc.next();//entering a command word
			String[] word = { "ENROLL", "CHPASS", "AUTH" };//list of the command words
			Credentials newUser = new Credentials();//entering a constructor so we can see it class

			if (word[0].equalsIgnoreCase(keyword)) {//when the word is "enroll" this will be active
				newUser.enroll();//entering in the credentials Class and using the method enroll

			}
			if (word[1].equalsIgnoreCase(keyword)) {//when the word is "Chpass" this will be active
				newUser.CHPASS();//entering in the credentials Class and using the method "chpass"


			}
			if (word[2].equalsIgnoreCase(keyword)) {//when the word is "Auth" this will be active
				newUser.Auth();//entering in the credentials Class and using the method "Auth"
			}
			if (keyword.equalsIgnoreCase("end")) {//by entering "END" the program will be ended.
				break;

			}

		}

	}
}
