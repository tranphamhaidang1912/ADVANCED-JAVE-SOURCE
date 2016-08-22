package Employee;

import java.util.Scanner;

import Book.ReferenceBook;
import Book.TextBook;

public class MainEmployee {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ProduceEmployee[] productEmployee = new ProduceEmployee[100];
			BusinessEmployee[] businessEmployee = new BusinessEmployee[100];
			String choose = "";
			int numberOfProduceEmployee = 0;
			int numberOfBusinessEmployee = 0;
			do {
				System.out.println("Input full name:");
				String fullName = sc.nextLine();
				System.out.println("Input wage:");
				double wage = sc.nextDouble();
				System.out.println("Input amount reduce person:");
				int amountReducePerson = sc.nextInt();
				System.out.println("Input allowance:");
				double allowance = sc.nextDouble();
				
				choose = sc.nextLine();
				System.out.println("1/Produce employee\n2/Business employee");
				choose = sc.nextLine();
				
				if(choose.compareTo("1") == 0)
				{
					System.out.println("Input number of product:");
					int numberProduct = sc.nextInt();
					productEmployee[numberOfProduceEmployee] = new ProduceEmployee(fullName, wage, amountReducePerson, allowance, numberProduct);
					numberOfProduceEmployee++;
					choose = sc.nextLine();
				}
				else if(choose.compareTo("2") == 0)
				{
					System.out.println("Input business salary:");
					double businessSalary = sc.nextDouble();
					System.out.println("Input business salary scale:");
					double businessSalaryScale = sc.nextDouble();
					businessEmployee[numberOfBusinessEmployee] = new BusinessEmployee(fullName, wage, amountReducePerson, allowance, businessSalary, businessSalaryScale);
					numberOfBusinessEmployee++;
					choose = sc.nextLine();
				}
				else
				{
					System.out.println("Please just choose (1) or (2)");
					continue;
				}
				
				System.out.println("Do you want to add more computer? (y / n)");
				choose = sc.nextLine();
			} while (choose.compareTo("y") == 0);	
			
			double totalSalary = 0;
			double averageSalary = 0;
			System.out.println("List of produce employee");
			for (int i = 0; i < numberOfProduceEmployee; i++) {
				productEmployee[i].showInformationEmployee();
				totalSalary += productEmployee[i].getRealIncome();
			}
			averageSalary = totalSalary / numberOfProduceEmployee;
			System.out.println("Average salary of produce employee: " + String.format("%.0f", averageSalary));
			
			totalSalary = 0;
			System.out.println("List of business employee");
			for (int i = 0; i < numberOfBusinessEmployee; i++) {
				businessEmployee[i].showInformationEmployee();
				totalSalary += businessEmployee[i].getRealIncome();
			}
			averageSalary = totalSalary / numberOfBusinessEmployee;
			System.out.println("Average salary of business employee: " + String.format("%.0f", averageSalary));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
