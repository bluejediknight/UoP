package Week_4;

public class ItemsForSale {
	
	public String itemName;
	public double itemCost;
	public boolean taxable;
	
	public void PopulateItem(String iName, double iCost, boolean canTax)
	{
		this.itemName = iName;
		this.itemCost = iCost;
		this.taxable = canTax;
	}

}
