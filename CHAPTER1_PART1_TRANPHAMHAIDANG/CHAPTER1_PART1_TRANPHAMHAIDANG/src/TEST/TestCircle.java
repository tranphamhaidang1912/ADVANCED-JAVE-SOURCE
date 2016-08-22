package TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import BackUp.Circle;
import BackUp.Point;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * UnitTest for Circle
 */
public class TestCircle {

	Point O = new Point();
	Point R = new Point();
	Circle circle = new Circle();
	
	@Test
	public void testCircle1() {
		O.setX(1);
		O.setY(2);
		R.setX(3);
		R.setY(4);
		circle.setO(O);
		circle.setR(R);
		double ac = circle.getPerimeterCircle();
		assertEquals(17.76, ac, 0.01);
	}

	@Test
	public void testCircle2() {
		O.setX(51);
		O.setY(62);
		R.setX(73);
		R.setY(84);
		circle.setO(O);
		circle.setR(R);
		double ac = circle.getPerimeterCircle();
		assertEquals(195.38, ac, 0.01);
	}
	
	@Test
	public void testCircle3() {
		O.setX(11);
		O.setY(14);
		R.setX(12);
		R.setY(13);
		circle.setO(O);
		circle.setR(R);
		double ac = circle.getPerimeterCircle();
		assertEquals(8.88, ac, 0.01);
	}
	
	@Test
	public void testCircle4() {
		O.setX(131);
		O.setY(144);
		R.setX(152);
		R.setY(163);
		circle.setO(O);
		circle.setR(R);
		double ac = circle.getPerimeterCircle();
		assertEquals(177.84, ac, 0.01);
	}
	
	@Test
	public void testCircle5() {
		O.setX(171);
		O.setY(183);
		R.setX(192);
		R.setY(204);
		circle.setO(O);
		circle.setR(R);
		double ac = circle.getPerimeterCircle();
		assertEquals(186.50, ac, 0.01);
	}
	
	@Test
	public void testCircle6() {
		O.setX(21);
		O.setY(22);
		R.setX(23);
		R.setY(24);
		circle.setO(O);
		circle.setR(R);
		double ac = circle.getPerimeterCircle();
		assertNotEquals(6, ac, 0.01);
	}
	
	@Test
	public void testCircle7() {
		O.setX(25);
		O.setY(26);
		R.setX(27);
		R.setY(28);
		circle.setO(O);
		circle.setR(R);
		double ac = circle.getPerimeterCircle();
		assertNotEquals(7, ac, 0.01);
	}
	
	@Test
	public void testCircle8() {
		O.setX(29);
		O.setY(30);
		R.setX(31);
		R.setY(32);
		circle.setO(O);
		circle.setR(R);
		double ac = circle.getPerimeterCircle();
		assertNotEquals(8, ac, 0.01);
	}
	
	@Test
	public void testCircle9() {
		O.setX(33);
		O.setY(34);
		R.setX(35);
		R.setY(36);
		circle.setO(O);
		circle.setR(R);
		double ac = circle.getPerimeterCircle();
		assertNotEquals(9, ac, 0.01);
	}
	
	@Test
	public void testCircle10() {
		O.setX(37);
		O.setY(38);
		R.setX(39);
		R.setY(40);
		circle.setO(O);
		circle.setR(R);
		double ac = circle.getPerimeterCircle();
		assertNotEquals(10, ac, 0.01);
	}
}
