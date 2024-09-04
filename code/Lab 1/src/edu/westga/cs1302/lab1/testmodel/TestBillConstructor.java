package edu.westga.cs1302.lab1.testmodel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab1.model.Bill;

class TestBillConstructor {

	@Test
	void testValidConstructor() {
		Bill bill = new Bill();
		
		assertEquals(bill.getItems().isEmpty(), true);
	}

}
