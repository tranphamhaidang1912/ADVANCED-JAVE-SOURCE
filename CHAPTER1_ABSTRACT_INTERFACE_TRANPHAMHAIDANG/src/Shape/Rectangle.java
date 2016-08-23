package Shape;

/*
 * Author: Tran Pham Hai Dang
 * Date: 23/08/2016
 * Version: 1.0
 * Class for Rectangle
 */
public class Rectangle extends Shape {

	public double length;
	
	public double width;
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (length + width) * 2;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * width;
	}
}
