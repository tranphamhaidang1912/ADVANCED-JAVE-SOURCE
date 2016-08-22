package BackUp;

import java.util.Scanner;

public class MainRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Input point A");
			System.out.println("Input A.x:");
			double A_x = sc.nextDouble();
			System.out.println("Input A.y:");
			double A_y = sc.nextDouble();
			Point A = new Point(A_x, A_y);
			System.out.println("Input point C");
			System.out.println("Input C.x:");
			double C_x = sc.nextDouble();
			System.out.println("Input C.y:");
			double C_y = sc.nextDouble();
			Point C = new Point(C_x, C_y);
			Rectangle rectangle = new Rectangle(A, C);
			System.out.println("The perimeter of circle = " + rectangle.getPerimeterRectangle());
			System.out.println("The area of circle = " + rectangle.getAreaRectangle());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
