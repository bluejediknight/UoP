package week_2;

public class PRG215_Week_2 {

	public static void main(String[] args) {
		
		java.util.ArrayList<Customer> customerArray = 
				new java.util.ArrayList<Customer>();
		
		Customer c = new Customer("Luke");
		customerArray.add(c);
		c = new Customer("Leia");
		customerArray.add(c);
		c = new Customer("Obi-Wan");
		customerArray.add(c);
		
		for (Customer customer : customerArray) {
			System.out.println(customer.name);
		}
	}
}

class Customer {
	String name;
	
	public Customer(String AccountName) {
		name = AccountName;
	}
}

