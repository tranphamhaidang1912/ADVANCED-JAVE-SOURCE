package TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import STREAM.ManageEmployee;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 20-Sep-2016 UnitTest for Stream
 */
public class TestStream {

	ManageEmployee manageEmployee = new ManageEmployee();
	
	@Test
	public void testStream1() {
		manageEmployee.createList();
		manageEmployee.createStatsAge();
		assertEquals(19.8, manageEmployee.getAverageAge(), 0);
	}

	@Test
	public void testStream2() {
		manageEmployee.createList();
		manageEmployee.createStatsSalary();
		assertEquals(9000000.0, manageEmployee.getMaxSalary(), 0);
	}
	
	@Test
	public void testStream3() {
		manageEmployee.createList();
		manageEmployee.createStatsSalary();
		assertEquals(1000000.0, manageEmployee.getMinSalary(), 0);
	}
	
	@Test
	public void testStream4() {
		manageEmployee.createList();
		manageEmployee.createStatsSalary();
		assertEquals(4866666.666666667, manageEmployee.getAverageSalary(), 0);
	}
	
	@Test
	public void testStream5() {
		manageEmployee.createList();
		manageEmployee.createStatsAge();
		assertNotEquals(20.1, manageEmployee.getAverageAge(), 0);
	}
	
	@Test
	public void testStream6() {
		manageEmployee.createList();
		manageEmployee.createStatsAge();
		assertNotEquals(19.5, manageEmployee.getAverageAge(), 0);
	}
	
	@Test
	public void testStream7() {
		manageEmployee.createList();
		manageEmployee.createStatsSalary();
		assertNotEquals(1000000, manageEmployee.getMaxSalary(), 0);
	}
	
	@Test
	public void testStream8() {
		manageEmployee.createList();
		manageEmployee.createStatsSalary();
		assertNotEquals(8900000, manageEmployee.getMinSalary(), 0);
	}
	
	@Test
	public void testStream9() {
		manageEmployee.createList();
		manageEmployee.createStatsSalary();
		assertNotEquals(5000000, manageEmployee.getAverageSalary(), 0);
	}
	
	@Test
	public void testStream10() {
		manageEmployee.createList();
		manageEmployee.createStatsAge();
		assertNotEquals(20.5, manageEmployee.getAverageAge(), 0);
	}
	
}
