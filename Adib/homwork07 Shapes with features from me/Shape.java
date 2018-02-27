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

	public void drawMe(int a, int fill) {

	}

	public void drawMe(int a, int b, int fill) {

	}

}
