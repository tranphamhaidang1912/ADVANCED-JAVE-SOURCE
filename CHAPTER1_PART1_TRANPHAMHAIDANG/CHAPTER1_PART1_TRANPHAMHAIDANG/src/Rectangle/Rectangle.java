package Rectangle;

import BackUp.Point;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Rectangle
 */
public class Rectangle {

	private Point A;
	private Point C;

	public Point getA() {
		return A;
	}

	public void setA(Point a) {
		A = a;
	}

	public Point getC() {
		return C;
	}

	public void setC(Point c) {
		C = c;
	}

	public Rectangle(Point a, Point c) {
		super();
		A = a;
		C = c;
	}

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Calculate the perimeter of rectangle
	public double getPerimeterRectangle() {
		double length = Math.abs(C.getX() - A.getX());
		double width = Math.abs(C.getY() - A.getY());
		double perimeter = (length + width) * 2;
		return perimeter;
	}

	// Calculate the area of rectangle
	public double getAreaRectangle() {
		double length = Math.abs(C.getX() - A.getX());
		double width = Math.abs(C.getY() - A.getY());
		double area = length * width;
		return area;
	}
}
