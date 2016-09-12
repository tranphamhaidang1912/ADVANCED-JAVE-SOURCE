package CalculateOperator;

import java.util.Scanner;

interface Operator {
	public Integer operate(Integer operand1, Integer operand2);
}

public class MainCalculateOperator {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Input first number:");
		int firstNumber = sc.nextInt();
		System.out.println("Input second number:");
		int secondNumber = sc.nextInt();
		
		Operator opSum = (Integer operand1, Integer operand2) -> operand1 + operand2;
		int sum = opSum.operate(firstNumber, secondNumber);
		System.out.println("Sum = " + sum);
		Operator opSub = (Integer operand1, Integer operand2) -> operand1 - operand2;
		int sub = opSub.operate(firstNumber, secondNumber);
		System.out.println("Sub = " + sub);
		Operator opMul = (Integer operand1, Integer operand2) -> operand1 * operand2;
		int mul = opMul.operate(firstNumber, secondNumber);
		System.out.println("Mul = " + mul);
		Operator opDev = (Integer operand1, Integer operand2) -> operand1 / operand2;
		int dev = opDev.operate(firstNumber, secondNumber);
		System.out.println("Dev = " + dev);
	}

}
