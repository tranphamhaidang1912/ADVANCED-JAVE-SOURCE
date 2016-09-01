package SewingCompany;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 01-Sep-2016 1:46:27 PM
 * Class for Choengsam Frock Factory
 */
public class ChoengsamFrockFactory implements Sewing {

	public ChoengsamFrockFactory(){

	}

	@Override
	public void sew() {
		// TODO Auto-generated method stub
		ChoengsamFrock choengsamFrock = new ChoengsamFrock();
		System.out.println("You are sewing CHOENGSAM FROCK");
	}
	
}