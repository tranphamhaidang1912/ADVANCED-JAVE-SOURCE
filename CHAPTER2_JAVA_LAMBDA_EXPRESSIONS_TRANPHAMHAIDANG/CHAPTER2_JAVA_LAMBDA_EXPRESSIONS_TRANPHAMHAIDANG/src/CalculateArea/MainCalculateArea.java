package CalculateArea;

import java.util.Scanner;

interface Area {
	public double calArea(double x1, double x2);
}

public class MainCalculateArea {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Input radius:");
		double r = sc.nextDouble();
		Area circle = (double x1, double x2) -> x1 * Math.pow(x2, 2);
		System.out.println("S = PI * (r * r) = " + circle.calArea(Math.PI, r));
		System.out.println("Input length:");
		double H = sc.nextDouble();
		System.out.println("Input width:");
		double W = sc.nextDouble();
		Area rectangle = (double x1, double x2) -> x1 * x2;
		System.out.println("S = W x H = " + rectangle.calArea(W, H));
	}

}
