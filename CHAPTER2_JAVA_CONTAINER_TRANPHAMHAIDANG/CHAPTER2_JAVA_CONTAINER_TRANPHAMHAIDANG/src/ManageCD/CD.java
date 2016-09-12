package ManageCD;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 07-Sep-2016
 * Class for CD
 */
public class CD implements Comparable<CD> {

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

	public CD(String id, String name, String singer, int numOfSongs,
			double price) {
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
	
	//Show CD's information
	public void showInformation() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Singer: " + singer);
		System.out.println("Number of songs: " + numOfSongs);
		System.out.println("Price: " + price);
	}

	@Override
	public int compareTo(CD o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}
