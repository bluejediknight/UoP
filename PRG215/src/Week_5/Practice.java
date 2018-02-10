package Week_5;

public class Practice {

	public static void main(String[] args) {
		
		GetRequest g = new GetRequest();
		try {			
			
			g.sendGet("http://www.apple.com");
			g.sendGet("http://www.microsoft.com/");
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
