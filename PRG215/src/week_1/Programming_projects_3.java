package week_1;

public class Programming_projects_3 {

	public static void main(String[] args) {
		
		// Create the Scanner
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		// Get for the Integer inputs
		System.out.println("Enter the first integer: ");
		int first = s.nextInt();
		System.out.println("Enter the second integer: ");
		int second = s.nextInt();
		
		// Lets check the inputs
		if (second < first)
		{
			System.out.println("The second integer is less than the first.");
			System.exit(0);
		}
		
		// Perform the operation
		for (int x = first; x <= second; x++)
		{
			System.out.println(x);
		}

	}

}
