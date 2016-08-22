package Trade;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Trade
 */
public class Trade {

	String id;
	String date;
	int number;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Trade(String id, String date, int number) {
		super();
		this.id = id;
		this.date = date;
		this.number = number;
	}

	public Trade() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Show the information of trade
	public void showInformationTrade() {
		System.out.println("ID: " + id);
		System.out.println("Date: " + date);
		System.out.println("Number: " + number);
	}
}
