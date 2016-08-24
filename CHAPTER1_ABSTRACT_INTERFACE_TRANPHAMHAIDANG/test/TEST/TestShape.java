package TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import Shape.Circle;
import Shape.Rectangle;
import Shape.Square;

/*
 * Author: Tran Pham Hai Dang
 * Date: 23/08/2016
 * Version: 1.0
 * UnitTest for Shape
 */
public class TestShape {

	Circle circle = new Circle();
	Rectangle rectangle = new Rectangle();
	Square square = new Square();
	
	@Test
	public void testShap1() {
		circle.setR(1);
		assertEquals(6.283185307179586, circle.perimeter(), 0);
		assertEquals(3.141592653589793, circle.area(), 0);
		rectangle.setLength(1);
		rectangle.setWidth(2);
		assertEquals(6.0, rectangle.perimeter(), 0);
		assertEquals(2.0, rectangle.area(), 0);
		square.setEdge(1);
		assertEquals(4.0, square.perimeter(), 0);
		assertEquals(1.0, square.area(), 0);
	}

	@Test
	public void testShap2() {
		circle.setR(2);
		assertEquals(12.566370614359172, circle.perimeter(), 0);
		assertEquals(12.566370614359172, circle.area(), 0);
		rectangle.setLength(2);
		rectangle.setWidth(3);
		assertEquals(10.0, rectangle.perimeter(), 0);
		assertEquals(6.0, rectangle.area(), 0);
		square.setEdge(2);
		assertEquals(8.0, square.perimeter(), 0);
		assertEquals(4.0, square.area(), 0);
	}
	
	@Test
	public void testShap3() {
		circle.setR(3);
		assertEquals(18.84955592153876, circle.perimeter(), 0);
		assertEquals(28.274333882308138, circle.area(), 0);
		rectangle.setLength(3);
		rectangle.setWidth(4);
		assertEquals(14.0, rectangle.perimeter(), 0);
		assertEquals(12.0, rectangle.area(), 0);
		square.setEdge(3);
		assertEquals(12.0, square.perimeter(), 0);
		assertEquals(9.0, square.area(), 0);
	}
	
	@Test
	public void testShap4() {
		circle.setR(4);
		assertEquals(25.132741228718345, circle.perimeter(), 0);
		assertEquals(50.26548245743669, circle.area(), 0);
		rectangle.setLength(4);
		rectangle.setWidth(5);
		assertEquals(18.0, rectangle.perimeter(), 0);
		assertEquals(20.0, rectangle.area(), 0);
		square.setEdge(4);
		assertEquals(16.0, square.perimeter(), 0);
		assertEquals(16.0, square.area(), 0);
	}
	
	@Test
	public void testShap5() {
		circle.setR(5);
		assertEquals(31.41592653589793, circle.perimeter(), 0);
		assertEquals(78.53981633974483, circle.area(), 0);
		rectangle.setLength(5);
		rectangle.setWidth(6);
		assertEquals(22.0, rectangle.perimeter(), 0);
		assertEquals(30.0, rectangle.area(), 0);
		square.setEdge(5);
		assertEquals(20.0, square.perimeter(), 0);
		assertEquals(25.0, square.area(), 0);
	}
	
	@Test
	public void testShap6() {
		circle.setR(6);
		assertNotEquals(31.41592653589793, circle.perimeter(), 0);
		assertNotEquals(78.53981633974483, circle.area(), 0);
		rectangle.setLength(6);
		rectangle.setWidth(7);
		assertNotEquals(22.0, rectangle.perimeter(), 0);
		assertNotEquals(30.0, rectangle.area(), 0);
		square.setEdge(6);
		assertNotEquals(20.0, square.perimeter(), 0);
		assertNotEquals(25.0, square.area(), 0);
	}
	
	@Test
	public void testShap7() {
		circle.setR(7);
		assertNotEquals(25.132741228718345, circle.perimeter(), 0);
		assertNotEquals(50.26548245743669, circle.area(), 0);
		rectangle.setLength(7);
		rectangle.setWidth(8);
		assertNotEquals(18.0, rectangle.perimeter(), 0);
		assertNotEquals(20.0, rectangle.area(), 0);
		square.setEdge(7);
		assertNotEquals(16.0, square.perimeter(), 0);
		assertNotEquals(16.0, square.area(), 0);
	}
	
	@Test
	public void testShap8() {
		circle.setR(8);
		assertNotEquals(18.84955592153876, circle.perimeter(), 0);
		assertNotEquals(28.274333882308138, circle.area(), 0);
		rectangle.setLength(8);
		rectangle.setWidth(9);
		assertNotEquals(14.0, rectangle.perimeter(), 0);
		assertNotEquals(12.0, rectangle.area(), 0);
		square.setEdge(8);
		assertNotEquals(12.0, square.perimeter(), 0);
		assertNotEquals(9.0, square.area(), 0);
	}
	
	@Test
	public void testShap9() {
		circle.setR(9);
		assertNotEquals(12.566370614359172, circle.perimeter(), 0);
		assertNotEquals(12.566370614359172, circle.area(), 0);
		rectangle.setLength(9);
		rectangle.setWidth(10);
		assertNotEquals(10.0, rectangle.perimeter(), 0);
		assertNotEquals(6.0, rectangle.area(), 0);
		square.setEdge(9);
		assertNotEquals(8.0, square.perimeter(), 0);
		assertNotEquals(4.0, square.area(), 0);
	}
	
	@Test
	public void testShap10() {
		circle.setR(10);
		assertNotEquals(6.283185307179586, circle.perimeter(), 0);
		assertNotEquals(3.141592653589793, circle.area(), 0);
		rectangle.setLength(10);
		rectangle.setWidth(11);
		assertNotEquals(6.0, rectangle.perimeter(), 0);
		assertNotEquals(2.0, rectangle.area(), 0);
		square.setEdge(10);
		assertNotEquals(4.0, square.perimeter(), 0);
		assertNotEquals(1.0, square.area(), 0);
	}
}
