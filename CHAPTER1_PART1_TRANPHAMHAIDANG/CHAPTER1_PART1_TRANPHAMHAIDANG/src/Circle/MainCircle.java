package Circle;

import java.util.Scanner;

import BackUp.Point;

public class MainCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Input point O");
			System.out.println("Input O.x:");
			double O_x = sc.nextDouble();
			System.out.println("Input O.y:");
			double O_y = sc.nextDouble();
			Point O = new Point(O_x, O_y);
			System.out.println("Input point R");
			System.out.println("Input R.x:");
			double R_x = sc.nextDouble();
			System.out.println("Input R.y:");
			double R_y = sc.nextDouble();
			Point R = new Point(R_x, R_y);
			Circle circle = new Circle(O, R);
			System.out.println("The perimeter of circle = " + circle.getPerimeterCircle());
			System.out.println("The area of circle = " + circle.getAreaCircle());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
