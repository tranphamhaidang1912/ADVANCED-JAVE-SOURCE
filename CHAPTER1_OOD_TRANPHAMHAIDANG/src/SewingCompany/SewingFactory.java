package SewingCompany;

public class SewingFactory {

	TraditonalFrockFactory traditionalFactory = new TraditonalFrockFactory();
	StylizedFrockFactory stylizedFrockFactory = new StylizedFrockFactory();
	ChoengsamFrockFactory choengsamFrockFactory = new ChoengsamFrockFactory();
	
	public Sewing getSewing(String frockType) {
		if(frockType == null)
			return null;
		if(frockType.equalsIgnoreCase("TRADITIONAL"))
			return traditionalFactory;
		else if(frockType.equalsIgnoreCase("STYLIZED"))
			return stylizedFrockFactory;
		else if(frockType.equalsIgnoreCase("CHOENGSAM"))
			return choengsamFrockFactory;
		return null;
	}
}
