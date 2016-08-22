package Computer;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Computer
 */
public class Computer {

	String id;
	double price;
	String manufacturer;
	int number;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Computer(String id, double price, String manufacturer, int number) {
		super();
		this.id = id;
		this.price = price;
		this.manufacturer = manufacturer;
		this.number = number;
	}

	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Calculate the total price of Computer
	public double getTotalPrice() {
		return price * number;
	}
	
	//Show the information of Computer
	public void showInformationComputer() {
		System.out.println("ID: " + id);
		System.out.println("Price: " + String.format("%.0f", price));
		System.out.println("Manufacturer: " + manufacturer);
	}
}
