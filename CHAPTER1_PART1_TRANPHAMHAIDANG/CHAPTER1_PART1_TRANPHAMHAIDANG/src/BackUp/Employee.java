package BackUp;

enum LevelTax {
	LEVEL1(5000000, 250000, 0.05), LEVEL2(10000000, 500000, 0.1), LEVEL3(18000000, 1200000, 0.15), LEVEL4(32000000, 2800000, 0.2), LEVEL5(52000000, 5000000, 0.25), LEVEL6(80000000, 8400000, 0.3), LEVEL7(0 , 0, 0.35);
	private double INCOMETAX;
	private double TAX;
	private double PERCENTTAX;
	private LevelTax(double INCOMETAX, double TAX, double PERCENTTAX) {
		this.INCOMETAX = INCOMETAX;
		this.TAX = TAX;
		this.PERCENTTAX = PERCENTTAX;
	}
	
	public double getPersonalIncomeTax(double taxIncome) {
		double personalIncome = 0;
		switch (this) {
		case LEVEL1:
			personalIncome = taxIncome * LEVEL1.PERCENTTAX;
			return personalIncome;
		case LEVEL2:
			personalIncome = LEVEL1.TAX + (taxIncome - LEVEL1.INCOMETAX ) * LEVEL2.PERCENTTAX;
			return personalIncome;
		case LEVEL3:
			personalIncome = LEVEL1.TAX + LEVEL2.TAX + (taxIncome - LEVEL2.INCOMETAX) * LEVEL3.PERCENTTAX;
			return personalIncome;
		case LEVEL4:
			personalIncome = LEVEL1.TAX + LEVEL2.TAX + LEVEL3.TAX + (taxIncome - LEVEL3.INCOMETAX) * LEVEL4.PERCENTTAX;
			return personalIncome;
		case LEVEL5:
			personalIncome = LEVEL1.TAX + LEVEL2.TAX + LEVEL3.TAX + LEVEL4.TAX + (taxIncome - LEVEL4.INCOMETAX) * LEVEL5.PERCENTTAX;
			return personalIncome;
		case LEVEL6:
			personalIncome = LEVEL1.TAX + LEVEL2.TAX + LEVEL3.TAX + LEVEL4.TAX + LEVEL5.TAX + (taxIncome - LEVEL5.INCOMETAX) * LEVEL6.PERCENTTAX;
			return personalIncome;
		case LEVEL7:
			personalIncome = LEVEL1.TAX + LEVEL2.TAX + LEVEL3.TAX + LEVEL4.TAX + LEVEL5.TAX + LEVEL6.TAX + (taxIncome - LEVEL6.INCOMETAX) * LEVEL7.PERCENTTAX;
			return personalIncome;
		default:
			break;
		}
		return personalIncome;
	}
}

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Employee
 */
public class Employee {

	private String fullName;
	private double wage;
	private int amountReducePerson;
	private double allowance;
	private String percenttax;
	private final double BASESALARY = 1260000;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getAmountReducePerson() {
		return amountReducePerson;
	}

	public void setAmountReducePerson(int amountReducePerson) {
		this.amountReducePerson = amountReducePerson;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public String getPercenttax() {
		return percenttax;
	}

	public Employee(String fullName, double wage, int amountReducePerson,
			double allowance) {
		super();
		this.fullName = fullName;
		this.wage = wage;
		this.amountReducePerson = amountReducePerson;
		this.allowance = allowance;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Calculate the income
	public double getIncome() {
		return ((wage * BASESALARY) + allowance);
	}
	
	//Calculate the tax income
	public double getTaxIncome() {
		return getIncome() - 9000000 - amountReducePerson * 3600000;
	}
	
	//Calculate the personal income tax
	public double getPersonalIncomeTax() {
		double personalIncomeTax = 0;
		if(getTaxIncome() < 5000000)
		{
			personalIncomeTax = LevelTax.LEVEL1.getPersonalIncomeTax(getTaxIncome());
			percenttax = "5 / 100";
		}	
		else if(getTaxIncome() < 10000000)
		{
			personalIncomeTax = LevelTax.LEVEL2.getPersonalIncomeTax(getTaxIncome());
			percenttax = "10 / 100";
		}
			
		else if(getTaxIncome() < 18000000)
		{
			personalIncomeTax = LevelTax.LEVEL3.getPersonalIncomeTax(getTaxIncome());
			percenttax = "15 / 100";
		}
			
		else if(getTaxIncome() < 32000000)
		{
			personalIncomeTax = LevelTax.LEVEL4.getPersonalIncomeTax(getTaxIncome());
			percenttax = "20 / 100";
		}
			
		else if(getTaxIncome() < 52000000)
		{
			personalIncomeTax = LevelTax.LEVEL5.getPersonalIncomeTax(getTaxIncome());
			percenttax = "25 / 100";
		}
			
		else if(getTaxIncome() < 80000000)
		{
			personalIncomeTax = LevelTax.LEVEL6.getPersonalIncomeTax(getTaxIncome());
			percenttax = "30 / 100";
		}
			
		else
		{
			personalIncomeTax = LevelTax.LEVEL7.getPersonalIncomeTax(getTaxIncome());
			percenttax = "35 / 100";
		}
			
		return personalIncomeTax;
	}
	
	//Calculate the real income
	public double getRealIncome() {
		return getIncome() - getPersonalIncomeTax();
	}
}
