package Trade;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Gold Trade
 */

enum GoldType {
	TYPE10K(13889000), TYPE14K(19915000), TYPE18K(25978000), TYPE24K(35141000);
	
	double PRICE;
	
	GoldType(double PRICE) {
		this.PRICE = PRICE;
	}
}

public class GoldTrade extends Trade {

	String goldType;
	
	public String getGoldType() {
		return goldType;
	}

	public void setGoldType(String goldType) {
		this.goldType = goldType;
	}

	public GoldTrade(String id, String date, int number, String goldType) {
		super(id, date, number);
		this.goldType = goldType;
	}

	public GoldTrade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoldTrade(String id, String date, int number) {
		super(id, date, number);
		// TODO Auto-generated constructor stub
	}

	//Calculate the total price of Gold trade
	public double getTotalPrice() {
		double totalPrice = 0;
		switch (goldType) {
			case "10K":
				totalPrice = number * GoldType.TYPE10K.PRICE;
				break;
			case "14K":
				totalPrice = number * GoldType.TYPE14K.PRICE;
				break;
			case "18K":
				totalPrice = number * GoldType.TYPE18K.PRICE;
				break;
			case "24K":
				totalPrice = number * GoldType.TYPE24K.PRICE;
				break;
			default:
				break;
		}
		return totalPrice;
	}

	@Override
	public void showInformationTrade() {
		// TODO Auto-generated method stub
		super.showInformationTrade();
		System.out.println("Gold type: " + goldType);
	}
	
}
