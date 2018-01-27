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
		System.out.println("   1. Tennis Shoes for $" + tennisShoeCost + " each");
		System.out.println("   2. Shirts for $" + shirtCost + " each");
		System.out.println("   3. Coats for $" + coatCost + " each");
		System.out.println("   4. Belts for $" + beltCost + " per pound");
		System.out.println("   5. Pants for $" + pantCost + " each");
		System.out.println("");
		
		// Scanner for keyboard entry
		Scanner keyboard = new Scanner(System.in);
		
		// Get Name from the user
		System.out.print("Please enter your name: ");
		String customerName = keyboard.next();
		System.out.println("");
		
		// Ask for number of items - will use this for our loop
		System.out.print("How many items do you wish to purchase? ");
		int itemsToPurchase = keyboard.nextInt();
		System.out.println("");
		
		// Display Results
		System.out.println("Ok, " + customerName + ", you wish to purchase " + itemsToPurchase + " items.");
		
	}
}
