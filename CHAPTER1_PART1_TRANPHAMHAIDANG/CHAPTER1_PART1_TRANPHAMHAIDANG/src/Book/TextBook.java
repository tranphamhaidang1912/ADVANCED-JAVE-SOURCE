package Book;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Text Book
 */
public class TextBook extends Book {
	
	String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public TextBook(String id, String name, String date, double price,
			int number, String manufacturer, String state) {
		super(id, name, date, price, number, manufacturer);
		this.state = state;
	}

	public TextBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TextBook(String id, String name, String date, double price,
			int number, String manufacturer) {
		super(id, name, date, price, number, manufacturer);
		// TODO Auto-generated constructor stub
	}
	
	//Calculate the total price of Text book
	public double getTotalPriceTextBook() {
		double totalPrice = 0;
		if(state.compareTo("moi") == 0)
			totalPrice = number * price;
		else if(state.compareTo("cu") == 0)
			totalPrice = number * price * 0.5;
		return totalPrice;
	}

	@Override
	public void showInformationBook() {
		// TODO Auto-generated method stub
		super.showInformationBook();
		System.out.println("State: " + state);
	}
	
}
