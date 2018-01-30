package Week_5;

import java.util.InputMismatchException;

public class ItemsForSale {
     public String itemName;
     public double itemCost;
     public boolean taxable;
     public void PopulateItem(String iName, double iCost, boolean canTax)
     {
	     this.itemName = iName;
	     this.itemCost = iCost;
	     this.taxable = canTax;
     }
}
class PRG215_Week_5 {
    public static void main(String[] args) {
         final int TOTAL_ITEMS = 6;
                ItemsForSale[] items = new ItemsForSale[TOTAL_ITEMS];
        for(int i = 0; i < TOTAL_ITEMS; i++)
        {
            items[i] = new ItemsForSale();
        }  
        items[0].PopulateItem("Tennis Shoes",45.89,true);
        items[1].PopulateItem("Shits", 25.55, true);
        items[2].PopulateItem("Coats", 89.99, true);
        items[3].PopulateItem("Belts", 15, true);
        items[4].PopulateItem("Pants", 25.99, true); 
        items[5].PopulateItem("Donation", 10, false);
        double totalAmount = 0.0;
        double totalTax = 0.0;
        double taxRate = 0.081;
        final double DISCOUNT_RATE = 0.025;
        final double AMOUNT_TO_QUALIFY_FOR_DISCOUNT = 100;
        double discountAmount = 0;
        System.out.println("The following clothing items are available for purchase:");
        for(int i=0; i < items.length; i++)
        {        
            //Display each item in the array
            System.out.println("     "+(i + 1)+". "+items[i].itemName+ " for $"+items[i].itemCost+" each");
        }        
        System.out.println("");
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        Customer newCust = new Customer();
        System.out.print("Please enter your first name: ");
        newCust.firstName = keyboard.next();
        System.out.print("Please enter your last name: ");
        newCust.lastName = keyboard.next();
        System.out.println("");
        System.out.println("Ok, " + newCust.FullName()+", please enter the product ID (the number to the left of the item name) that you wish to purchase. Enter 0 when you are finished.");
        int itemID = 0;
        int itemCounter = 1; 
        do
        {
            System.out.print("Please enter item ID number "+(itemCounter)+": ");
            try
            {
                itemID = keyboard.nextInt();           
                if(itemID > 0)
                {
                    totalAmount = totalAmount + items[itemID - 1].itemCost;
                    if(items[itemID - 1].taxable == true)
                    {
                        totalTax = totalTax + (items[itemID - 1].itemCost * taxRate);
                    }
                    itemCounter++;
                }
            }            
            catch (ArrayIndexOutOfBoundsException e1) 
            {
                System.out.println("The item ID you entered is outside the range of possible items. This must be a number between 1 and "+ TOTAL_ITEMS+". Please re-enter your item ID. ");
                itemID = -1;
            }
            catch (InputMismatchException e2)   
            {
                //Display the error message
                System.out.println("The item ID you entered does not appear to be an ingeger number. The item ID must be a number between 1 and "+ TOTAL_ITEMS+". Please re-enter your item ID. ");
                keyboard.nextLine();
                itemID = -1;    
            }
            
        } while (itemID != 0); //Check if exit condition has been met
        if(totalAmount >= AMOUNT_TO_QUALIFY_FOR_DISCOUNT)
        {
            discountAmount = totalAmount * DISCOUNT_RATE;
        }
        else
        {
            discountAmount = 0;
        }
        System.out.println("");
        System.out.println("You selected "+itemCounter+" items to purchase.");
        System.out.println("Your sales total $"+totalAmount);
        System.out.println("Your discount amount is $"+discountAmount);
        System.out.println("Your sales tax is $"+totalTax);
        System.out.println("The total amount due is $"+(totalAmount - discountAmount + totalTax));
        System.out.println("");
    }
}


