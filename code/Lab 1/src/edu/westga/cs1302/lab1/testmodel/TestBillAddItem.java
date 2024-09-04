package edu.westga.cs1302.lab1.testmodel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

class TestBillAddItem {

	@Test
	void testAddOneItem() {
		Bill bill = new Bill();
		BillItem item = new BillItem("pen", 0.50);
		
		bill.addItem(item);
		
		assertEquals(bill.getItems().size(), 1);
		assertEquals(bill.getItems().get(0), item);
		
	}

	@Test
	void testAddMultipleItems() {
		Bill bill = new Bill();
		BillItem item1 = new BillItem("pen", 0.50);
		BillItem item2 = new BillItem("water", 1.50);
		BillItem item3 = new BillItem("candy", 2.50);
		
		bill.addItem(item1);
		bill.addItem(item2);
		bill.addItem(item3);
		
		assertEquals(bill.getItems().size(), 3);
		assertEquals(bill.getItems().get(0), item1);
		assertEquals(bill.getItems().get(1), item2);
		assertEquals(bill.getItems().get(2), item3);
		
	}
}
