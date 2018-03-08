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

	public void drawMe(int r,int fill) {
		if (isfill(fill)) {

			
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
