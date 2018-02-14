package Week_4;

public class MovieList {

	public static void main(String[] args) {
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		// Get the data
		System.out.print("Enter the movie title: ");
		String title = s.next();
		System.out.print("Enter the rating: ");
		String rating = s.next();
		System.out.print("Enter the year: ");
		int year = s.nextInt();
		System.out.print("Enter the running time: ");
		int time = s.nextInt();
		
		// Create the class
		Movie m = new Movie(title, rating, year, time);
		System.out.println(m.toString());
		
	}

}
