package SewingCompany;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 01-Sep-2016 1:46:27 PM
 * Class for Stylized Frock Factory
 */
public class StylizedFrockFactory implements Sewing {
	
	public StylizedFrockFactory(){

	}

	@Override
	public void sew() {
		// TODO Auto-generated method stub
		StylizedFrock stylizedFrock = new StylizedFrock();
		System.out.println("You are sewing STYLIZED FROCK");
	}

}