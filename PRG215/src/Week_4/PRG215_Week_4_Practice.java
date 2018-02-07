package Week_4;

public class PRG215_Week_4_Practice {

	public static void main(String[] args) {
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		Integer n = new Integer(77);
		int m = 77;
		n = m;
		m = n;  
		System.exit(0);
		
		
		int n1 = 5;
		float n2 = 10;
		float result = Math.min(n1, n2);
		
		
		System.out.println("result: " + result);
		
		System.exit(0);
				
		double speed = 55.66;
		int approxSpeed = (int)Math.round(speed);
		long longSpeed = Math.round(speed);
		
		System.out.println("Approx Speed: " + approxSpeed);
		System.out.println("Long Speed: " + longSpeed);
		
		
		System.out.print("Enter radius: ");
		int radius = s.nextInt();		
		System.out.println("Area: " + GetCircleArea(radius));

		
		System.out.println("2.3: " + GetRound(2.3));
		System.out.println("2.7: " + GetRound(2.7));
		System.out.println("2.3: " + GetFloor(2.3));
		System.out.println("2.7: " + GetFloor(2.7));
		System.out.println("2.3: " + GetCeiling(2.3));
		System.out.println("2.7: " + GetCeiling(2.7));
		
	}
	
	private static double GetCircleArea(int radius)
	{
		return Math.PI * radius * radius;
	}
	
	private static double GetRound(double number)
	{
		return Math.round(number);
	}
	
	private static double GetFloor(double number)
	{
		return Math.floor(number);
	}
	
	private static double GetCeiling(double number)
	{
		return Math.ceil(number);
	}

}
