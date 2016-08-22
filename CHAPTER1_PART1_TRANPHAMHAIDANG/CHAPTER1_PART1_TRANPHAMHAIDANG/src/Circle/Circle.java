package Circle;

import BackUp.Point;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Circle
 */
public class Circle {

	private final double PI = 3.14;
	private Point O;
	private Point R;

	public Point getO() {
		return O;
	}

	public void setO(Point o) {
		O = o;
	}

	public Point getR() {
		return R;
	}

	public void setR(Point r) {
		R = r;
	}

	public Circle(Point o, Point r) {
		super();
		O = o;
		R = r;
	}

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Calculate the perimeter of cirlce
	public double getPerimeterCircle() {
		double radius = O.getDistanceBetweenTwoPoints(R);
		double perimeter = 2 * PI * radius;
		return perimeter;
	}
	
	//Calculate the area of circle
	public double getAreaCircle() {
		double radius = O.getDistanceBetweenTwoPoints(R);
		double area = PI * radius * radius;
		return area;
	}
}
