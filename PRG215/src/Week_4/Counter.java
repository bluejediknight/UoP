package Week_4;

public class Counter {
	
	private int value = 0;
	
	public void SetToZero() { value = 0; }
	public void IncrementByOne() { value++; }
	public void DecrementByOne() {
		if (value > 0) {
			value--; 
		}
	}
	public void GetValue()
	{
		System.out.println("The value of the counter is " + value);
	}

}
