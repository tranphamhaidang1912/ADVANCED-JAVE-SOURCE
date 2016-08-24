package TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import BackUp.Operator;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * UnitTest for Operator
 */
public class TestOperator {

	Operator operator = new Operator();
	
	@Test
	public void testOperator1() {
		operator.setFirstNumber(1);
		operator.setSecondNumber(2);
		double ac = operator.add();
		assertEquals(3, ac, 0);
	}

	@Test
	public void testOperator2() {
		operator.setFirstNumber(3);
		operator.setSecondNumber(4);
		double ac = operator.sub();
		assertEquals(-1, ac, 0);
	}
	
	@Test
	public void testOperator3() {
		operator.setFirstNumber(5);
		operator.setSecondNumber(6);
		double ac = operator.mul();
		assertEquals(30, ac, 0);
	}
	
	@Test
	public void testOperator4() {
		operator.setFirstNumber(10);
		operator.setSecondNumber(5);
		double ac = operator.dev();
		assertEquals(2, ac, 0);
	}
	
	@Test
	public void testOperator5() {
		operator.setFirstNumber(7);
		operator.setSecondNumber(8);
		double ac = operator.add();
		assertEquals(15, ac, 0);
	}
	
	@Test
	public void testOperator6() {
		operator.setFirstNumber(1);
		operator.setSecondNumber(2);
		double ac = operator.add();
		assertNotEquals(4, ac, 0);
	}
	
	@Test
	public void testOperator7() {
		operator.setFirstNumber(3);
		operator.setSecondNumber(4);
		double ac = operator.sub();
		assertNotEquals(0, ac, 0);
	}
	
	@Test
	public void testOperator8() {
		operator.setFirstNumber(5);
		operator.setSecondNumber(6);
		double ac = operator.mul();
		assertNotEquals(31, ac, 0);
	}
	
	@Test
	public void testOperator9() {
		operator.setFirstNumber(10);
		operator.setSecondNumber(5);
		double ac = operator.dev();
		assertNotEquals(3, ac, 0);
	}
	
	@Test
	public void testOperator10() {
		operator.setFirstNumber(7);
		operator.setSecondNumber(8);
		double ac = operator.add();
		assertNotEquals(16, ac, 0);
	}
}
