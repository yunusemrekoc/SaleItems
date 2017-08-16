
public abstract class AmazonProduct {
protected String name;
public AmazonProduct(String name)
{
	this.name=name;
}
public abstract double getCost();
public String toString()
{
			return "There is no information about this item!";
}
}
