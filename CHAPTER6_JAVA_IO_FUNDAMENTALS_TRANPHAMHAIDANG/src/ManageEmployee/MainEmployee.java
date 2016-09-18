package ManageEmployee;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import SummarySchoolYear.Student;

public class MainEmployee {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> listEmployee = new ArrayList<Employee>();

		// listEmployee.add(new Employee("Dang", 18, 5000000));
		// listEmployee.add(new Employee("Tuan", 18, 5000000));
		// listEmployee.add(new Employee("Hoa", 18, 5000000));
		// listEmployee.add(new Employee("Dien", 18, 5000000));
		//
		//
		// outputFile(listEmployee);

		String path = "src/ManageEmployee/employee.txt";
		readFile(path, listEmployee);

		int choose = 0;

		try {
			do {
				System.out.println("1/Show list employee\n2/Add new employee\n3/Search employee\n4/Exit");
				choose = sc.nextInt();
				System.out.println();

				switch (choose) {
				case 1:
					Collections.sort(listEmployee);
					System.out.println("LIST EMPLOYEE\n");
					if (listEmployee.isEmpty() == true)
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

					ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path, true)) {
						@Override
						protected void writeStreamHeader() throws java.io.IOException {
							reset();
						}
					};
					out.writeObject(new Employee(name, age, salary));
					out.close();
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
				default:
					break;
				}
				System.out.println();
			} while (choose != 4);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

	public static void readFile(String path, List<Employee> listEmployee) {

		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)))) {

			while (true) {
				Employee employee = (Employee) in.readObject();
				listEmployee.add(employee);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

	public static void outputFile(String path, List<Employee> listEmployee) throws FileNotFoundException, IOException {

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path)) {
			@Override
			protected void writeStreamHeader() throws java.io.IOException {
				reset();
			}
		};
		for (Employee employee : listEmployee) {
			out.writeObject(employee);
		}
		out.close();
	}
}
