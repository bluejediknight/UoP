package Week_3;

public class PRG215_Week_3 {

	public static void main(String[] args) {
		
		// Self Test 7
		for (int n = 1; n <= 4; n++) {
		     System.out.println(n);
		}
		System.exit(0);
		
		
		
		int product = 1, number; 
		for (number = 1; number <= 10; number++);
		{
		     product = product * number;
		}
		System.out.println("Product of the numbers 1 through 10 is " + product);
		
		
		
		
		
		int count = 0; 
		while (count < 5)
		{
		   System.out.println(count);
		   count++;
		}
		System.out.println("count after loop = " + count);
		

		
		
		// Self Test 1
		int[] anArray = new int[10];
		for (int i = 0; i <anArray.length; i++)
		     anArray[i] = 2 * i;
		for (int element : anArray)
		     System.out.print(element + " ");
		System.out.println();
		
		// Self Test 2
		char[] vowel = {'a', 'e', 'i', 'o', 'u'};
		for (int index = 0; index <vowel.length; index++)
		     System.out.println(vowel[index]);
		
		
		// Self Test 3
		//double tide[] = {12.2, −7.3, 14.2, 11.3};
		//System.out.println("Tide 1 is " + tide[1]);
		//System.out.println("Tide 2 is " + tide[2]);

	}

}
