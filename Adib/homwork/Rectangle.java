package swift.homwork;

public class Rectangle extends Shape {
	double a;
	double b;

	public Rectangle(double a, double b) {

		this.a = a;
		this.b = b;
	}

	@Override
	public double calcParimeter() {
		return 2 * (a + b);
	}

	@Override
	public double calcArea() {
		return a * b;
	}

	@Override
	public String getName() {

		return "Rectangle";
	}

	
	

	
		

	
	public void drawMe(int a,int b, int fill) {
		if (isfill(fill)) {
		for (int i = 1; i <= a; i++) {
				for (int j = 1; j <= b; j++) {
					System.out.print("*");
				}
				if (i != a) {
					System.out.println();
				}
			}

		} else {
			for (int i = 1; i <= a; i++) {
				for (int j = 1; j <= b; j++) {
					if (i != 1 && i != a) {
						if (j == 1 || j == b) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					} else {
						System.out.print("*");
					}
				}
				if (i != a) {
					System.out.println();
				}
			}
			
		}
	}

	
		
	

}
