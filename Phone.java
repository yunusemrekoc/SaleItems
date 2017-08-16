
public class Phone extends AmazonProduct{
	protected double cost;
	public Phone(String name,double cost){
		super(name);
		this.cost=cost;
	}
	public double getCost(){
		return cost;
	}
	public String toString()
	{
		return "name: "+name+"\t\t\t"+"Cost of Phone: "+cost;
	}

}
