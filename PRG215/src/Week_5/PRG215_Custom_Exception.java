package Week_5;

public class PRG215_Custom_Exception {

	public static void main(String[] args) {
		
		try
		{		
			System.out.println("1. Luke");
			System.out.println("2. Leia");
			System.out.println("3. Anakin");
			System.out.println("4. Han Solo");
			System.out.print("Choose a character: ");
			
			java.util.Scanner s = new java.util.Scanner(System.in);
			int choice = s.nextInt();
			
			if (choice == 4)
			{
				throw new NotSkywalker();
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
