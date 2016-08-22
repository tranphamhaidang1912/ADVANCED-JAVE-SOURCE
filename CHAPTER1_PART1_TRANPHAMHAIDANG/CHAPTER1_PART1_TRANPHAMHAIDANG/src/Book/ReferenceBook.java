package Book;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Reference Book
 */
public class ReferenceBook extends Book {

	double tax;

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public ReferenceBook(String id, String name, String date, double price,
			int number, String manufacturer, double tax) {
		super(id, name, date, price, number, manufacturer);
		this.tax = tax;
	}

	public ReferenceBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReferenceBook(String id, String name, String date, double price,
			int number, String manufacturer) {
		super(id, name, date, price, number, manufacturer);
		// TODO Auto-generated constructor stub
	}
	
	//Calculate the total price of Reference book
	public double getTotalPriceReferenceBook() {
		double totalPrice = (number * price) + (number * price) * tax;
		return totalPrice;
	}

	@Override
	public void showInformationBook() {
		// TODO Auto-generated method stub
		super.showInformationBook();
		System.out.println("Tax: " + tax);
	}
		
}
