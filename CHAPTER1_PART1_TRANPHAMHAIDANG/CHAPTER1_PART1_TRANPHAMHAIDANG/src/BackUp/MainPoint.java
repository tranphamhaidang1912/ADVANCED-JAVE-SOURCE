package BackUp;

import java.util.Scanner;

public class MainPoint {

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
			System.out.println("Input point B");
			System.out.println("Input B.x:");
			double B_x = sc.nextDouble();
			System.out.println("Input B.y:");
			double B_y = sc.nextDouble();
			Point B = new Point(B_x, B_y);
			System.out.println("The distance between two points A and B = " + A.getDistanceBetweenTwoPoints(B));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
