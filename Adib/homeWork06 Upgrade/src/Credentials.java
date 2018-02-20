package swiftacadoop.HomeWork;

import java.util.Scanner;


public class Credentials {

	private String userName;//declaring name
	private String password;//declaring password


	String newPass;//declaring a reserve password which will be use by the way
	static Credentials[] saveUser = new Credentials[200];//method to save user password and names
	static int user = 0;//helper tool for saving user method to count how much time it collect a user

	public void enroll() {//method to make a new user
		Scanner sc = new Scanner(System.in);

		System.out.println("enter new User Name and PassWord : ");

		userName = sc.next();//entering a new user name

		password = sc.next();//entering a new user password
		saveingUser();//saving it in the saving user method which explained above;

		System.out.println("ENROLL success");
	}

	public void CHPASS() {  //method to change password
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Username old Password  : ");
		userName = sc.next();//entering user name

		password = sc.next();//entering the old password
		for (int i = 0; i < saveUser.length; i++) {//checking if the name and the password is in the Array

			if (saveUser[i].userName.equals(userName) && saveUser[i].password.equals(password)) {

				String pass = password;//making a copy of that old password
				System.out.println("enter new password : ");
				newPass = sc.next();//entering new password

				if (newPass.equals(pass)) {//checking if the new password 
					System.out.println("CHPASS fail");
					break;

				} else {

					saveUser[i].password = newPass;//when the password is not the same it will enter the new pass in that array
					System.out.println("CHPASS success");
					break;
				}
			}
		}
	}

	public void Auth() {//authentication method 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Username , new Password Authentication : ");
		userName = sc.next();//entering the user name 
		String passwordcheck = sc.next();//entering the password 
		for (int i = 0; i < saveUser.length; i++) {
			if (saveUser[i].userName.equals(userName) && saveUser[i].password.equals(passwordcheck)) {
				/**
				 * checking the name and the password if it is on the list if yes 
				 * go to check 
				 */
			
			if (passwordcheck.equals(saveUser[i].password)) {
				//checking if the password we entered is the same with password in the list if yes print: 
				System.out.println("AUTH success");
				break;

			} else {
				System.out.println("AUTH fail");
				break;
			}
			}
		}

	}

	public void saveingUser() {//list of saving user
		saveUser[user] = this;
		user++;//incrementing the user list to enter another user.

	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return this.userName;
	}

	public boolean matchPassword(String password2) {
		// TODO Auto-generated method stub
		return this.password.equals(newPass); 
	}

}
