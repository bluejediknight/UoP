package Week_4;

public class PRG215_Week_4 {

	public static void main(String[] args) {
		
		// Constant for the total number of items
		final int TOTAL_ITEMS = 6;
		
		// Create the items object arrays
		ItemsForSale[] items = new ItemsForSale[TOTAL_ITEMS];
		
		// Loop and instantiate
		for(int i=0; i < TOTAL_ITEMS; i++) 
		{
			items[i] = new ItemsForSale();
		}
		
		// Use the PopulateItem method
		items[0].PopulateItem("Shoes", 45.89,true);
		items[1].PopulateItem("Shirts", 25.55,true);
		items[2].PopulateItem("Coats", 89.99,true);
		items[3].PopulateItem("Belts", 15.0,true);
		items[4].PopulateItem("Pants", 25.99,true);
		items[5].PopulateItem("Donation", 10,false);

		// Financials
		double totalAmount = 0.0;
		double totalTax = 0.0;
		final double taxRate = 0.081; 
		
		// Discounts
		final double DISCOUNT_RATE = 0.025;
		final double AMOUNT_TO_QUALIFY_FOR_DISCOUNT = 100;
		double discountAmount = 0;
		
		// Display Items for Sale
		System.out.println("The following are available for purchase");
		for(int i=0;i<items.length;i++) 
		{
			System.out.println("   " + (i+1) + ". " + items[i].itemName + "\t$" + String.format("%.2f", items[i].itemCost) + " each.");
		}
					
		java.util.Scanner keyboard = new java.util.Scanner(System.in);

		// Get the Customer Information
		Customer newCust = new Customer();		
		System.out.print("\nEnter your first name: ");
		newCust.firstName = keyboard.next();		
		System.out.print("Enter your last name: ");
		newCust.lastName = keyboard.next();
		
		// Show the instructions
		System.out.println("\nOk, " + newCust.FullName() + ", enter the product ID to purchase, and 0 when done.");
		
		// Loop until 0
		int itemID = 0;
		int itemCounter = 0;
		do
		{
			System.out.print("Product ID: ");
			itemID = keyboard.nextInt();
			
			// Enter 0?
			if(itemID > 0) 
			{
				if (itemID > TOTAL_ITEMS)
				{
					continue;
				}
				
				// Add cost to Total
				totalAmount += items[itemID - 1].itemCost;
				
				// Taxable?
				if (items[itemID - 1].taxable)
				{
					totalTax += (items[itemID - 1].itemCost * taxRate);
				}
				
				// Increment
				itemCounter++;
			} 
		} 
		while(itemID != 0); // Check for 0
		
		// Customer is done
		if (totalAmount >= AMOUNT_TO_QUALIFY_FOR_DISCOUNT)
		{
			discountAmount = totalAmount * DISCOUNT_RATE;
		}
		else
		{
			discountAmount = 0;
		}
		
		// Show the Receipt
		System.out.println("\nYou selected " + itemCounter + " items to purchase.");
		System.out.println("Sales Total   $" + String.format("%.2f", totalAmount));
		System.out.println("Discount      $" + String.format("%.2f", discountAmount));
		System.out.println("Sales Tax     $" + String.format("%.2f", totalTax));
		System.out.println("Total Due     $" + String.format("%.2f", (totalAmount - discountAmount + totalTax)) + "\n");		
		
	}

}
