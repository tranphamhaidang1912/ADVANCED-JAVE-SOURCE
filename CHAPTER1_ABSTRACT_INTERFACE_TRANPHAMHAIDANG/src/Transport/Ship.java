package Transport;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Ship
 */
public class Ship extends Transport implements ITransport {

	public double weight;
	public double capacity;
	public double downstreamSpeed;
	public double upstreamSpeed;
	public double fuelConsumptionStart;
	public String fuelType;
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getDownstreamSpeed() {
		return downstreamSpeed;
	}

	public void setDownstreamSpeed(double downstreamSpeed) {
		this.downstreamSpeed = downstreamSpeed;
	}

	public double getUpstreamSpeed() {
		return upstreamSpeed;
	}

	public void setUpstreamSpeed(double upstreamSpeed) {
		this.upstreamSpeed = upstreamSpeed;
	}

	public double getFuelConsumptionStart() {
		return fuelConsumptionStart;
	}

	public void setFuelConsumptionStart(double fuelConsumptionStart) {
		this.fuelConsumptionStart = fuelConsumptionStart;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public Ship(double distance, double time, double numberLiterFuel,
			String id, String owner, String color, String manufacturer,
			double weight, double capacity, double downstreamSpeed,
			double upstreamSpeed, double fuelConsumptionStart, String fuelType) {
		super(distance, time, numberLiterFuel, id, owner, color, manufacturer);
		this.weight = weight;
		this.capacity = capacity;
		this.downstreamSpeed = downstreamSpeed;
		this.upstreamSpeed = upstreamSpeed;
		this.fuelConsumptionStart = fuelConsumptionStart;
		this.fuelType = fuelType;
	}

	public Ship() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ship(double distance, double time, double numberLiterFuel,
			String id, String owner, String color, String manufacturer) {
		super(distance, time, numberLiterFuel, id, owner, color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	public Ship(double distance, double time, double numberLiterFuel) {
		super(distance, time, numberLiterFuel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return (distance / time) + (downstreamSpeed - upstreamSpeed);
	}

	@Override
	public double getFuelConsumption() {
		// TODO Auto-generated method stub
		return distance / (numberLiterFuel - fuelConsumptionStart);
		
	}

	@Override
	public void showInformationTransport() {
		// TODO Auto-generated method stub
		super.showInformationTransport();
		System.out.println("Weight: " + weight);
		System.out.println("Capacity: " + capacity);
		System.out.println("Downstream speed: " + downstreamSpeed);
		System.out.println("Upstream speed: " + upstreamSpeed);
		System.out.println("Fuel consumption start: " + fuelConsumptionStart);
		System.out.println("Fuel type: " + fuelType);
		System.out.println("Speed: " + getSpeed());
		System.out.println("Fuel consumption: " + getFuelConsumption());
	}
}
