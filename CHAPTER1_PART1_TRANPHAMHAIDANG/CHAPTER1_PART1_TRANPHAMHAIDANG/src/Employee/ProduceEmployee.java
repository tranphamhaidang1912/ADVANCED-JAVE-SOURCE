package Employee;

public class ProduceEmployee extends Employee {

	int numberProduct;
	final int productNorms = 1000;
	final double awardScale = 0.05;

	public int getNumberProduct() {
		return numberProduct;
	}

	public void setNumberProduct(int numberProduct) {
		this.numberProduct = numberProduct;
	}

	public ProduceEmployee(String fullName, double wage, int amountReducePerson, double allowance, int numberProduct) {
		super(fullName, wage, amountReducePerson, allowance);
		this.numberProduct = numberProduct;
	}

	public ProduceEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProduceEmployee(String fullName, double wage, int amountReducePerson, double allowance) {
		super(fullName, wage, amountReducePerson, allowance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getIncome() {
		// TODO Auto-generated method stub
		if(numberProduct > productNorms)
			return wage * BASESALARY + (numberProduct - productNorms) * awardScale;
		return wage * BASESALARY;
	}

	@Override
	public void showInformationEmployee() {
		// TODO Auto-generated method stub
		super.showInformationEmployee();
		System.out.println("Number of product: " + numberProduct);
	}
}
