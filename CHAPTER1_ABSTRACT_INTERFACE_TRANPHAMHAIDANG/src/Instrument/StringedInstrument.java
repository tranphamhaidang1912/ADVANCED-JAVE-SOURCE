package Instrument;

/*
 * Author: Tran Pham Hai Dang
 * Date: 23/08/2016
 * Version: 1.0
 * Class for Stringed Instrument
 */
public class StringedInstrument extends Instrument {

	public int numWire;
	
	public int getNumWire() {
		return numWire;
	}

	public void setNumWire(int numWire) {
		this.numWire = numWire;
	}

	public StringedInstrument(String name, String manufacturer, int numWire) {
		super(name, manufacturer);
		this.numWire = numWire;
	}

	public StringedInstrument() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StringedInstrument(String name, String manufacturer) {
		super(name, manufacturer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Name: " + name);
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Number of wire: " + numWire);
	}
}
