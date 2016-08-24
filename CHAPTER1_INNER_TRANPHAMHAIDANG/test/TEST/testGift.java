package TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import Gift.GiftBox;
import Gift.GiftBox.Gift;

/*
 * Author: Tran Pham Hai Dang
 * Date: 24/08/2016
 * Version: 1.0
 * UnitTest for Gift
 */
public class testGift {

	GiftBox.Gift gift = new GiftBox().new Gift();
	
	@Test
	public void testGift1() {
		gift.setWeight(1);
		assertEquals(10200, gift.calFee(), 0);
	}

	@Test
	public void testGift2() {
		gift.setWeight(2);
		assertEquals(10400, gift.calFee(), 0);
	}
	
	@Test
	public void testGift3() {
		gift.setWeight(3);
		assertEquals(10600, gift.calFee(), 0);
	}
	
	@Test
	public void testGift4() {
		gift.setWeight(4);
		assertEquals(10800, gift.calFee(), 0);
	}
	
	@Test
	public void testGift5() {
		gift.setWeight(5);
		assertEquals(11000, gift.calFee(), 0);
	}
	
	@Test
	public void testGift6() {
		gift.setWeight(6);
		assertNotEquals(10600, gift.calFee(), 0);
	}
	
	@Test
	public void testGift7() {
		gift.setWeight(7);
		assertNotEquals(10700, gift.calFee(), 0);
	}
	
	@Test
	public void testGift8() {
		gift.setWeight(8);
		assertNotEquals(10800, gift.calFee(), 0);
	}
	
	@Test
	public void testGift9() {
		gift.setWeight(9);
		assertNotEquals(10900, gift.calFee(), 0);
	}
	
	@Test
	public void testGift10() {
		gift.setWeight(10);
		assertNotEquals(11000, gift.calFee(), 0);
	}
}
