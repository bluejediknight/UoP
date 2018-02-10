package Week_4;

public class Counter {
	
	private int value = 0;
	
	// Set to Zero
	public void SetToZero() { value = 0; }
	
	// Add one
	public void IncrementByOne() { value++; }
	
	// Subtract one
	public void DecrementByOne() {
		if (value > 0) {
			value--; 
		}
	}	
	
	// Get value
	public void GetValue()
	{
		System.out.println("The counter is " + value);
	}

}
