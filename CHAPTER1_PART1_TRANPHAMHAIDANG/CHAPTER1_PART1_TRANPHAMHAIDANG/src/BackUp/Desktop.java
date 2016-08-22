package BackUp;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Desktop
 */
public class Desktop extends Computer {

	String CPU;
	String RAM;
	
	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public Desktop(String id, double price, String manufacturer, int number,
			String cPU, String rAM) {
		super(id, price, manufacturer, number);
		CPU = cPU;
		RAM = rAM;
	}
	
	public Desktop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Desktop(String id, double price, String manufacturer, int number) {
		super(id, price, manufacturer, number);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showInformationComputer() {
		// TODO Auto-generated method stub
		super.showInformationComputer();
		System.out.println("CPU: " + CPU);
		System.out.println("RAM: " + RAM);
		System.out.println("Total price: " + String.format("%.0f", totalPrice()));
	}
}
