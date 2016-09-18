package ManageEmployee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import ManageDictionary.WordEnglish;

public class MainEmployee {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> listEmployee = new ArrayList<>();
		int choose = 0;
		
		try {
			do {
				System.out.println("1/Show list employee\n2/Add new employee\n3/Search employee\n4/Delete employee\n5/Exit");
				choose = sc.nextInt();
				System.out.println();
				
				switch (choose) {
				case 1:
					Collections.sort(listEmployee);
					System.out.println("LIST EMPLOYEE\n");
					if(listEmployee.isEmpty() == true)
						System.out.println("List is empty!");
					else {
						for (Employee employee : listEmployee) {
							employee.showInformation();
							System.out.println();
						}
					}
					break;
				case 2:
					sc.nextLine();
					System.out.println("INPUT EMPLOYEE'S INFORMATION\n");
					System.out.println("Input name:");
					String name = sc.nextLine();
					System.out.println("Input age:");
					int age = sc.nextInt();
					System.out.println("Input salary:");
					double salary = sc.nextDouble();
					
					listEmployee.add(new Employee(name, age, salary));
					break;
				case 3:
					sc.nextLine();
					System.out.println("Input name:");
					String nameSearch = sc.nextLine();
					
					boolean flag = false;
					for (Employee employee : listEmployee) {
						if (employee.getName().compareToIgnoreCase(nameSearch) == 0) {
							employee.showInformation();
							System.out.println();
							flag = true;
						}
					}

					if (flag == false)
						System.out.println("Employee is not found!");
					break;
				case 4:
					sc.nextLine();
					System.out.println("Input name:");
					String nameDelete = sc.nextLine();
					
					if(listEmployee.remove(new Employee(nameDelete)) == true)
						System.out.println("Employee is deleted!");
					else
						System.out.println("Employee is not found!");
					break;
				default:
					break;
				}
				System.out.println();
			} while (choose != 5);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
