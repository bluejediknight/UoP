package Week_5;

import java.io.*;

public class Week_5_Practice {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("Try to read a file that does not exist");
			File f = new File("none.txt");
			java.util.Scanner s = new java.util.Scanner(f);
		}
		catch (IOException e) {

			System.out.println("IO EXECPTION");
			
		}
		catch (Exception e) {

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
