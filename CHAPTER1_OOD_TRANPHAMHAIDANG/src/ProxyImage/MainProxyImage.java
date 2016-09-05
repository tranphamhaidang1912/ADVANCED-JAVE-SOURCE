package ProxyImage;

public class MainProxyImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Image image = new ProxyImage("image.jpg");
			image.display();
			System.out.println("");
			image.display();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
