package SewingCompany;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 01-Sep-2016 1:46:27 PM
 * Class for Traditional Frock Factory
 */
public class TraditonalFrockFactory implements Sewing {
	
	public TraditonalFrockFactory(){

	}
	
	@Override
	public void sew() {
		// TODO Auto-generated method stub
		TraditionalFrock traditionalFrock = new TraditionalFrock();
		System.out.println("You are sewing TRADITIONAL FROCK");
	}

}