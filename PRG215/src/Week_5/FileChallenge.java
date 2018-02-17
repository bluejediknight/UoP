package Week_5;

import java.io.*;
import java.util.ArrayList;

public class FileChallenge {

	public static void main(String[] args) {

		// File variables
		File itemFile = new File("items.txt");
		File priceFile = new File("prices.txt");
		
		try {
			
			// Scanners (file and input)
			java.util.Scanner f = new java.util.Scanner(itemFile);	
			java.util.Scanner s = new java.util.Scanner(System.in);
			
			// Temp variables
			String item;
			Double price;
			
			// Output file
			PrintWriter outputfile = new PrintWriter(priceFile);
						
			// Iterate all the items
			while(f.hasNextLine()) {
				
				// Get the Price
				item = f.nextLine();
				System.out.print("Enter the price for " + item + ": ");
				price = s.nextDouble();
				
				// Write to the Output file
				outputfile.println(item + "\t$" + String.format("%.2f", price));
				
			}	
			
			// Close the file!
			outputfile.close();
		
		}
		catch (Exception e) {

			System.out.println("EXECPTION: " + e.toString());
			
		}
		finally
		{
			System.out.println("The output file was successfully written");
		}		
		

	}

}
