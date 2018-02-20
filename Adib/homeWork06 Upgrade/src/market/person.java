package market;



public class person {
	private final String name;
	private double balance;
	static product[] itemsList = new product[500];
	int countProducts = 0;

	public person(String name, double balance) {

		this.name = name;
		if (nameIsNull()) {

			return;
		}
		this.balance = balance;
		if (balanceUnder0()) {
			return;

		}

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	boolean nameIsNull() {
		if (this.name.equals(null) && this.name.isEmpty()) {
			System.err.println("Worning Name is Null Or Empty");
			return true;
		}
		return false;
	}

	boolean balanceUnder0() {
		if (this.balance < 0) {
			System.err.println("Worning Negative Amountt");
			return true;
		}
		
		return false;
	}

	boolean buy(product product) {
		if (this.balance < product.getPrice()) {
			System.out.println(this.name + " can’t afford " + product.getName());
			return true;
		}
		if (this.balance >= product.getPrice()) {
			this.balance -= product.getPrice();
			itemsList[countProducts++] = product;
			
			System.out.println(this.name + " bought " + product.getName());
			return true;
		}
		
		return false;
	}

	static void afterEndCommand() {
		
		for (int i = 0; i < itemsList.length; i++) {
			System.out.print(itemsList[i].getName() + ";");
		}

	}

}
