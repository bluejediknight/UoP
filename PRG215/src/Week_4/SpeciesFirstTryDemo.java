package Week_4;

import Week_4.SpeciesFirstTry;

public class SpeciesFirstTryDemo
{
    public static void main(String[] args)
    {
    	java.util.Scanner s = new java.util.Scanner(System.in);
    	
    	System.out.print("How many species to enter? ");    	
    	int numberOfSpecies = s.nextInt();
		int counter = 1;
		
		while(counter <= numberOfSpecies)
		{
			SpeciesFirstTry species = new SpeciesFirstTry();
	        species.speciesnumber = counter;
	        species.readInput();
	        species.writeOutput();
	        int futurePopulation = species.getPopulationIn10();
	        System.out.println("In ten years the population will be " + futurePopulation);        
	        counter++;
		}
    }
}