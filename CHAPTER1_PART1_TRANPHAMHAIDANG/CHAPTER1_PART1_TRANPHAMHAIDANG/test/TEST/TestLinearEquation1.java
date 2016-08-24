package TEST;

import static org.junit.Assert.*;
import BackUp.LinearEquation1;

import org.junit.Test;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * UnitTest for Linear Equation 1
 */
public class TestLinearEquation1 {
	
	LinearEquation1 linearQuation1 = new LinearEquation1() ;
	
	@Test
	public void testLinearEquation1_1() {
		linearQuation1.setA(2);
		linearQuation1.setB(4);
		double[] ac = linearQuation1.findRootLinearEquation1();
		assertEquals(-2, ac[2], 0);
	}

	@Test
	public void testLinearEquation1_2() {
		linearQuation1.setA(4);
		linearQuation1.setB(10);
		double[] ac = linearQuation1.findRootLinearEquation1();
		assertEquals(-2.5, ac[2], 0);
	}
	
	@Test
	public void testLinearEquation1_3() {
		linearQuation1.setA(0);
		linearQuation1.setB(5);
		double[] ac = linearQuation1.findRootLinearEquation1();
		assertEquals(0, ac[0], 0);
	}
	
	@Test
	public void testLinearEquation1_4() {
		linearQuation1.setA(0);
		linearQuation1.setB(0);
		double[] ac = linearQuation1.findRootLinearEquation1();
		assertEquals(1, ac[0], 0);
	}
	
	@Test
	public void testLinearEquation1_5() {
		linearQuation1.setA(10);
		linearQuation1.setB(10);
		double[] ac = linearQuation1.findRootLinearEquation1();
		assertEquals(-1, ac[2], 0);
	}
	
	@Test
	public void testLinearEquation1_6() {
		linearQuation1.setA(2);
		linearQuation1.setB(4);
		double[] ac = linearQuation1.findRootLinearEquation1();
		assertNotEquals(-1, ac[2], 0);
	}
	
	@Test
	public void testLinearEquation1_7() {
		linearQuation1.setA(4);
		linearQuation1.setB(10);
		double[] ac = linearQuation1.findRootLinearEquation1();
		assertNotEquals(3.5, ac[2], 0);
	}
	
	@Test
	public void testLinearEquation1_8() {
		linearQuation1.setA(0);
		linearQuation1.setB(5);
		double[] ac = linearQuation1.findRootLinearEquation1();
		assertNotEquals(1, ac[0], 0);
	}
	
	@Test
	public void testLinearEquation1_9() {
		linearQuation1.setA(0);
		linearQuation1.setB(0);
		double[] ac = linearQuation1.findRootLinearEquation1();
		assertNotEquals(0, ac[0], 0);
	}
	
	@Test
	public void testLinearEquation1_10() {
		linearQuation1.setA(10);
		linearQuation1.setB(10);
		double[] ac = linearQuation1.findRootLinearEquation1();
		assertNotEquals(2, ac[2], 0);
	}
}
