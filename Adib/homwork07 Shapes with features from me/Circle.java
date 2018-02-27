package swift.homwork;

public class Circle extends Shape {

	double r;

	public Circle(double r) {

		this.r = r;
	}

	@Override
	public double calcParimeter() {
		return 2 * PI * r;
	}

	@Override
	public double calcArea() {
		return PI * r * r;
	}

	@Override
	public String getName() {

		return "Circle";
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

			
			return false;
		} else {
			
			return true;
		}
	}

	@Override
	public void color(int num) {
		System.out.printf("My colour is %d", num);

	}
	@Override
	public void drawMe(int r,int fill) {
		if (isfill(fill)) {

			System.out.println("no fill circle");
			for (int i = -r; i <= r; i++) {
				for (int j = -r; j <= r; j++) {
					if (i * i + j * j <= r * r) {
						System.out.print("0 ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}else {
			System.out.println("Solid circle");
			for (int i = -r; i <= r; i++) {
				for (int j = -r; j <= r; j++) {
					if (i * i + j * j <= r * r) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			
		}
	}
}
