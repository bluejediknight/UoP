package week_2;

public class Programming_exercises_1 {

	public static void main(String[] args) {
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.println("Enter a number: ");
		Float x = s.nextFloat();		
		Double y = 1.0 / x;
		
		System.out.println("x     = " + x);
		System.out.println("y     = " + y);		
		System.out.println("x*y   = " + (x*y));
		System.out.println("x*y-1 = " + ((x*y)-1));

	}

}
