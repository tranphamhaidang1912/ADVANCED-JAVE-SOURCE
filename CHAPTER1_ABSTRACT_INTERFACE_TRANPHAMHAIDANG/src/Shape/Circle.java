package Shape;

/*
 * Author: Tran Pham Hai Dang
 * Date: 23/08/2016
 * Version: 1.0
 * Class for Circle
 */
public class Circle extends Shape {

	public double r;
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * r;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(r, 2);
	}
}
