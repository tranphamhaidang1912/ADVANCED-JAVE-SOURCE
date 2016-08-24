package TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import BackUp.Point;
import BackUp.Rectangle;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * UnitTest for Rectangle
 */
public class TestRectangle {

	Point A = new Point();
	Point C = new Point();
	Rectangle rectangle = new Rectangle();
	
	@Test
	public void testRectangle1() {
		A.setX(1);
		A.setY(2);
		C.setX(3);
		C.setY(4);
		rectangle.setA(A);
		rectangle.setC(C);
		double ac = rectangle.getPerimeterRectangle();
		assertEquals(8.0, ac, 0.01);
	}

	@Test
	public void testRectangle2() {
		A.setX(51);
		A.setY(62);
		C.setX(73);
		C.setY(84);
		rectangle.setA(A);
		rectangle.setC(C);
		double ac = rectangle.getPerimeterRectangle();
		assertEquals(88.0, ac, 0.01);
	}
	
	@Test
	public void testRectangle3() {
		A.setX(11);
		A.setY(14);
		C.setX(12);
		C.setY(13);
		rectangle.setA(A);
		rectangle.setC(C);
		double ac = rectangle.getPerimeterRectangle();
		assertEquals(4.0, ac, 0.01);
	}
	
	@Test
	public void testRectangle4() {
		A.setX(131);
		A.setY(144);
		C.setX(152);
		C.setY(163);
		rectangle.setA(A);
		rectangle.setC(C);
		double ac = rectangle.getPerimeterRectangle();
		assertEquals(80.0, ac, 0.01);
	}
	
	@Test
	public void testRectangle5() {
		A.setX(171);
		A.setY(183);
		C.setX(192);
		C.setY(204);
		rectangle.setA(A);
		rectangle.setC(C);
		double ac = rectangle.getPerimeterRectangle();
		assertEquals(84.0, ac, 0.01);
	}
	
	@Test
	public void testRectangle6() {
		A.setX(21);
		A.setY(22);
		C.setX(23);
		C.setY(24);
		rectangle.setA(A);
		rectangle.setC(C);
		double ac = rectangle.getPerimeterRectangle();
		assertNotEquals(6, ac, 0.01);
	}
	
	@Test
	public void testRectangle7() {
		A.setX(25);
		A.setY(26);
		C.setX(27);
		C.setY(28);
		rectangle.setA(A);
		rectangle.setC(C);
		double ac = rectangle.getPerimeterRectangle();
		assertNotEquals(7, ac, 0.01);
	}
	
	@Test
	public void testRectangle8() {
		A.setX(29);
		A.setY(30);
		C.setX(31);
		C.setY(32);
		rectangle.setA(A);
		rectangle.setC(C);
		double ac = rectangle.getPerimeterRectangle();
		assertNotEquals(9, ac, 0.01);
	}
	
	@Test
	public void testRectangle9() {
		A.setX(33);
		A.setY(34);
		C.setX(35);
		C.setY(36);
		rectangle.setA(A);
		rectangle.setC(C);
		double ac = rectangle.getPerimeterRectangle();
		assertNotEquals(9, ac, 0.01);
	}
	
	@Test
	public void testRectangle10() {
		A.setX(37);
		A.setY(38);
		C.setX(39);
		C.setY(40);
		rectangle.setA(A);
		rectangle.setC(C);
		double ac = rectangle.getPerimeterRectangle();
		assertNotEquals(10, ac, 0.01);
	}
}
