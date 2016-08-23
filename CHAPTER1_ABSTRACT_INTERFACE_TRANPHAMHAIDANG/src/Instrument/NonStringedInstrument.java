package Instrument;

/*
 * Author: Tran Pham Hai Dang
 * Date: 23/08/2016
 * Version: 1.0
 * Class for Non Stringed Instrument
 */
public class NonStringedInstrument extends Instrument {

	public String use;
	
	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public NonStringedInstrument(String name, String manufacturer, String use) {
		super(name, manufacturer);
		this.use = use;
	}
	
	public NonStringedInstrument() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NonStringedInstrument(String name, String manufacturer) {
		super(name, manufacturer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Name: " + name);
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Using: " + use);
	}
}
