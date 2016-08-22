package TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import BackUp.Employee;
import Employee.BusinessEmployee;
import Employee.ProduceEmployee;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * UnitTest for Employee
 */
public class TestEmployee {

	ProduceEmployee produceEmployee = new ProduceEmployee();
	BusinessEmployee businessEmployee = new BusinessEmployee();
	
	@Test
	public void testEmployee1() {
		produceEmployee.setWage(2.1);
		produceEmployee.setAmountReducePerson(1);
		produceEmployee.setNumberProduct(1100);
		assertEquals(2646005.0, produceEmployee.getIncome(), 0);
		assertEquals(-9953995.0, produceEmployee.getTaxIncome(), 0);
		assertEquals(-497699.75, produceEmployee.getPersonalIncomeTax(), 0);
		assertEquals(3143704.75, produceEmployee.getRealIncome(), 0);
	}

	@Test
	public void testEmployee2() {
		produceEmployee.setWage(2.2);
		produceEmployee.setAmountReducePerson(2);
		produceEmployee.setNumberProduct(1200);
		assertEquals(2772010.0, produceEmployee.getIncome(), 0);
		assertEquals(-1.342799E7, produceEmployee.getTaxIncome(), 0);
		assertEquals(-671399.5, produceEmployee.getPersonalIncomeTax(), 0);
		assertEquals(3443409.5, produceEmployee.getRealIncome(), 0);
	}
	
	@Test
	public void testEmployee3() {
		produceEmployee.setWage(2.3);
		produceEmployee.setAmountReducePerson(3);
		produceEmployee.setNumberProduct(1300);
		assertEquals(2898015.0, produceEmployee.getIncome(), 0);
		assertEquals(-1.6901985E7, produceEmployee.getTaxIncome(), 0);
		assertEquals(-845099.25, produceEmployee.getPersonalIncomeTax(), 0);
		assertEquals(3743114.25, produceEmployee.getRealIncome(), 0);
	}
	
	@Test
	public void testEmployee4() {
		businessEmployee.setWage(2.4);
		businessEmployee.setAmountReducePerson(4);
		businessEmployee.setBusinessSalary(4000000);
		businessEmployee.setBusinessSalaryScale(0.04);
		assertEquals(3184000.0, businessEmployee.getIncome(), 0);
		assertEquals(-2.0216E7, businessEmployee.getTaxIncome(), 0);
		assertEquals(-1010800.0, businessEmployee.getPersonalIncomeTax(), 0);
		assertEquals(4194800.0, businessEmployee.getRealIncome(), 0);
	}
	
	@Test
	public void testEmployee5() {
		businessEmployee.setWage(2.5);
		businessEmployee.setAmountReducePerson(5);
		businessEmployee.setBusinessSalary(5000000);
		businessEmployee.setBusinessSalaryScale(0.05);
		assertEquals(3400000.0, businessEmployee.getIncome(), 0);
		assertEquals(-2.36E7, businessEmployee.getTaxIncome(), 0);
		assertEquals(-1180000.0, businessEmployee.getPersonalIncomeTax(), 0);
		assertEquals(4580000.0, businessEmployee.getRealIncome(), 0);
	}
	
	@Test
	public void testEmployee6() {
		produceEmployee.setWage(2.6);
		produceEmployee.setAmountReducePerson(6);
		produceEmployee.setNumberProduct(1600);
		assertNotEquals(2646005.0, produceEmployee.getIncome(), 0);
		assertNotEquals(-9953995.0, produceEmployee.getTaxIncome(), 0);
		assertNotEquals(-497699.75, produceEmployee.getPersonalIncomeTax(), 0);
		assertNotEquals(3143704.75, produceEmployee.getRealIncome(), 0);
	}
	
	@Test
	public void testEmployee7() {
		produceEmployee.setWage(2.7);
		produceEmployee.setAmountReducePerson(7);
		produceEmployee.setNumberProduct(1700);
		assertNotEquals(2772010.0, produceEmployee.getIncome(), 0);
		assertNotEquals(-1.342799E7, produceEmployee.getTaxIncome(), 0);
		assertNotEquals(-671399.5, produceEmployee.getPersonalIncomeTax(), 0);
		assertNotEquals(3443409.5, produceEmployee.getRealIncome(), 0);
	}
	
	@Test
	public void testEmployee8() {
		produceEmployee.setWage(2.8);
		produceEmployee.setAmountReducePerson(8);
		produceEmployee.setNumberProduct(1800);
		assertNotEquals(2898015.0, produceEmployee.getIncome(), 0);
		assertNotEquals(-1.6901985E7, produceEmployee.getTaxIncome(), 0);
		assertNotEquals(-845099.25, produceEmployee.getPersonalIncomeTax(), 0);
		assertNotEquals(3743114.25, produceEmployee.getRealIncome(), 0);
	}
	
	@Test
	public void testEmployee9() {
		businessEmployee.setWage(2.9);
		businessEmployee.setAmountReducePerson(9);
		businessEmployee.setBusinessSalary(9000000);
		businessEmployee.setBusinessSalaryScale(0.09);
		assertNotEquals(3184000.0, businessEmployee.getIncome(), 0);
		assertNotEquals(-2.0216E7, businessEmployee.getTaxIncome(), 0);
		assertNotEquals(-1010800.0, businessEmployee.getPersonalIncomeTax(), 0);
		assertNotEquals(4194800.0, businessEmployee.getRealIncome(), 0);
	}
	
	@Test
	public void testEmployee10() {
		businessEmployee.setWage(2.11);
		businessEmployee.setAmountReducePerson(11);
		businessEmployee.setBusinessSalary(11000000);
		businessEmployee.setBusinessSalaryScale(0.011);
		assertNotEquals(3400000.0, businessEmployee.getIncome(), 0);
		assertNotEquals(-2.36E7, businessEmployee.getTaxIncome(), 0);
		assertNotEquals(-1180000.0, businessEmployee.getPersonalIncomeTax(), 0);
		assertNotEquals(4580000.0, businessEmployee.getRealIncome(), 0);
	}
}
