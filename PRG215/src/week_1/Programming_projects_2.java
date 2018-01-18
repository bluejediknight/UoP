package week_1;

public class Programming_projects_2 {

	public static void main(String[] args) {

		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.println("What year were you born? ");
		int year = s.nextInt();
		
		int birthday = 0;
		
		do
		{
			System.out.println("Which birthday do you want to know the year for (0 to exit)? ");
			birthday = s.nextInt();
			
			if (birthday > 0)
			{
				System.out.println("Your " + birthday + " birthday will occur in the year: " + (year + birthday));
			}
		}
		while (birthday > 0);
		
		System.out.println("Goodbye.");

	}

}
