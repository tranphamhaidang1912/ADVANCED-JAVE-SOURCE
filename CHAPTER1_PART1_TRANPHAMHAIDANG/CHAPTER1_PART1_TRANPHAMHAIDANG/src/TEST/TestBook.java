package TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import Book.ReferenceBook;
import Book.TextBook;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * UnitTest for Book
 */
public class TestBook {

	TextBook textBook = new TextBook();
	ReferenceBook referenceBook = new ReferenceBook();
	
	@Test
	public void testBook1() {
		textBook.setNumber(1);
		textBook.setPrice(10000);
		textBook.setState("cu");
		assertEquals(5000.0, textBook.getTotalPriceTextBook(), 0);
		referenceBook.setNumber(1);
		referenceBook.setPrice(11000);
		referenceBook.setTax(0.1);
		assertEquals(12100.0, referenceBook.getTotalPriceReferenceBook(), 0);
	}

	@Test
	public void testBook2() {
		textBook.setNumber(2);
		textBook.setPrice(20000);
		textBook.setState("moi");
		assertEquals(40000.0, textBook.getTotalPriceTextBook(), 0);
		referenceBook.setNumber(2);
		referenceBook.setPrice(22000);
		referenceBook.setTax(0.2);
		assertEquals(52800.0, referenceBook.getTotalPriceReferenceBook(), 0);
	}
	
	@Test
	public void testBook3() {
		textBook.setNumber(3);
		textBook.setPrice(30000);
		textBook.setState("cu");
		assertEquals(45000.0, textBook.getTotalPriceTextBook(), 0);
		referenceBook.setNumber(3);
		referenceBook.setPrice(33000);
		referenceBook.setTax(0.3);
		assertEquals(128700.0, referenceBook.getTotalPriceReferenceBook(), 0);
	}

	@Test
	public void testBook4() {
		textBook.setNumber(4);
		textBook.setPrice(40000);
		textBook.setState("moi");
		assertEquals(160000.0, textBook.getTotalPriceTextBook(), 0);
		referenceBook.setNumber(4);
		referenceBook.setPrice(44000);
		referenceBook.setTax(0.4);
		assertEquals(246400.0, referenceBook.getTotalPriceReferenceBook(), 0);
	}

	@Test
	public void testBook5() {
		textBook.setNumber(5);
		textBook.setPrice(50000);
		textBook.setState("cu");
		assertEquals(125000.0, textBook.getTotalPriceTextBook(), 0);
		referenceBook.setNumber(5);
		referenceBook.setPrice(55000);
		referenceBook.setTax(0.5);
		assertEquals(412500.0, referenceBook.getTotalPriceReferenceBook(), 0);
	}
	
	@Test
	public void testBook6() {
		textBook.setNumber(6);
		textBook.setPrice(60000);
		textBook.setState("moi");
		assertNotEquals(125000.0, textBook.getTotalPriceTextBook(), 0);
		referenceBook.setNumber(6);
		referenceBook.setPrice(66000);
		referenceBook.setTax(0.6);
		assertNotEquals(412500.0, referenceBook.getTotalPriceReferenceBook(), 0);
	}
	
	@Test
	public void testBook7() {
		textBook.setNumber(7);
		textBook.setPrice(70000);
		textBook.setState("cu");
		assertNotEquals(160000.0, textBook.getTotalPriceTextBook(), 0);
		referenceBook.setNumber(7);
		referenceBook.setPrice(77000);
		referenceBook.setTax(0.7);
		assertNotEquals(246400.0, referenceBook.getTotalPriceReferenceBook(), 0);
	}
	
	@Test
	public void testBook8() {
		textBook.setNumber(8);
		textBook.setPrice(80000);
		textBook.setState("moi");
		assertNotEquals(45000.0, textBook.getTotalPriceTextBook(), 0);
		referenceBook.setNumber(8);
		referenceBook.setPrice(88000);
		referenceBook.setTax(0.8);
		assertNotEquals(128700.0, referenceBook.getTotalPriceReferenceBook(), 0);
	}
	
	@Test
	public void testBook9() {
		textBook.setNumber(9);
		textBook.setPrice(90000);
		textBook.setState("cu");
		assertNotEquals(40000.0, textBook.getTotalPriceTextBook(), 0);
		referenceBook.setNumber(9);
		referenceBook.setPrice(99000);
		referenceBook.setTax(0.9);
		assertNotEquals(52800.0, referenceBook.getTotalPriceReferenceBook(), 0);
	}
	
	@Test
	public void testBook10() {
		textBook.setNumber(10);
		textBook.setPrice(100000);
		textBook.setState("moi");
		assertNotEquals(5000.0, textBook.getTotalPriceTextBook(), 0);
		referenceBook.setNumber(10);
		referenceBook.setPrice(110000);
		referenceBook.setTax(1);
		assertNotEquals(12100.0, referenceBook.getTotalPriceReferenceBook(), 0);
	}
}
