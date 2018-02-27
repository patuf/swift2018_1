package swift.homwork;

public class Square extends Rectangle {

	public Square(double a) {
		super(a, a);

	}

	@Override
	public double calcParimeter() {

		return 4 * a;
	}

	@Override
	public double calcArea() {
		return a * a;
	}

	public String getName() {
		return "Square";
	}

	@Override
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

	@Override

	public void drawMe(int a, int fill) {
		if (isfill(fill)) {
			for (int i = 1; i < a; i++) {
				for (int j = 1; j < a; j++) {

					System.out.print(" #");
				}
				if (i != a) {
					System.out.println();
				}
			}

		} else {
			for (int i = 1; i < a; i++) {
				for (int j = 1; j < a; j++) {
					if (i != 1 && j > 1 && i != a - 1 && j != a - 1) {
						System.out.print("  ");
					} else
						System.out.print("* ");
				}
				System.out.println();

			}
			
		}
	}
}
