 package Week_5;
 import java.util.*;

 public class CurrencyPractice {

 	public static void main(String[] args) {
 		
 		System.out.println("DisplayName\t|\tCode\t|\tSymbol\t|\tDigits\t|\t10.5556");
 		System.out.println("----------------------------------------------------------------------------------");
 		 		 		
 		// Get the current user's Local
 		Currency c = Currency.getInstance(Locale.getDefault());
 		PrintInfo(c); 		
 		// Explore some others
 		c = Currency.getInstance("CNY");
 		PrintInfo(c); 
 		c = Currency.getInstance("SAR");
 		PrintInfo(c);
 		c = Currency.getInstance("FRF");
 		PrintInfo(c);
 	}
 	
 	private static void PrintInfo(Currency c)
 	{
 		// Display Name
 		System.out.print(c.getDisplayName() + "\t|\t");
 		// Currency Code
 		System.out.print(c.getCurrencyCode() + "\t|\t");
 		// Symbol
 		System.out.print(c.getSymbol() + "\t|\t");
 		// Fractional Digits
 		System.out.print(c.getDefaultFractionDigits() + "\t|\t");
 		// Format an amount: 10.5556
 		System.out.println(c.getSymbol() + " " + String.format(
 				"%." + c.getDefaultFractionDigits() + "f", 10.5556));
 	}
 }

 
 
 
 
 
 
 /*
			//Prints all the currency codes available
		Set<Currency> s = Currency.getAvailableCurrencies(); 		
		for(Currency c: s)
		{
			// System.out.println(c.getDisplayName() + ": " + c.getCurrencyCode());
		} 
		 */