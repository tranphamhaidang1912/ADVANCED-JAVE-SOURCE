package ProxyImage;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 05-Sep-2016
 * Class for Proxy Image
 */
public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(realImage == null)
		{
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
	
}
