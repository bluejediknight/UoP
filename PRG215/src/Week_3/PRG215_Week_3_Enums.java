package Week_3;

public class PRG215_Week_3_Enums {

	enum Crew { Picard, Riker, Data, Worf, Crusher, Troi }	 
			
	public static void main(String[] args) {

		GetPersonalRecord(Crew.Picard);
		GetPersonalRecord(Crew.Data);
		GetPersonalRecord(Crew.Troi);		

	}
	
	// Some Data to play with
	static String[] name = {"Picard", "Riker", 
			"Data", "Worf", "Crusher", "Troi"};
	static String[] rank = {"Captain", "Commander", 
			"Lieutenant", "Lieutenant", "Doctor", "Counselor"};
	
	private static void GetPersonalRecord(Crew crew)
	{
		for (int i = 0; i < name.length; i++)
		{
			if (name[i] == crew.toString())
			{
				System.out.println("Officer " + name[i] + ":\t" + rank[i]);
			}
		}
		
	}	
}
