package BackUp;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Teacher
 */
public class Teacher extends Human {

	String headClass;
	double wage;
	double allowance;
	final double baseSalary = 1260000;

	public String getHeadClass() {
		return headClass;
	}

	public void setHeadClass(String headClass) {
		this.headClass = headClass;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public Teacher(String fullName, String birthDate, String address,
			String phoneNumber, String headClass, double wage, double allowance) {
		super(fullName, birthDate, address, phoneNumber);
		this.headClass = headClass;
		this.wage = wage;
		this.allowance = allowance;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String fullName, String birthDate, String address,
			String phoneNumber) {
		super(fullName, birthDate, address, phoneNumber);
		// TODO Auto-generated constructor stub
	}

	//Calculate the salary of teacher
	public double getSalary() {
		return wage * baseSalary + allowance;
	}
	
	@Override
	public void showInformationHuman() {
		// TODO Auto-generated method stub
		super.showInformationHuman();
		System.out.println("Head Class: " + headClass);
		System.out.println("Wage: " + wage);
		System.out.println("Allowance: " + allowance);
		System.out.println("Salary: " + getSalary());
	}
	
}
