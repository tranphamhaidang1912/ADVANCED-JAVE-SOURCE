package TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import CHAPTER1_PART1_TRANPHAMHAIDANG.Employee;

public class TestEmployee {

	Employee employee = new Employee();
	
	@Test
	public void testEmployee1() {
		employee.setWage(2.1);
		employee.setAmountReducePerson(1);
		employee.setAllowance(10000000);
		assertEquals(12646000, employee.getIncome(), 0);
		assertEquals(46000, employee.getTaxIncome(), 0);
		assertEquals(2300, employee.getPersonalIncomeTax(), 0);
		assertEquals(12643700, employee.getRealIncome(), 0);
	}

	@Test
	public void testEmployee2() {
		employee.setWage(2.2);
		employee.setAmountReducePerson(2);
		employee.setAllowance(20000000);
		assertEquals(22772000, employee.getIncome(), 0);
		assertEquals(6572000, employee.getTaxIncome(), 0);
		assertEquals(407200, employee.getPersonalIncomeTax(), 0);
		assertEquals(22364800, employee.getRealIncome(), 0);
	}
	
	@Test
	public void testEmployee3() {
		employee.setWage(2.3);
		employee.setAmountReducePerson(3);
		employee.setAllowance(30000000);
		assertEquals(32898000, employee.getIncome(), 0);
		assertEquals(13098000, employee.getTaxIncome(), 0);
		assertEquals(1214700, employee.getPersonalIncomeTax(), 0);
		assertEquals(31683300, employee.getRealIncome(), 0);
	}
	
	@Test
	public void testEmployee4() {
		employee.setWage(2.4);
		employee.setAmountReducePerson(4);
		employee.setAllowance(40000000);
		assertEquals(43024000, employee.getIncome(), 0);
		assertEquals(19624000, employee.getTaxIncome(), 0);
		assertEquals(2274800, employee.getPersonalIncomeTax(), 0);
		assertEquals(40749200, employee.getRealIncome(), 0);
	}
	
	@Test
	public void testEmployee5() {
		employee.setWage(2.5);
		employee.setAmountReducePerson(5);
		employee.setAllowance(50000000);
		assertEquals(53150000, employee.getIncome(), 0);
		assertEquals(26150000, employee.getTaxIncome(), 0);
		assertEquals(3580000, employee.getPersonalIncomeTax(), 0);
		assertEquals(49570000, employee.getRealIncome(), 0);
	}
	
	@Test
	public void testEmployee6() {
		employee.setWage(2.6);
		employee.setAmountReducePerson(6);
		employee.setAllowance(60000000);
		assertNotEquals(12646000, employee.getIncome(), 0);
		assertNotEquals(46000, employee.getTaxIncome(), 0);
		assertNotEquals(2300, employee.getPersonalIncomeTax(), 0);
		assertNotEquals(12643700, employee.getRealIncome(), 0);
	}
	
	@Test
	public void testEmployee7() {
		employee.setWage(2.7);
		employee.setAmountReducePerson(7);
		employee.setAllowance(70000000);
		assertNotEquals(12646000, employee.getIncome(), 0);
		assertNotEquals(46000, employee.getTaxIncome(), 0);
		assertNotEquals(2300, employee.getPersonalIncomeTax(), 0);
		assertNotEquals(12643700, employee.getRealIncome(), 0);
	}
	
	@Test
	public void testEmployee8() {
		employee.setWage(2.8);
		employee.setAmountReducePerson(8);
		employee.setAllowance(80000000);
		assertNotEquals(12646000, employee.getIncome(), 0);
		assertNotEquals(46000, employee.getTaxIncome(), 0);
		assertNotEquals(2300, employee.getPersonalIncomeTax(), 0);
		assertNotEquals(12643700, employee.getRealIncome(), 0);
	}
	
	@Test
	public void testEmployee9() {
		employee.setWage(2.9);
		employee.setAmountReducePerson(9);
		employee.setAllowance(90000000);
		assertNotEquals(12646000, employee.getIncome(), 0);
		assertNotEquals(46000, employee.getTaxIncome(), 0);
		assertNotEquals(2300, employee.getPersonalIncomeTax(), 0);
		assertNotEquals(12643700, employee.getRealIncome(), 0);
	}
	
	@Test
	public void testEmployee10() {
		employee.setWage(3);
		employee.setAmountReducePerson(10);
		employee.setAllowance(100000000);
		assertNotEquals(12646000, employee.getIncome(), 0);
		assertNotEquals(46000, employee.getTaxIncome(), 0);
		assertNotEquals(2300, employee.getPersonalIncomeTax(), 0);
		assertNotEquals(12643700, employee.getRealIncome(), 0);
	}
}
