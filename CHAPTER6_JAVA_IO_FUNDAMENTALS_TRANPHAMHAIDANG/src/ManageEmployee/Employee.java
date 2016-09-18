package ManageEmployee;

import java.io.Serializable;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 16-Sep-2016
 * Class for Employee
 */
public class Employee implements Comparable<Employee>, Serializable {

	private String name;
	private int age;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Show employee's information
	public void showInformation() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Double.compare(o.salary, this.salary);
	}
	
	@Override
	public boolean equals(Object o) {
		Employee employee = (Employee) o;
		return this.name.equalsIgnoreCase(employee.name);
	}
}
