package swift.homwork;

public abstract class Shape implements Drawable {

	final static double PI = 3.14;

	public double calcParimeter() {
		return 0;
	}

	public double calcArea() {
		return 0;
	}

	public abstract String getName();

	public String describeMe() {
		return String.format("hello I am " + getName(),
				" My Parimerter is: " + calcParimeter() + " and my Area is: " + calcArea());
	}
	@Override
	public void Coordinate(int X, int Y) {
		System.out.printf("my coordinate are %d and %d. %n", X, Y);

	}
	@Override
	public boolean isfill(int n) {

		if (n == 0) {

			System.out.println("No fill");
			return false;
		} else {
			System.out.println("Solid");
			return true;
		}
	}
	@Override
	public void color(int num) {
		System.out.printf("My colour is %d", num);

	}

}
