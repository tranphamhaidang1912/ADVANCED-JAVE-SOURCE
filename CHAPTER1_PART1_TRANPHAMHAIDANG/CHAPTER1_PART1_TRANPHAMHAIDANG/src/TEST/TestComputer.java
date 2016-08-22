package TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import Computer.Computer;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * UnitTest for Computer
 */
public class TestComputer {

	Computer computer = new Computer();
	
	@Test
	public void testComputer1() {
		computer.setNumber(1);
		computer.setPrice(10000000);
		assertEquals(10000000, computer.getTotalPrice(), 0);
	}

	@Test
	public void testComputer2() {
		computer.setNumber(2);
		computer.setPrice(20000000);
		assertEquals(40000000, computer.getTotalPrice(), 0);
	}
	
	@Test
	public void testComputer3() {
		computer.setNumber(3);
		computer.setPrice(30000000);
		assertEquals(90000000, computer.getTotalPrice(), 0);
	}
	
	@Test
	public void testComputer4() {
		computer.setNumber(4);
		computer.setPrice(40000000);
		assertEquals(160000000, computer.getTotalPrice(), 0);
	}
	
	@Test
	public void testComputer5() {
		computer.setNumber(5);
		computer.setPrice(50000000);
		assertEquals(250000000, computer.getTotalPrice(), 0);
	}
	
	@Test
	public void testComputer6() {
		computer.setNumber(6);
		computer.setPrice(60000000);
		assertNotEquals(60000000, computer.getTotalPrice(), 0);
	}
	
	@Test
	public void testComputer7() {
		computer.setNumber(7);
		computer.setPrice(70000000);
		assertNotEquals(70000000, computer.getTotalPrice(), 0);
	}
	
	@Test
	public void testComputer8() {
		computer.setNumber(8);
		computer.setPrice(80000000);
		assertNotEquals(80000000, computer.getTotalPrice(), 0);
	}
	
	@Test
	public void testComputer9() {
		computer.setNumber(9);
		computer.setPrice(90000000);
		assertNotEquals(90000000, computer.getTotalPrice(), 0);
	}
	
	@Test
	public void testComputer10() {
		computer.setNumber(10);
		computer.setPrice(100000000);
		assertNotEquals(10000000, computer.getTotalPrice(), 0);
	}
}
