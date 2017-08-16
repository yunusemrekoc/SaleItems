
public class Electronics extends AmazonProduct {
	protected int number;
	protected double pricePerDevice;
		public Electronics(String name,int number,double pri){
			super(name);
			pricePerDevice=pri;
			this.number=number;	
		}
		public double getCost(){
			return pricePerDevice*number;
		}
		public String toString()
		{
			return "name: "+name+"\t\t\t"+"Price per Device: "+pricePerDevice+"      Number of Device: "+number;
			
		}
}
