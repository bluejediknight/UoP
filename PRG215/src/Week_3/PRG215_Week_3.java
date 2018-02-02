package Week_3;

public class PRG215_Week_3 {

	public static void main(String[] args) {
		
		// Item arrays
		String[] itemNames = {"Tennis Shoes", "Shirts", "Coats", "Belts", "Pants"};
		double[] itemCosts = {48.89, 25.55, 89.99, 15.00, 25.99};
		
		
		// Variables
		double totalAmount = 0.0;
		double taxRate = 0.081;
		
		
		// Discounts
		double discountRate = 0.025; // 2.5%
		double amountToQualifyForDiscount = 100;
		double discountAmount = 0;
		
		
		// Display Items for sale
		System.out.println("The following clothing items are available for purshase.");
		for (int i=0; i < itemNames.length; i++)
		{
			System.out.println("    " + (i + 1) + ". " + itemNames[i] + " for $" + itemCosts[i] + " each.");
		}
		
		
		// Get customer name
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		System.out.println("Please enter your name: ");
		String customerName = keyboard.next();
		System.out.println("");
		
		
		// Display the Customer Name and provide Instructions
		System.out.println("Ok, " + customerName + ", please enter the ProductID you wish to purchase.  Enter 0 when you are finished.\n");
		
		// Loop until done
		int itemID = 0;
		int itemCounter = 1;
		do
		{
			// Prompt User
			System.out.print("ProductID number " + itemCounter + " (0 to exit): ");
			itemID = keyboard.nextInt();
			
			// If the user
			if (itemID > 0)
			{
				// validate
				if (itemID > 5)
				{
					System.out.println("Invalid Item Id.");
					continue;
				}
				
				// Add total
				totalAmount = totalAmount + itemCosts[itemID - 1];
				
				// Increment Counter
				itemCounter++;
			}
		}
		while(itemID != 0);
				
		// Calculate Discount		
		if (totalAmount >= amountToQualifyForDiscount)
		{
			discountAmount = totalAmount * discountRate;			
		}
		else
		{
			discountAmount = 0;
		}
			
		// Calculate Taxes
		double taxAmount = (totalAmount - discountAmount) * taxRate;
		
		// Display the Results
		System.out.println("\nYou selected " + itemCounter + " items to purchase.");
		System.out.println("Sales Total   $" + totalAmount);
		System.out.println("Discount      $" + String.format("%.2f", discountAmount));
		System.out.println("Sales Tax     $" + String.format("%.2f", taxAmount));
		System.out.println("Total Due     $" + String.format("%.2f", (totalAmount - discountAmount + taxAmount)) + "\n");		

	}

}
