package ManageEmployee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

	private String name;
	private String sex;
	private Date birthDate;
	private double salary;
	private String address;
	private String idDepartment;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(String idDepartment) {
		this.idDepartment = idDepartment;
	}

	public Employee(String name, String sex, Date birthDate, double salary,
			String address, String idDepartment) {
		super();
		this.name = name;
		this.sex = sex;
		this.birthDate = birthDate;
		this.salary = salary;
		this.address = address;
		this.idDepartment = idDepartment;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	// show employee's information
	public void showInformation() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Name: " + name);
		System.out.println("Sex: " + sex);
		System.out.println("Birth date: " + dateFormat.format(birthDate));
		System.out.println("Salary: " + salary);
		System.out.println("Address: " + address);
	}

}
