package trainging.oldtasks;

public class product {
	private final String name;
	private double price;

	public product(String name, double price) {
		this.name = name;
		if (nameIsNull()) {
			return;
		}
		this.price = price;
		if (priceUnder0()) {
			
			return;

		}

	}

	public String getName() {
		return name;
	}

	private boolean nameIsNull() {
		if (this.name.equals(null) && this.name.isEmpty()) {
			System.err.println("Warning Wrong Name input");
			return true;
		}
		return false;
	}

	private boolean priceUnder0() {
		if (this.price < 0) {
			System.err.println("Warrning Negative Price");
			return true;
		}
		return false;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
