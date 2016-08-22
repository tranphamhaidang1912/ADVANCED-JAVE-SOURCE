package TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import Soldier.Infantryman;
import Soldier.Trooper;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * UnitTest for Soldier
 */
public class TestSoldier {

	Infantryman infantryman = new Infantryman();
	Trooper trooper = new Trooper();
	
	@Test
	public void testSoldier1() {
		infantryman.setPower(1);
		trooper.setPower(10);
		assertEquals(7, trooper.fight());
	}
	
	@Test
	public void testSoldier2() {
		infantryman.setPower(2);
		trooper.setPower(9);
		assertEquals(6, trooper.fight());
	}
	
	@Test
	public void testSoldier3() {
		infantryman.setPower(3);
		trooper.setPower(8);
		assertEquals(1, infantryman.fight());
	}
	
	@Test
	public void testSoldier4() {
		infantryman.setPower(4);
		trooper.setPower(7);
		assertEquals(4, trooper.fight());
	}
	
	@Test
	public void testSoldier5() {
		infantryman.setPower(5);
		trooper.setPower(6);
		assertEquals(3, infantryman.fight());
	}
	
	@Test
	public void testSoldier6() {
		infantryman.setPower(6);
		trooper.setPower(5);
		assertNotEquals(5, infantryman.fight());
	}
	
	@Test
	public void testSoldier7() {
		infantryman.setPower(7);
		trooper.setPower(4);
		assertNotEquals(6, infantryman.fight());
	}
	
	@Test
	public void testSoldier8() {
		infantryman.setPower(8);
		trooper.setPower(3);
		assertNotEquals(1, trooper.fight());
	}
	
	@Test
	public void testSoldier9() {
		infantryman.setPower(9);
		trooper.setPower(2);
		assertNotEquals(8, infantryman.fight());
	}
	
	@Test
	public void testSoldier10() {
		infantryman.setPower(10);
		trooper.setPower(1);
		assertNotEquals(0, trooper.fight());
	}
}
