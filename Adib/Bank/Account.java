package homeWork.Bank;

public abstract class Account {

	private Customer owner;
	private double monthlyInterestRate;
	private double balance;
	private static int count = 00000001;
	private final String IBAN;
	

	public Account(Customer owner, double balance, double monthlyInterestRate) {
		super();
		this.owner = owner;
		this.IBAN = String.format("%08d", count++);
		this.monthlyInterestRate = monthlyInterestRate/100;
		this.balance = balance;
	}

	public Customer getOwner() {
		return owner;
	}

	public String getIBAN() {
		return IBAN;
	}

	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public double getBalance() {
		return balance;
	}

	public final void setBalance(double balance) {
		if (balance<0) {
			return;
		}
		this.balance = balance;
	}

	public abstract double calcInterest(int month,Customer owner);

	void deposit(double amount) {// adding money to the account
		if (balance < 0) {
			return;

		}
		this.balance += amount;
		
	}

	

}
