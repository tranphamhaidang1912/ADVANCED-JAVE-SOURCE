package Transport;

/*
 * Author: Tran Pham Hai Dang
 * Date: 23/08/2016
 * Version: 1.0
 * Class for Car
 */
public class Car extends Transport implements ITransport {

	public String gearType;
	public String carType;
	
	public String getGearType() {
		return gearType;
	}

	public void setGearType(String gearType) {
		this.gearType = gearType;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public Car(double distance, double time, double numberLiterFuel, String id,
			String owner, String color, String manufacturer, String gearType,
			String carType) {
		super(distance, time, numberLiterFuel, id, owner, color, manufacturer);
		this.gearType = gearType;
		this.carType = carType;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(double distance, double time, double numberLiterFuel, String id,
			String owner, String color, String manufacturer) {
		super(distance, time, numberLiterFuel, id, owner, color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	public Car(double distance, double time, double numberLiterFuel) {
		super(distance, time, numberLiterFuel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return distance / time;
	}

	@Override
	public double getFuelConsumption() {
		// TODO Auto-generated method stub
		return distance / numberLiterFuel;
	}

	@Override
	public void showInformationTransport() {
		// TODO Auto-generated method stub
		super.showInformationTransport();
		System.out.println("Gear type: " + gearType);
		System.out.println("Car type: " + carType);
		System.out.println("Speed: " + getSpeed());
		System.out.println("Fuel consumption: " + getFuelConsumption());
	}
}
