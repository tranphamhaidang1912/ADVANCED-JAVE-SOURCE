package CD;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for CD
 */
public class CD {

	private String id;
	private String name;
	private String singer;
	private int numOfSongs;
	private double price;

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

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumOfSongs() {
		return numOfSongs;
	}

	public void setNumOfSongs(int numOfSongs) {
		this.numOfSongs = numOfSongs;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public CD(String id, String name, String singer, int numOfSongs, double price) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.numOfSongs = numOfSongs;
		this.price = price;
	}

	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Print information of CD
	public void printCD() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Singer: " + singer);
		System.out.println("Number Of Songs: " + numOfSongs);
		System.out.println("Price: " + price);
	}
}
