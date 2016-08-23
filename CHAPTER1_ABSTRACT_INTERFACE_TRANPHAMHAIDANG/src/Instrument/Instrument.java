package Instrument;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Abstract class for Instrument
 */
public abstract class Instrument {

	public String name;
	
	public String manufacturer;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Instrument(String name, String manufacturer) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
	}

	public Instrument() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Show information of Instrument
	public abstract void play();
}
