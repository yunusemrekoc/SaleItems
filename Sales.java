import java.util.ArrayList;
public class Sales {
private static int counter=0;
	
	public ArrayList<AmazonProduct>fp=new ArrayList<AmazonProduct>();
	public void enterItem(AmazonProduct f)
	{
		fp.add(f);
		counter++;
	}
	public void clear(){
		fp.clear();
		counter=0;
	}
	public int numberOfItems(){
		return fp.size();
	}
	public double totalCost(){
		double u=0;
		for(int i=0;i<counter;i++)
			u+=fp.get(i).getCost();
		return u;
	}
	public double getCost(AmazonProduct f)
	{
		return f.getCost();		
	}
	public String toString(){
		for(int i=0;i<counter;i++)
		System.out.println(fp.get(i));
		return "";
	}
	public String toString(AmazonProduct a){
		return a.toString();
	}

}
