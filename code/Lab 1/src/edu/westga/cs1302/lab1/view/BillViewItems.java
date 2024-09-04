package edu.westga.cs1302.lab1.view;

import java.text.DecimalFormat;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

/**Creates an output for the bill items list.
 * 
 * @author CS 1302
 * @version fall 2024
 */
public class BillViewItems {
	
	/** Return a String containing the list of bill items and total for the bill.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @param bill the bill to be analyzed
	 * @return a String containing the list of bill items and total for the bill
	 */
	public String getText(Bill bill) {
		DecimalFormat df = new DecimalFormat("#.00");
		String text = "ITEMS" + System.lineSeparator();
		double subTotal = 0.0;
		for (BillItem item : bill.getItems()) {
			text += item.getName() + " - " + df.format(item.getAmount()) + System.lineSeparator();
			subTotal += item.getAmount();
		}
		
		text += System.lineSeparator();
		text += "SUBTOTAL - $" + df.format(subTotal) + System.lineSeparator();
		double tax = subTotal * Bill.TAX_PERCENT;
		double tip = subTotal * Bill.TIP_PERCENT;
		text += "TAX - $" + df.format(tax) + System.lineSeparator();
		text += "TIP - $" + df.format(tip) + System.lineSeparator();
		text += "TOTAL - $" + df.format(subTotal + tip + tax);
		return text;
	}

}
