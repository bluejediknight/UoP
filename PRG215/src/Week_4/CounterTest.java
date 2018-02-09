package Week_4;

public class CounterTest {

	public static void main(String[] args) {
		
	/* 
	 * Define a class called Counter. An object of this class is used to count things, 
	 * so it records a count that is a nonnegative whole number. Include methods to set 
	 * the counter to 0, to increase the count by 1, and to decrease the count by 1. 
	 * 
	 * Be sure that no method allows the value of the counter to become negative. 
	 * Also include an accessor method that returns the current count value, as well as 
	 * a method that displays the count on the screen. Do not define an input method. 
	 * The only method that can set the counter is the one that sets it to zero. 
	 * 
	 * Write a program to test your class definition. (Hint: You need only one instance variable.)
	 */
		Counter c = new Counter();
		c.GetValue();
		c.IncrementByOne();
		c.GetValue();
		c.DecrementByOne();
		c.GetValue();
		c.DecrementByOne();
		c.GetValue();
		c.IncrementByOne();
		c.IncrementByOne();
		c.IncrementByOne();
		c.IncrementByOne();
		c.GetValue();
		c = null;
	}

}
