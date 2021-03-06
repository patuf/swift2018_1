package swift.homwork;

import java.util.Scanner;

public class Picture {

	public static void main(String[] args) {

		Drawable[] shapeDrawing = new Drawable[10];
		int count = 0;
		Scanner sc = new Scanner(System.in);

		String shapeName = "";
		loop: while (true) {
			System.out.println("Enter the shape you want to be draw :");
			shapeName = sc.next();
			switch (shapeName.toUpperCase()) {
			case "CIRCLE":
				System.out.println("enter radius");
				Circle c = new Circle(sc.nextDouble());
				System.out.println("enter 2 integer numbers the second number can be 0");
				c.drawMe(sc.nextInt(), sc.nextInt());
				shapeDrawing[count++] = c;

				break;
			case "RECTANGLE":
				System.out.println("enter both of my sides a and b");
				Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
				System.out.println("enter 3 integer numbers the third number can be 0");
				r.drawMe(sc.nextInt(), sc.nextInt(), sc.nextInt());
				shapeDrawing[count++] = r;

				break;
			case "SQUARE":
				System.out.println("enter one of my side a");
				Square s = new Square(sc.nextDouble());
				System.out.println("enter 2 integer numbers the second number can be 0");
				s.drawMe(sc.nextInt(), sc.nextInt());// enter number and fill
														// number
				shapeDrawing[count++] = s;

				break;

			default:
				System.out.printf("the Shape you Asked %s is under Construction", shapeName);
				break loop;
			}
			for (Drawable drawable : shapeDrawing) {
				System.out.println(
						"please enter coorinate X&Y, if you want to fill 0 or 1 ,and color number (always black)\n");
				drawAshape((Shape) drawable, sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

				break;
			}
			if (shapeName.equalsIgnoreCase("END")) {

				break loop;
			}
		}

	}

	static void drawAshape(Shape shape, int X, int Y, int fill, int color) {
		System.out.println(shape.describeMe());
		shape.Coordinate(X, Y);
		shape.isfill(fill);
		shape.color(color);

	}

}