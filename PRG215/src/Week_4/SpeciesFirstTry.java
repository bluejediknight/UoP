package Week_4;


public class SpeciesFirstTry {
	
	public String name;
	public int speciesnumber;
	public int population;
	public double growthRate;
	
	public void readInput()
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.print("What is the species name? ");
		name = s.nextLine();
		System.out.print("What is the population of the species? ");
		population = s.nextInt();
		System.out.print("What is the growth rate (% of increase per year)? ");
		growthRate = s.nextInt();
	}
	public void getFemalePopulation()
	{
		int girls = population / 2;
		girls += (population % 2);
		System.out.println("Females     = " + girls);
	}
	public void getMalePopulation()
	{
		System.out.println("Males     = " + (population/2));
	}
	public void writeOutput()
	{
		System.out.println("====================================");
		System.out.println("Number      = " + this.speciesnumber);
		System.out.println("Name        = " + this.name);
		System.out.println("Population  = " + this.population);
		System.out.println("Growth Rate = " + this.growthRate + "%");
		
		getFemalePopulation();
		getMalePopulation();
	}
	public int getPopulationIn10()
	{
		int result = 0;
		double populationAmount = this.population;
		int count = 10;
		while ((count > 0) && (populationAmount > 0))
		{
			populationAmount = populationAmount + (this.growthRate / 100) * populationAmount;
			count--;			
		}
		if (populationAmount > 0)
		{
			result = (int)populationAmount;  // Cast population amount to a integer to remove remainders
		}
		return result;
	}

}
