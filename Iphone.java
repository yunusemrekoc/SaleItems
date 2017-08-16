
public class Iphone extends Phone{

	protected double tax;
	public Iphone(String name,double cost,double tax){
		super(name,cost);
		this.tax=tax;
	}

	public double getCost(){
		return super.cost+tax;
	}
	public String toString()
	{
		return "name: "+name+"\t\t"+"Cost of Phone: "+cost+"      Cost of tax: "+tax;
	}
}
