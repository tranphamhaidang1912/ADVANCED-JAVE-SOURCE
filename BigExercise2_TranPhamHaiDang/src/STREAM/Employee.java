package STREAM;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 20-Sep-2016 Class for Employee 
 */
public class Employee {

	private String fullName;
	private int age;
	private double salary;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public Employee(String fullName, int age, double salary) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Show employee's information
	public void showInformation() {
		System.out.println("Full name: " + fullName);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + String.format("%.2f", salary));
		System.out.println();
	}
	
}
