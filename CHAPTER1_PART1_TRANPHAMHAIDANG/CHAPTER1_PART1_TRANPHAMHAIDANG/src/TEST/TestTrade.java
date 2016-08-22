package TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import Trade.GoldTrade;
import Trade.MoneyTrade;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * UnitTest for Trade
 */
public class TestTrade {

	GoldTrade goldTrade = new GoldTrade();
	MoneyTrade moneyTrade = new MoneyTrade();
	
	@Test
	public void testTrade1() {
		goldTrade.setGoldType("10K");
		goldTrade.setNumber(1);
		assertEquals(1.3889E7, goldTrade.getTotalPrice(), 0);
		moneyTrade.setMoneyType("USD");
		moneyTrade.setTradeType("mua");
		moneyTrade.setNumber(1);
		assertEquals(22260.0, moneyTrade.getTotalPrice(), 0);
	}

	@Test
	public void testTrade2() {
		goldTrade.setGoldType("14K");
		goldTrade.setNumber(2);
		assertEquals(3.983E7, goldTrade.getTotalPrice(), 0);
		moneyTrade.setMoneyType("EUR");
		moneyTrade.setTradeType("ban");
		moneyTrade.setNumber(2);
		assertEquals(50002.512559999996, moneyTrade.getTotalPrice(), 0);
	}
	
	@Test
	public void testTrade3() {
		goldTrade.setGoldType("18K");
		goldTrade.setNumber(3);
		assertEquals(7.7934E7, goldTrade.getTotalPrice(), 0);
		moneyTrade.setMoneyType("AUD");
		moneyTrade.setTradeType("mua");
		moneyTrade.setNumber(3);
		assertEquals(50241.39, moneyTrade.getTotalPrice(), 0);
	}
	
	@Test
	public void testTrade4() {
		goldTrade.setGoldType("24K");
		goldTrade.setNumber(4);
		assertEquals(1.40564E8, goldTrade.getTotalPrice(), 0);
		moneyTrade.setMoneyType("USD");
		moneyTrade.setTradeType("ban");
		moneyTrade.setNumber(4);
		assertEquals(89129.04, moneyTrade.getTotalPrice(), 0);
	}
	
	@Test
	public void testTrade5() {
		goldTrade.setGoldType("10K");
		goldTrade.setNumber(5);
		assertEquals(6.9445E7, goldTrade.getTotalPrice(), 0);
		moneyTrade.setMoneyType("EUR");
		moneyTrade.setTradeType("mua");
		moneyTrade.setNumber(5);
		assertEquals(124881.4, moneyTrade.getTotalPrice(), 0);
	}
	
	@Test
	public void testTrade6() {
		goldTrade.setGoldType("14K");
		goldTrade.setNumber(6);
		System.out.println(goldTrade.getTotalPrice());
		assertNotEquals(6.9445E7, goldTrade.getTotalPrice(), 0);
		moneyTrade.setMoneyType("USD");
		moneyTrade.setTradeType("mua");
		moneyTrade.setNumber(6);
		System.out.println(moneyTrade.getTotalPrice());
		assertNotEquals(124881.4, moneyTrade.getTotalPrice(), 0);
	}
	
	@Test
	public void testTrade7() {
		goldTrade.setGoldType("18K");
		goldTrade.setNumber(7);
		System.out.println(goldTrade.getTotalPrice());
		assertNotEquals(1.40564E8, goldTrade.getTotalPrice(), 0);
		moneyTrade.setMoneyType("USD");
		moneyTrade.setTradeType("mua");
		moneyTrade.setNumber(7);
		System.out.println(moneyTrade.getTotalPrice());
		assertNotEquals(89129.04, moneyTrade.getTotalPrice(), 0);
	}
	
	@Test
	public void testTrade8() {
		goldTrade.setGoldType("24K");
		goldTrade.setNumber(8);
		System.out.println(goldTrade.getTotalPrice());
		assertNotEquals(7.7934E7, goldTrade.getTotalPrice(), 0);
		moneyTrade.setMoneyType("USD");
		moneyTrade.setTradeType("mua");
		moneyTrade.setNumber(8);
		System.out.println(moneyTrade.getTotalPrice());
		assertNotEquals(50241.39, moneyTrade.getTotalPrice(), 0);
	}
	
	@Test
	public void testTrade9() {
		goldTrade.setGoldType("10K");
		goldTrade.setNumber(9);
		System.out.println(goldTrade.getTotalPrice());
		assertNotEquals(3.983E7, goldTrade.getTotalPrice(), 0);
		moneyTrade.setMoneyType("USD");
		moneyTrade.setTradeType("mua");
		moneyTrade.setNumber(9);
		System.out.println(moneyTrade.getTotalPrice());
		assertNotEquals(50002.512559999996, moneyTrade.getTotalPrice(), 0);
	}
	
	@Test
	public void testTrade10() {
		goldTrade.setGoldType("14K");
		goldTrade.setNumber(10);
		System.out.println(goldTrade.getTotalPrice());
		assertNotEquals(1.3889E7, goldTrade.getTotalPrice(), 0);
		moneyTrade.setMoneyType("USD");
		moneyTrade.setTradeType("mua");
		moneyTrade.setNumber(10);
		System.out.println(moneyTrade.getTotalPrice());
		assertNotEquals(22260.0, moneyTrade.getTotalPrice(), 0);
	}
}
