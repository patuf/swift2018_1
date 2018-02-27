package trainging.oldtasks;

public class Account {
	private final String name;
	private final String govId;
	private double balance;

	 Credentials user;

	public Account(String name, String govId) {

		this.name = name;
		this.govId = govId;

	}

	void deposit(double amount) {//adding money to the account
		this.balance += amount;
	}

	void withDraw(double amount) {//taking  money to the account
		this.balance -= amount;
	}

	public double getBalance() {//take and shows the balance
		return this.balance;
	}

	boolean hasAccess(String password) { //is the password right
		if (user.checkPass(password)) {
			return true;
		}
		return false;
	}

	public String getName() {//take name 
		return this.name;
	}

	public String getGovId() {//take EGN
		return this.govId;                 
	}

	public String getUserName() {//take the user name from cradentails
		return user.getName();
	}
	public String getUserPassword() {//take the user name from cradentails
		return user.getPassword();
	}

}
