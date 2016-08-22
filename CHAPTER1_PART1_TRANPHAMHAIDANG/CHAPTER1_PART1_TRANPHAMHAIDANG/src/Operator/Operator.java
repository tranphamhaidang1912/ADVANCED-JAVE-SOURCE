package Operator;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Operator
 */
public class Operator {

	private double firstNumber;
	private double secondNumber;
		
	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public Operator(double firstNumber, double secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public Operator() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//The addition of two numbers
	public double add() {
		return firstNumber + secondNumber;
	}
	
	//The substraction of two numbers
	public double sub() {
		return firstNumber - secondNumber;
	}
	
	//The multiplication of two numbers 
	public double mul() {
		return firstNumber * secondNumber;
	}
	
	//The devision of two numbers
	public double dev() {
		return firstNumber / secondNumber;
	}
}
