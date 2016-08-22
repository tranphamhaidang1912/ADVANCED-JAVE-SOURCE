package BackUp;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Linear Equation 1
 */
public class LinearEquation1 {

	private double a;
	private double b;
	
	public double getA() {
		return a;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	
	public double getB() {
		return b;
	}
	
	public void setB(double b) {
		this.b = b;
	}
	
	public LinearEquation1(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public LinearEquation1() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Find Root Of Linear Equation 1
	public double[] findRootLinearEquation1() {
		double[] root = new double[3];
		if(a == 0)
		{
			if(b == 0)
				root[0] = 1;
		}
		else
		{
			root[1] = 1;
			root[2] = -b / a;
		}
		return root;
	}
}
