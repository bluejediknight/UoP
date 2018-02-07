package Week_4;

public class CourseGrade {
	
	private boolean passing = false;
	private LetterGrade privateLetterGrade;
	
	// Constructor sets the passing variable
	public CourseGrade(LetterGrade lettergrade) {
		
		// Set the private instance variable
		privateLetterGrade = lettergrade;
		
		switch(lettergrade)
		{
			case A:
			case A_PLUS:
			case A_MINUS:
			case B:
			case B_PLUS:
			case B_MINUS:
			case C:
			case C_PLUS:
			case C_MINUS:
				passing = true;
				break;
		}
	}
	
	@Override
	public String toString()
	{		
		switch(privateLetterGrade)
		{
			case A:
				return "A";
			case A_PLUS:
				return "A+";
			case A_MINUS:
				return "A-";
			case B:
				return "B";
			case B_PLUS:
				return "B+";
			case B_MINUS:
				return "B-";
			case C:
				return "C";
			case C_PLUS:
				return "C+";
			case C_MINUS:
				return "C-";
			default:
				return "F";
		} 
	}
	
	public Boolean IsPassing()
	{
		return passing;
	}
	
	public enum LetterGrade { A_PLUS, A, A_MINUS, B_PLUS, B, B_MINUS, C_PLUS, C, C_MINUS, F}

}
