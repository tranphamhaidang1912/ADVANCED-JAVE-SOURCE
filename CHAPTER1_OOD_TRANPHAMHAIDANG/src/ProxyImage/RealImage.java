package ProxyImage;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 05-Sep-2016
 * Class for Real Image
 */
public class RealImage implements Image {

	private String fileName;
	
	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
		loadFromDisk(fileName);
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying: " + fileName);
		
	}
	
	private void loadFromDisk(String fileName) {
		System.out.println("Loading: " + fileName);
	}
}
