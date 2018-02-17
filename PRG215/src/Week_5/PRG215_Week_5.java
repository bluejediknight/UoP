package Week_5;

import java.util.Currency;
import java.util.InputMismatchException;
import java.util.Locale;

public class PRG215_Week_5 {

	public static void main(String[] args) {
	 
		// Constant for the total number of items
		final int TOTAL_ITEMS = 6;

		// Items Array
     	ItemsForSale[] items = new ItemsForSale[TOTAL_ITEMS];
     	
     	// Instantiate each object
        for(int i = 0; i < TOTAL_ITEMS; i++)
        {
            items[i] = new ItemsForSale();
        }
        
        // Populate all the item object properties        
        items[0].PopulateItem("Shoes    ",45.89,true);
        items[1].PopulateItem("Shirts   ", 25.55, true);
        items[2].PopulateItem("Coats    ", 89.99, true);
        items[3].PopulateItem("Belts    ", 15, true);
        items[4].PopulateItem("Pants    ", 25.99, true); 
        items[5].PopulateItem("Donation ", 10, false);
        
        // Financial variables
        double totalAmount = 0.0;
        double totalTax = 0.0;
        double taxRate = 0.081;
        
        // Discount variables
        final double DISCOUNT_RATE = 0.025;
        final double AMOUNT_TO_QUALIFY_FOR_DISCOUNT = 100;
        double discountAmount = 0;
        
        // Show the menu
        System.out.println("The following clothing items are available for purchase:");
        for(int i=0; i < items.length; i++)
        {        
            //Display each item in the array
            System.out.println("     "+(i + 1)+". "+items[i].itemName + 
            		GetFormattedCurrency(items[i].itemCost) + " each");
        }        
        
        // Keyboard input
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        
        // Create the customer object and populate
        Customer newCust = new Customer();
        System.out.print("\nPlease enter your first name: ");
        newCust.firstName = keyboard.next();
        System.out.print("Please enter your last name: ");
        newCust.lastName = keyboard.next();
        
        // Print instructions
        System.out.println("\nOk, " + newCust.FullName()+", enter the product ID "
        		+ " to the left of the item you wish to purchase.\n"
        		+ "Enter 0 when you are finished.");
        
        // Loop until order is complete
        int itemID = 0;
        int itemCounter = 1; 
        do
        {
        	// Prompt
            System.out.print("Please enter the item ID number "+(itemCounter)+": ");
            
            // Capture user entry errors
            try
            {
                itemID = keyboard.nextInt();         
                
                if(itemID > 0)
                {
                	// Total 
                    totalAmount = totalAmount + items[itemID - 1].itemCost;
                    
                    // Tax if applicable
                    if(items[itemID - 1].taxable == true)
                    {
                        totalTax = totalTax + (items[itemID - 1].itemCost * taxRate);
                    }
                    
                    // Increment
                    itemCounter++;
                }
            }   
            // User entered a number not in the array
            catch (ArrayIndexOutOfBoundsException e1) 
            {
            	// Display error
                System.out.println("The item ID you entered must be a number between"
                		+ " 1 and " + TOTAL_ITEMS+", please re-enter.");
                
                // Set this to avoid zero
                itemID = -1;
            }
            // If they did not enter an integer
            catch (InputMismatchException e2)   
            {
                //Display error
                System.out.println("The item ID you entered must be a number "
            			+ "between 1 and "+ TOTAL_ITEMS+", please re-enter.");
                
                // Remove non-integer
                keyboard.nextLine();
                
                // Avoid zero
                itemID = -1;    
            }
            
        } while (itemID != 0); //Check for zero
        
        // Discount
        if(totalAmount >= AMOUNT_TO_QUALIFY_FOR_DISCOUNT)
        {
            discountAmount = totalAmount * DISCOUNT_RATE;
        }
        else
        {
            discountAmount = 0;
        }
        
        
        // Print Receipt
        System.out.println("\nYou selected " + (itemCounter-1) + " items to purchase.");
        System.out.println("Sales Total\t" + GetFormattedCurrency(totalAmount));
        System.out.println("Discount\t" + GetFormattedCurrency(discountAmount));
        System.out.println("Sales Tax\t" + GetFormattedCurrency(totalTax));
        System.out.println("Total Due\t"+ GetFormattedCurrency(totalAmount - discountAmount + totalTax));
        System.out.println("");
    }
	
	private static String GetFormattedCurrency(double d)
	{
		// Get the current user's Local
      	Currency c = Currency.getInstance(Locale.getDefault());
      	
      	return c.getSymbol() + String.format(
 				"%." + c.getDefaultFractionDigits() + "f", d);
	}

}
