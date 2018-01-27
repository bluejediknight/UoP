package week_2;
 
import java.util.Scanner;
 
public class PRG215_Week_2 {

	public static void main(String[] args) {
		
		double tennisShoeCost = 45.89;
		double shirtCost = 25.55;
		double coatCost = 89.99;
		double beltCost = 15.00;
		double pantCost = 25.99;
		
		// Variables
		double totalAmount = 0.0;
		double taxRate = 0.081;
		
		// Display
		System.out.println("The following clothing items are available for purchase:");
		System.out.println("   1. Shoes  $" + tennisShoeCost + " each");
		System.out.println("   2. Shirts $" + shirtCost + " each");
		System.out.println("   3. Coats  $" + coatCost + " each");
		System.out.println("   4. Belts  $" + beltCost + " each");
		System.out.println("   5. Pants  $" + pantCost + " each");
		
		// Scanner for keyboard entry
		Scanner keyboard = new Scanner(System.in);
		
		// Get Name from the user
		System.out.print("\nPlease enter your name: ");
		String customerName = keyboard.next();
		
		// Ask for number of items - will use this for our loop
		System.out.print("\nHow many items do you wish to purchase? ");
		int itemsToPurchase = keyboard.nextInt();
				
		// Display Results
		System.out.print("\nOk, " + customerName + ", you wish to purchase " + itemsToPurchase + " item(s).");
		
		// Start purchase
		System.out.println("\nPlease enter the productID you wish to purchase.\n");
		
		// Loop for the number of items 
		for (int loopCounter = 0; loopCounter < itemsToPurchase; loopCounter++)
		{
			// Prompt user for the item
			System.out.print("Please enter the ID number " + (loopCounter+1) + ": ");
			int itemID = keyboard.nextInt();
			
			// Add the appropriate cost
			if (itemID==1) { totalAmount+=tennisShoeCost; }
			if (itemID==2) { totalAmount+=shirtCost; }
			if (itemID==3) { totalAmount+=coatCost; }
			if (itemID==4) { totalAmount+=beltCost; }
			if (itemID==5) { totalAmount+=pantCost; }
		}		
		
		// Calculate the taxes
		double taxAmount = totalAmount * taxRate;
		
		// Show the results
		System.out.println("\nYour sales total: $" + totalAmount);
		System.out.println("Your sales tax:   $" + String.format("%.2f", taxAmount));
		System.out.println("Total amount due: $" + String.format("%.2f", (totalAmount + taxAmount)));
		System.out.println("");
	}
}
