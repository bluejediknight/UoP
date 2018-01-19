package week_1;

import java.util.Scanner;

public class PRG215_Week_1 {

	public static void main(String[] args) {
		
		// Create a keyboard shortcut
		Scanner keyboard = new Scanner(System.in);
		
		// Display on the console - ask for the customer's name		
		System.out.println("Please enter your name: ");
		
		// Get the customer name from the keyboard and store it in the String object "customerName"
		String customerName = keyboard.next();
		keyboard.close();
		System.out.println("");
		
		// Display the customer's name on the console using println()
		System.out.println("Welcome, " + customerName + "!");

	}

}
