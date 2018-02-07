package Week_4;

import Week_4.CourseGrade.LetterGrade;

public class CH6_Programming_Project_5 {

	public static void main(String[] args) {
		
		/*
		 * Write a Java enumeration LetterGrade that represents letter grades A through F, 
		 * including plus and minus grades. 
		 * 
		 * Define a private instance variable to hold a 
		 * boolean value that is true if the grade is passing. Also, define a constructor 
		 * that initializes this instance variable, an accessor method isPassing to return 
		 * its value, and a method toString that returns the grade as a string. 
		 * 
		 * Finally, write a program to demonstrate the enumeration.
		 */
		
		// Instance variable of our Course Object
		CourseGrade courseGrade = null;
		
		// B- course
		courseGrade = new CourseGrade(LetterGrade.B_MINUS);
		System.out.println("Grade for course: " + courseGrade.toString());
		System.out.println("Passing:          " + courseGrade.IsPassing());
		
		// A+ course
		courseGrade = new CourseGrade(LetterGrade.A_PLUS);
		System.out.println("Grade for course: " + courseGrade.toString());
		System.out.println("Passing:          " + courseGrade.IsPassing());
		
		// F course
		courseGrade = new CourseGrade(LetterGrade.F);
		System.out.println("Grade for course: " + courseGrade.toString());
		System.out.println("Passing:          " + courseGrade.IsPassing());
	}
}
