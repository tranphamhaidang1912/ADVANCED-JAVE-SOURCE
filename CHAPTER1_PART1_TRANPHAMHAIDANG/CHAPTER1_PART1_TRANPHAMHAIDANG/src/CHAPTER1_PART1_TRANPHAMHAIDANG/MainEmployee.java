package CHAPTER1_PART1_TRANPHAMHAIDANG;

import java.util.Scanner;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Input full name:");
		String fullName = sc.nextLine();
		System.out.println("Input wage:");
		double wage = sc.nextDouble();
		System.out.println("Input amount reduce person:");
		int amountReducePerson = sc.nextInt();
		System.out.println("Input allowance:");
		double allowance = sc.nextDouble();
		
		Employee employee = new Employee(fullName, wage, amountReducePerson, allowance);
		System.out.println("Income = " + wage + " * 1260000 + " + allowance + " = " + String.format("%f", employee.getIncome()));
		System.out.println("Tax Income = " + employee.getIncome() + " - 9000000 - " + amountReducePerson + " * 3600000 = " + employee.getTaxIncome());
		System.out.println("Personal Income Tax = " + employee.getTaxIncome() + " * " + employee.getPercenttax() + " = " + employee.getPersonalIncomeTax());
		System.out.println("Real Income = " + employee.getIncome() + " - " + employee.getPersonalIncomeTax());
	}

}
