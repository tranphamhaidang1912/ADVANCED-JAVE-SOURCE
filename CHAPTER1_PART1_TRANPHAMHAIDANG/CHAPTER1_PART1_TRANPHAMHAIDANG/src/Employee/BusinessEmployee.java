package Employee;

public class BusinessEmployee extends Employee {

	double businessSalary;
	double businessSalaryScale;

	public double getBusinessSalary() {
		return businessSalary;
	}

	public void setBusinessSalary(double businessSalary) {
		this.businessSalary = businessSalary;
	}

	public double getBusinessSalaryScale() {
		return businessSalaryScale;
	}

	public void setBusinessSalaryScale(double businessSalaryScale) {
		this.businessSalaryScale = businessSalaryScale;
	}

	public BusinessEmployee(String fullName, double wage, int amountReducePerson, double allowance,
			double businessSalary, double businessSalaryScale) {
		super(fullName, wage, amountReducePerson, allowance);
		this.businessSalary = businessSalary;
		this.businessSalaryScale = businessSalaryScale;
	}

	public BusinessEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessEmployee(String fullName, double wage, int amountReducePerson, double allowance) {
		super(fullName, wage, amountReducePerson, allowance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getIncome() {
		// TODO Auto-generated method stub
		return wage * BASESALARY + businessSalary * businessSalaryScale;
	}

	@Override
	public void showInformationEmployee() {
		// TODO Auto-generated method stub
		super.showInformationEmployee();
		System.out.println("Business salary: " + businessSalary);
		System.out.println("Business salary scale: " + businessSalaryScale);
	}
}
