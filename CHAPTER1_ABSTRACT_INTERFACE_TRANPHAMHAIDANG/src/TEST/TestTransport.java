package TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import Transport.Car;
import Transport.Ship;

/*
 * Author: Tran Pham Hai Dang
 * Date: 23/08/2016
 * Version: 1.0
 * UnitTest for Transport
 */
public class TestTransport {

	Car car = new Car();
	Ship ship = new Ship();
	
	@Test
	public void testTransport1() {
		car.setDistance(100);
		car.setTime(10);
		car.setNumberLiterFuel(1);
		assertEquals(10.0, car.getSpeed(), 0);
		assertEquals(100.0, car.getFuelConsumption(), 0);
		ship.setDistance(100);
		ship.setTime(10);
		ship.setNumberLiterFuel(1);
		ship.setDownstreamSpeed(20);
		ship.setUpstreamSpeed(10);
		ship.setFuelConsumptionStart(0.1);
		assertEquals(20.0, ship.getSpeed(), 0);
		assertEquals(111.11111111111111, ship.getFuelConsumption(), 0);
	}
	
	@Test
	public void testTransport2() {
		car.setDistance(90);
		car.setTime(9);
		car.setNumberLiterFuel(2);
		assertEquals(10.0, car.getSpeed(), 0);
		assertEquals(45.0, car.getFuelConsumption(), 0);
		ship.setDistance(90);
		ship.setTime(9);
		ship.setNumberLiterFuel(2);
		ship.setDownstreamSpeed(30);
		ship.setUpstreamSpeed(10);
		ship.setFuelConsumptionStart(0.2);
		assertEquals(30.0, ship.getSpeed(), 0);
		assertEquals(50.0, ship.getFuelConsumption(), 0);
	}
	
	@Test
	public void testTransport3() {
		car.setDistance(80);
		car.setTime(8);
		car.setNumberLiterFuel(3);
		assertEquals(10.0, car.getSpeed(), 0);
		assertEquals(26.666666666666668, car.getFuelConsumption(), 0);
		ship.setDistance(80);
		ship.setTime(8);
		ship.setNumberLiterFuel(3);
		ship.setDownstreamSpeed(40);
		ship.setUpstreamSpeed(10);
		ship.setFuelConsumptionStart(0.3);
		assertEquals(40.0, ship.getSpeed(), 0);
		assertEquals(29.629629629629626, ship.getFuelConsumption(), 0);
	}
	
	@Test
	public void testTransport4() {
		car.setDistance(70);
		car.setTime(7);
		car.setNumberLiterFuel(4);
		assertEquals(10.0, car.getSpeed(), 0);
		assertEquals(17.5, car.getFuelConsumption(), 0);
		ship.setDistance(70);
		ship.setTime(7);
		ship.setNumberLiterFuel(4);
		ship.setDownstreamSpeed(50);
		ship.setUpstreamSpeed(10);
		ship.setFuelConsumptionStart(0.4);
		assertEquals(50.0, ship.getSpeed(), 0);
		assertEquals(19.444444444444443, ship.getFuelConsumption(), 0);
	}
	
	@Test
	public void testTransport5() {
		car.setDistance(60);
		car.setTime(6);
		car.setNumberLiterFuel(5);
		System.out.println(car.getSpeed());
		System.out.println(car.getFuelConsumption());
		assertEquals(10.0, car.getSpeed(), 0);
		assertEquals(12.0, car.getFuelConsumption(), 0);
		ship.setDistance(60);
		ship.setTime(6);
		ship.setNumberLiterFuel(5);
		ship.setDownstreamSpeed(60);
		ship.setUpstreamSpeed(10);
		ship.setFuelConsumptionStart(0.5);
		System.out.println(ship.getSpeed());
		System.out.println(ship.getFuelConsumption());
		assertEquals(60.0, ship.getSpeed(), 0);
		assertEquals(13.333333333333334, ship.getFuelConsumption(), 0);
	}
	
	@Test
	public void testTransport6() {
		car.setDistance(50);
		car.setTime(5);
		car.setNumberLiterFuel(6);
		assertNotEquals(11.0, car.getSpeed(), 0);
		assertNotEquals(100.0, car.getFuelConsumption(), 0);
		ship.setDistance(50);
		ship.setTime(5);
		ship.setNumberLiterFuel(6);
		ship.setDownstreamSpeed(70);
		ship.setUpstreamSpeed(10);
		ship.setFuelConsumptionStart(0.6);
		assertNotEquals(20.0, ship.getSpeed(), 0);
		assertNotEquals(111.11111111111111, ship.getFuelConsumption(), 0);
	}
	
	@Test
	public void testTransport7() {
		car.setDistance(40);
		car.setTime(4);
		car.setNumberLiterFuel(7);
		assertNotEquals(11.0, car.getSpeed(), 0);
		assertNotEquals(100.0, car.getFuelConsumption(), 0);
		ship.setDistance(40);
		ship.setTime(4);
		ship.setNumberLiterFuel(7);
		ship.setDownstreamSpeed(80);
		ship.setUpstreamSpeed(10);
		ship.setFuelConsumptionStart(0.7);
		assertNotEquals(20.0, ship.getSpeed(), 0);
		assertNotEquals(111.11111111111111, ship.getFuelConsumption(), 0);
	}
	
	@Test
	public void testTransport8() {
		car.setDistance(30);
		car.setTime(3);
		car.setNumberLiterFuel(8);
		assertNotEquals(11.0, car.getSpeed(), 0);
		assertNotEquals(100.0, car.getFuelConsumption(), 0);
		ship.setDistance(30);
		ship.setTime(3);
		ship.setNumberLiterFuel(8);
		ship.setDownstreamSpeed(90);
		ship.setUpstreamSpeed(10);
		ship.setFuelConsumptionStart(0.8);
		assertNotEquals(20.0, ship.getSpeed(), 0);
		assertNotEquals(111.11111111111111, ship.getFuelConsumption(), 0);
	}
	
	@Test
	public void testTransport9() {
		car.setDistance(20);
		car.setTime(2);
		car.setNumberLiterFuel(9);
		assertNotEquals(11.0, car.getSpeed(), 0);
		assertNotEquals(100.0, car.getFuelConsumption(), 0);
		ship.setDistance(20);
		ship.setTime(2);
		ship.setNumberLiterFuel(9);
		ship.setDownstreamSpeed(100);
		ship.setUpstreamSpeed(10);
		ship.setFuelConsumptionStart(0.9);
		assertNotEquals(20.0, ship.getSpeed(), 0);
		assertNotEquals(111.11111111111111, ship.getFuelConsumption(), 0);
	}
	
	@Test
	public void testTransport10() {
		car.setDistance(10);
		car.setTime(1);
		car.setNumberLiterFuel(10);
		assertNotEquals(11.0, car.getSpeed(), 0);
		assertNotEquals(100.0, car.getFuelConsumption(), 0);
		ship.setDistance(10);
		ship.setTime(1);
		ship.setNumberLiterFuel(110);
		ship.setDownstreamSpeed(10);
		ship.setUpstreamSpeed(10);
		ship.setFuelConsumptionStart(0.11);
		assertNotEquals(20.0, ship.getSpeed(), 0);
		assertNotEquals(111.11111111111111, ship.getFuelConsumption(), 0);
	}
}
