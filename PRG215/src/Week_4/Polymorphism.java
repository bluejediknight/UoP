package Week_4;

public class Polymorphism {

	public static void main(String[] args) {
		
		java.util.ArrayList<Animal> coll = new java.util.ArrayList<Animal>();
		
		// Normal, act as expected
		Animal a = new Animal();
		//coll.add(a);
		Mammal b = new Mammal();
		//coll.add(b);
		Feline c = new Feline();
		//coll.add(c);
		
		// Maybe not so obvious?
		//a = new Feline(); // Feline
		//coll.add(a);
		
		Animal d = new Mammal();
		Mammal e = new Feline();
		
		coll.add(d);
		coll.add(e);
		
		// Feline f = (Feline)a;
		// coll.add(f);
		
		
		//coll.add((Animal)b);
		//coll.add((Feline)a);
		//coll.add((Animal)c);
		
		

		
		for(Animal who: coll)
		{
			System.out.println(who.WhoAmI());
		}
	}

}
