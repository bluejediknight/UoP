package Week_5;

import java.io.*;
import java.util.ArrayList;

public class FileChallenge {

	public static void main(String[] args) {

		File itemFile = new File("items.txt");
		File priceFile = new File("prices.txt");
		
		try {
			// Get the contents of the File
			java.util.Scanner s = new java.util.Scanner(itemFile);			
			
			// Get the Menu Items into an ArrayList
			ArrayList<String> items = new ArrayList<String>();
			while(s.hasNextLine()) {
				items.add(s.nextLine());
			}
			
			// Get the prices in a parallel Array
			ArrayList<Double> prices = new ArrayList<Double>();
			for(String item: items)
			{
				System.out.print("Enter the price for " + item + ": ");
				Double price = s.nextDouble();
				prices.add(price);
			}
			
			
			
		
		}
		catch (IOException e) {

			System.out.println("IO EXECPTION: " + e.toString());
			
		}
		catch (Exception e) {

			System.out.println("EXECPTION: " + e.toString());
			
		}
		finally
		{
			// end the program
		}		
		

	}

}
