package edu.westga.cs1302.lab1.testmodel;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab1.model.BillItem;

class TestBillItemConstructor {

	@Test
	void testValidConstructor() {
		String name = "pens";
		Double amount = 2.50;
		
		BillItem item = new BillItem(name, amount);
		
		assertEquals(item.getName(), "pens", "testing name");
		assertEquals(item.getAmount(), 2.50, "testing amount");
		
	}
	
	@Test
	void testInvalidConstructorName() {
		assertThrows(IllegalArgumentException.class, ()-> {
			new BillItem(null, 2.50);
		});
	}
	
	@Test
	void testInvalidConstructorAmountEqualToZero() {
		assertThrows(IllegalArgumentException.class, ()-> {
			new BillItem(null, 0.0);
		});
	}
	
	@Test
	void testInvalidConstructorAmountLessThanZero() {
		assertThrows(IllegalArgumentException.class, ()-> {
			new BillItem(null, -1.0);
		});
	}

}
