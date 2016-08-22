package Book;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Book
 */
public class Book {

	String id;
	String name;
	String date;
	double price;
	int number;
	String manufacturer;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Book(String id, String name, String date, double price, int number,
			String manufacturer) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.price = price;
		this.number = number;
		this.manufacturer = manufacturer;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//show the information of book
	public void showInformationBook() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Date: " + date);
		System.out.println("Price: " + price);
		System.out.println("Number: " + number);
		System.out.println("Manufacturer: " + manufacturer);
	}
}
