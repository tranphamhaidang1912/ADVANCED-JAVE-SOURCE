package BackUp;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Point
 */
public class Point {

	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Calculate the distance between two points
	public double getDistanceBetweenTwoPoints(Point P) {
		double distance = Math.sqrt((x - P.x) * (x - P.x) + (y - P.y) * (y - P.y));
		return distance;
	}
}
