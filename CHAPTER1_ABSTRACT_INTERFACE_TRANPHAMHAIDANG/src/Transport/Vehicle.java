package Transport;

/*
 * Author: Tran Pham Hai Dang
 * Date: 23/08/2016
 * Version: 1.0
 * Abstract class for Vehicle
 */
public abstract class Vehicle {

	public double distance;
	public double time;
	public double numberLiterFuel;

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public double getNumberLiterFuel() {
		return numberLiterFuel;
	}

	public void setNumberLiterFuel(double numberLiterFuel) {
		this.numberLiterFuel = numberLiterFuel;
	}

	public Vehicle(double distance, double time, double numberLiterFuel) {
		super();
		this.distance = distance;
		this.time = time;
		this.numberLiterFuel = numberLiterFuel;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
}
