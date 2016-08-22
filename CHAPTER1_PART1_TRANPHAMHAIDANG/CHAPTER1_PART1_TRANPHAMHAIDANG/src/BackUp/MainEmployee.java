package BackUp;

import java.util.Scanner;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
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
			double income = employee.getIncome();
			System.out.println("Income = " + wage + " * 1260000 + " + allowance + " = " + String.format("%.0f", income));
			double taxIncome = employee.getTaxIncome();
			System.out.println("Tax Income = " + String.format("%.0f", income) + " - 9000000 - " + amountReducePerson + " * 3600000 = " + String.format("%.0f", taxIncome));
			double personalIncomeTax = employee.getPersonalIncomeTax();
			System.out.println("Personal Income Tax = " + String.format("%.0f", taxIncome) + " * " + employee.getPercenttax() + " = " + String.format("%.0f", personalIncomeTax));
			double realIncome = employee.getRealIncome();
			System.out.println("Real Income = " + String.format("%.0f", income) + " - " + String.format("%.0f", personalIncomeTax) + " = " + String.format("%.0f", realIncome));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
