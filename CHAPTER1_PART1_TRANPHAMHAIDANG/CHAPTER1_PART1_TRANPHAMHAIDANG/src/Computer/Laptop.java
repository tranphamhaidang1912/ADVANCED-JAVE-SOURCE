package Computer;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Laptop
 */
public class Laptop extends Computer {

	String weight;
	String timeOfPIN;
	String sizeOfScreen;

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getTimeOfPIN() {
		return timeOfPIN;
	}

	public void setTimeOfPIN(String timeOfPIN) {
		this.timeOfPIN = timeOfPIN;
	}

	public String getSizeOfScreen() {
		return sizeOfScreen;
	}

	public void setSizeOfScreen(String sizeOfScreen) {
		this.sizeOfScreen = sizeOfScreen;
	}

	public Laptop(String id, double price, String manufacturer, int number,
			String weight, String timeOfPIN, String sizeOfScreen) {
		super(id, price, manufacturer, number);
		this.weight = weight;
		this.timeOfPIN = timeOfPIN;
		this.sizeOfScreen = sizeOfScreen;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(String id, double price, String manufacturer, int number) {
		super(id, price, manufacturer, number);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showInformationComputer() {
		// TODO Auto-generated method stub
		super.showInformationComputer();
		System.out.println("Weight: " + weight);
		System.out.println("Time of PIN: " + timeOfPIN);
		System.out.println("Size of screen: " + sizeOfScreen);
		System.out.println("Total price: " + String.format("%.0f", totalPrice()));
	}
}
