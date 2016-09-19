package STREAM;

import java.io.Serializable;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 19-Sep-2016 Class for CD
 */
public class CD implements Comparable<CD>, Serializable {

	private int id;
	private String name;
	private String singer;
	private int numberSongs;
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumberSongs() {
		return numberSongs;
	}

	public void setNumberSongs(int numberSongs) {
		this.numberSongs = numberSongs;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public CD(String name, String singer, int numberSongs, double price) {
		super();
		this.name = name;
		this.singer = singer;
		this.numberSongs = numberSongs;
		this.price = price;
	}

	public CD(String name) {
		super();
		this.name = name;
	}

	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Show CD's information
	public void showInformation() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Singer: " + singer);
		System.out.println("Number of songs: " + numberSongs);
		System.out.println("Price: " + price);
	}

	@Override
	public int compareTo(CD o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

	@Override
	public boolean equals(Object o) {
		CD cd = (CD) o;
		return this.name.equalsIgnoreCase(cd.name);
	}

}
