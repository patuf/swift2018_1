package trainging.oldtasks;

public class Bank {
	private Account[] accounts = new Account[5];
	private double assets;// total amount money
	private int count = 0;

	// amount >0

	void openAccount(String username, String password, String name, String govId) {// method
																					// to
																					// open
																					// an
		if (count >= accounts.length) {
			System.err.println("OPEN fail");
			return;
		} // account
		if (findAccount(name, govId) > -1) {
			

			System.err.println("already have an account");
			return;
			
		}if (checkUserAndPassword(username, password)) {
			System.err.println("THE USER NAME AND PASSWORD EXISIST");
			return;
			
		}else {

			Credentials newCr = new Credentials(username, password);
			Account newAccount = new Account(name, govId);
			newAccount.user = newCr;
			accounts[count++] = newAccount;
			System.out.println("OPEN success");

		}

	}

	public Account[] getAccounts() {
		return accounts;
	}

	void closeAccount(String username, String password) {// method to close an
															// account
		int idx = findUsername(username);

		if (accounts[idx].hasAccess(password)) {

			accounts[idx] = null;

			System.out.println("CLOSE success");

			count--;

			resortingList();

		} else {
			System.err.println("no such password");
			System.err.println("CLOSE fail");
		}

	}

	void deposit(String userName, double amount) {// depositing an account
		/**
		 * it is wrong to found an user and deposit an account only by a user
		 * name so we have to add another security caution to find a user by
		 * govID because we may have a user with the same username .
		 */
		int idx = findUsername(userName);
		if (accounts[idx].getUserName().equals(userName)) {
			if (amount > 0) {
				accounts[idx].deposit(amount);
				System.out.println("deposite success");
			} else {
				System.err.println("amount under ZERO ");
				System.err.println("deposite fail");
			}

		} else {
			System.err.println("no such User please Re-Check");
			System.err.println("deposite fail");

		}
	}

	void withdraw(String username, String password, double amount) {
		// taking money from your account by the ATM or SHOPPING
		int idx = findUsername(username);
		if (accounts[idx].getUserPassword().equals(password)) {
			if (amount > 0 && amount < accounts[idx].getBalance()) {
				accounts[idx].withDraw(amount);
				System.out.println("withdraw success");
			} else {
				System.err.println("amount under ZERO or more than your balance ");
				System.err.println("withdraw fail");
			}

		} else {
			System.err.println("no such User please Re-Check");
			System.err.println("withdraw fail");
		}

	}

	void transfer(String username, String password, double amount, String recipient) {
		int idxUser = findUsername(username);
		int idxrecipient = findUsername(recipient);
		if (accounts[idxUser].getUserPassword().equals(password)) {
			if (amount > 0 && amount < accounts[idxUser].getBalance()) {
				accounts[idxUser].withDraw(amount);
				accounts[idxrecipient].deposit(amount);
				System.out.println("transfer success");
			} else {
				System.err.println("amount under ZERO or more than your balance ");
				System.err.println("transfer fail");
			}

		} else {
			System.err.println("no such User please Re-Check");
			System.err.println("deposite fail");

		}
	}

	double getAssets() {
		for (int i = 0; i < accounts.length; i++) {

			assets += accounts[i].getBalance();

		}
		return assets;

	}

	private int findAccount(String name, String govId) {// finding the account
														// in the Array by the
														// name and ID
		for (int i = 0; i < count; i++) {
			if (name.equals(accounts[i].getName())) {
				if (govId.equals(accounts[i].getGovId())) {
					return i;
				}
				return i;
			}

		}
		return -1;
	}

	private int findUsername(String username) {
		for (int i = 0; i < count; i++) {
			if (username.equals(accounts[i].getUserName())) {

				return i;
			}

		}
		return -1;
	}

	private void resortingList() {// re-arrange the array after closing an
									// account fuzzy logic
		/**
		 * unusual super Logic to Sort an array so there is no null after
		 * deleting/closing an account
		 */
		for (int i = count - 1; i >= 0; i--) {

			if (accounts[i] != null) {
				Account point;
				point = accounts[i];
				if (i == 0 && accounts[0] == null) {
					accounts[0] = point;
					accounts[i] = null;

				}
				if (i > 0 && accounts[i - 1] == null) {
					accounts[i - 1] = point;
					accounts[i] = null;
					if (i < accounts.length - 1 && accounts[i] == null && accounts[i + 1] != null) {
						accounts[i] = accounts[i + 1];
						accounts[i + 1] = null;
					}

				}

			}
			if (accounts[i] == null) {
				continue;
			}

		}
	}

	private boolean checkUserAndPassword(String username, String password) {
		for (int i = 0; i < count; i++) {
			if (accounts[i].getUserName().equals(username) && accounts[i].getUserPassword().equals(password)) {
				return true;
			}
			return true;
		}
		return false;
	}
}
