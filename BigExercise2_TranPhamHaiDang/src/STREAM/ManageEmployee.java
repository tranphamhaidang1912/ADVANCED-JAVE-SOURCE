package STREAM;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 20-Sep-2016 Class for Manage Employee
 */
public class ManageEmployee {

	private static List<Employee> listEmployee = new ArrayList<Employee>();
	private static DoubleSummaryStatistics stats;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("meo");
		createList();

		System.out.println("LIST EMPLOYEE HAVE SALARY > 3000000:\n");
		listEmployee.stream()
				.filter(employee -> employee.getSalary() > 3000000)
				.forEach(employee -> employee.showInformation());
		
		System.out.println("LIST EMPLOYEE HAVE WORD \"Anh\" IN FULL NAME:\n");
		listEmployee.stream()
				.filter(employee -> employee.getFullName().contains("Anh"))
				.forEach(employee -> employee.showInformation());
		
		createStatsAge();
		System.out.println("AVERAGE AGE OF EMPLOYEE: " + getAverageAge());
		
		createStatsSalary();
		System.out.println("MAX SALARY IN LIST EMPLOYEE: " + getMaxSalary());
		System.out.println("MIN SALARY IN LIST EMPLOYEE: " + getMinSalary());
		System.out.println("AVERAGE SALARY IN LIST EMPLOYEE: " + getAverageSalary());
	}

	// Create list employee
	public static void createList() {
		listEmployee.add(new Employee("Tran Pham Hai Dang", 18, 9000000));
		listEmployee.add(new Employee("Ha Tan Dien", 19, 9000000));
		listEmployee.add(new Employee("Bui Truong Minh Tuan", 20, 8000000));
		listEmployee.add(new Employee("Huynh Tan Hoa", 21, 7000000));
		listEmployee.add(new Employee("To Tran Minh Nhut", 22, 6000000));
		listEmployee.add(new Employee("Nguyen Van Nhut", 21, 5000000));
		listEmployee.add(new Employee("Nguyen Hoang Phu Tien", 20, 5000000));
		listEmployee.add(new Employee("Tran Minh Quan", 19, 4000000));
		listEmployee.add(new Employee("Le Anh Minh", 18, 3000000));
		listEmployee.add(new Employee("Tran Ngoc Dan", 19, 2000000));
		listEmployee.add(new Employee("Nguyen Trong Thuan", 20, 1000000));
		listEmployee.add(new Employee("Dao Duc Nha", 21, 2000000));
		listEmployee.add(new Employee("Nguyen Quoc Huy", 22, 3000000));
		listEmployee.add(new Employee("Truong Ngoc Tinh Anh", 18, 4000000));
		listEmployee.add(new Employee("Nguyen Thi Lan Phuong", 19, 5000000));
	}
	
	//Create stats for age
	public static void createStatsAge() {
		stats = listEmployee.stream().mapToDouble(employee -> employee.getAge())
				.summaryStatistics();
	}

	//Create stats for salary
	public static void createStatsSalary() {
		stats = listEmployee.stream().mapToDouble(employee -> employee.getSalary())
				.summaryStatistics();
	}
	
	//Calculate average age of employee
	public static double getAverageAge() {
		return stats.getAverage();
	}
	
	//Calculate max salary of employee
	public static double getMaxSalary() {
		return stats.getMax();
	}
	
	//Calculate min salary of employee
	public static double getMinSalary() {
		return stats.getMin();
	}
	
	//Calculate average salary of employee
	public static double getAverageSalary() {
		return stats.getAverage();
	}
}
