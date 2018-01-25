package week_2;

public class Chapter5_SelfTest_1 {

	public static void main(String[] args) {
		
		int counter = 1;
		
		
		SpeciesFirstTry speciesOfTheMonth = new SpeciesFirstTry();
        System.out.println("Enter data on the Species of the Month:");
        speciesOfTheMonth.speciesnumber = counter;
        speciesOfTheMonth.readInput();
        speciesOfTheMonth.writeOutput();
        int futurePopulation = speciesOfTheMonth.getPopulationIn10();
        System.out.println("In ten years the population will be " + futurePopulation);
        
//        counter++;
//        
//        SpeciesFirstTry speciesOfTheYear = new SpeciesFirstTry();
//        System.out.println("Enter data on the Species of the Year:");
//        speciesOfTheYear.speciesnumber = counter;
//        speciesOfTheYear.readInput();
//        speciesOfTheYear.writeOutput();
//        futurePopulation = speciesOfTheYear.getPopulationIn10();
//        System.out.println("In ten years the population will be " + futurePopulation);

//        counter++;
//        
//        //Change the species to show how to change
//        //the values of instance variables:
//        speciesOfTheMonth.name = "Klingon ox";
//        speciesOfTheYear.speciesnumber = counter;
//        speciesOfTheMonth.population = 10;
//        speciesOfTheMonth.growthRate = 15;
//        System.out.println("The new Species of the Month:");
//        speciesOfTheMonth.writeOutput();
//        System.out.println("In ten years the population will be " + speciesOfTheMonth.getPopulationIn10());
	}

}
