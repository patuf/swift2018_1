package swiftacadoop.HomeWork;

public class Account {
	private Credentials credentials;
	private String name;
	private String govId;

	private double balance;

	protected Account(Credentials credentials, String name, String id) {
	

		balance = 0;
	}

	void deposit(double amount) {
		balance += amount;
	}

	void withdraw(double amount) {
		balance -= amount;
	}

	boolean hasAccess(String password) {
		return credentials.matchPassword(password);
	}

	double getBalance() {
		return balance;
	}

	String getName() {
		return name;
	}

	String getGovId() {
		return govId;
	}

	String getUsername() {
		return credentials.getUsername();
	}
}