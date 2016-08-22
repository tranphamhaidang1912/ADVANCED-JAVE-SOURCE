package BackUp;

import java.util.Scanner;

public class MainLinearEquation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Input a:");
			double a = sc.nextDouble();
			System.out.println("Input b:");
			double b = sc.nextDouble();
			LinearEquation1 linearquation1 = new LinearEquation1(a, b);
			double[] root = linearquation1.findRootLinearEquation1();
			if(root[0] == 0 && root[1] == 0)
				System.out.println("Equation have no root");
			else if(root[1] == 1)
				System.out.println("Equation have one root: " + root[2]);
			else
				System.out.println("Equation have infinite root");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
