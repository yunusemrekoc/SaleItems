
public class Bookset extends AmazonProduct {
	protected int numberOfItems;
	protected double pricePerItem;
	public Bookset(String name,int numberOfItems,double pricePerItem)
	{
		super(name);
		this.pricePerItem=pricePerItem;
		this.numberOfItems=numberOfItems;
	}
	public double getCost(){
		return numberOfItems*pricePerItem;
	}
	public String toString()
	{
		return "name: "+name+"\t\t\t"+"Price per Item: "+pricePerItem+"      Number Of Items: "+numberOfItems;
		
	}
}
