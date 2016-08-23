package Shape;

/*
 * Author: Tran Pham Hai Dang
 * Date: 23/08/2016
 * Version: 1.0
 * Class for Square
 */
public class Square extends Shape {

	public double edge;
	
	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4 * edge;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.pow(edge, 2);
	}
}
