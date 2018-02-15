package Week_5;

import java.io.*;
import java.util.ArrayList;

public class Week_5_Practice {

	public static void main(String[] args) {
		
		
		File file = new File("xxx.txt");
		
		try 
		{	
			// Open the file
			java.util.Scanner s = new java.util.Scanner(file);
			
			// Write the contents
			while(s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
		}
		catch (Exception e)
		{
			System.out.println("EXECPTION: " + e.getMessage());
		}
		
		
		
		
		
		
		System.exit(0);
		
		
		try
		{
			System.out.println("Try to read a file that does not exist");
			File f = new File("none.txt");
			java.util.Scanner s = new java.util.Scanner(f);
		}
		catch (IOException e) 
		{
			System.out.println("IO EXECPTION");			
		}
		catch (Exception e) 
		{
			System.out.println("EXECPTION");			
		}
		finally
		{
			System.out.println("Done");
		}		
		
		/*
		 * :\n\t" 
		+ "getMessage: " + e.getMessage() + "\n\t"
		+ "getClass: " + e.getClass() + "\n\t"
		+ "toString: " + e.toString() + "\n\t"
		+ "getCause: " + e.getCause() + "\n\t"
		+ "getStackTrace: " + e.getStackTrace());
		*/
	}

}
