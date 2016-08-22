package TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import BackUp.Point;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * UnitTest for Point
 */
public class TestPoint {

	Point A = new Point();
	Point B = new Point();
	
	@Test
	public void testPoint1() {
		A.setX(1);
		A.setY(2);
		B.setX(3);
		B.setY(4);
		double ac = A.getDistanceBetweenTwoPoints(B);
		assertEquals(2.82, ac, 0.01);
	}

	@Test
	public void testPoint2() {
		A.setX(51);
		A.setY(62);
		B.setX(73);
		B.setY(84);
		double ac = A.getDistanceBetweenTwoPoints(B);
		assertEquals(31.11, ac, 0.01);
	}
	
	@Test
	public void testPoint3() {
		A.setX(11);
		A.setY(14);
		B.setX(12);
		B.setY(13);
		double ac = A.getDistanceBetweenTwoPoints(B);
		assertEquals(1.41, ac, 0.01);
	}
	
	@Test
	public void testPoint4() {
		A.setX(131);
		A.setY(144);
		B.setX(152);
		B.setY(163);
		double ac = A.getDistanceBetweenTwoPoints(B);
		assertEquals(28.31, ac, 0.01);
	}
	
	@Test
	public void testPoint5() {
		A.setX(171);
		A.setY(183);
		B.setX(192);
		B.setY(204);
		double ac = A.getDistanceBetweenTwoPoints(B);
		assertEquals(29.69, ac, 0.01);
	}
	
	@Test
	public void testPoint6() {
		A.setX(21);
		A.setY(22);
		B.setX(23);
		B.setY(24);
		double ac = A.getDistanceBetweenTwoPoints(B);
		assertNotEquals(6, ac, 0.01);
	}
	
	@Test
	public void testPoint7() {
		A.setX(25);
		A.setY(26);
		B.setX(27);
		B.setY(28);
		double ac = A.getDistanceBetweenTwoPoints(B);
		assertNotEquals(7, ac, 0.01);
	}
	
	@Test
	public void testPoint8() {
		A.setX(29);
		A.setY(30);
		B.setX(31);
		B.setY(32);
		double ac = A.getDistanceBetweenTwoPoints(B);
		assertNotEquals(8, ac, 0.01);
	}
	
	@Test
	public void testPoint9() {
		A.setX(33);
		A.setY(34);
		B.setX(35);
		B.setY(36);
		double ac = A.getDistanceBetweenTwoPoints(B);
		assertNotEquals(9, ac, 0.01);
	}
	
	@Test
	public void testPoint10() {
		A.setX(37);
		A.setY(38);
		B.setX(39);
		B.setY(40);
		double ac = A.getDistanceBetweenTwoPoints(B);
		assertNotEquals(10, ac, 0.01);
	}
}
