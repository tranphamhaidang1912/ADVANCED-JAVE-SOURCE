package Trade;

enum MoneyType {
	USD(22260), EUR(24976.28), AUD(16747.13);
	
	double PRICE;
	
	MoneyType(double PRICE) {
		this.PRICE = PRICE;
	}
}

public class MoneyTrade extends Trade {

	String moneyType;
	String tradeType;

	public String getMoneyType() {
		return moneyType;
	}

	public void setMoneyType(String moneyType) {
		this.moneyType = moneyType;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public MoneyTrade(String id, String date, int number, String moneyType,
			String tradeType) {
		super(id, date, number);
		this.moneyType = moneyType;
		this.tradeType = tradeType;
	}

	public MoneyTrade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MoneyTrade(String id, String date, int number) {
		super(id, date, number);
		// TODO Auto-generated constructor stub
	}
	
	public double getTotalPrice() {
		double totalPrice = 0;
		switch (moneyType) {
			case "USD":
				if(tradeType.compareTo("mua") == 0)
					totalPrice = number * MoneyType.USD.PRICE;
				else if(tradeType.compareTo("ban") == 0)
					totalPrice = number * MoneyType.USD.PRICE + (number * MoneyType.USD.PRICE) * 0.1 / 100;
				break;
			case "EUR":
				if(tradeType.compareTo("mua") == 0)
					totalPrice = number * MoneyType.EUR.PRICE;
				else if(tradeType.compareTo("ban") == 0)
					totalPrice = number * MoneyType.EUR.PRICE + (number * MoneyType.EUR.PRICE) * 0.1 / 100;
				break;
			case "AUD":
				if(tradeType.compareTo("mua") == 0)
					totalPrice = number * MoneyType.AUD.PRICE;
				else if(tradeType.compareTo("ban") == 0)
					totalPrice = number * MoneyType.AUD.PRICE + (number * MoneyType.AUD.PRICE) * 0.1 / 100;
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
		System.out.println("Money type: " + moneyType);
		System.out.println("Trade type: " + tradeType);
	}
	
}
