package BackUp;

import java.util.Scanner;

public class MainOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Input first number:");
			double firstNumber = sc.nextDouble();
			System.out.println("Input second number:");
			double secondNumber = sc.nextDouble();
			Operator operator = new Operator(firstNumber, secondNumber);
			System.out.println("The addition of two numbers = " + operator.add());
			System.out.println("The substraction of two numbers = " + operator.sub());
			System.out.println("The multiplication of two numbers = " + operator.mul());
			System.out.println("The devision of two numbers = " + operator.dev());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
