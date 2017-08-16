
public class TestSales {
	public static void main(String[] args) {
		Sales s = new Sales();
		s.enterItem(new Bookset("History",3,10));
		s.enterItem(new Electronics("Xerox",1,400));
		s.enterItem(new Phone("SamsungNote",500));
		s.enterItem(new Iphone("Iphone6S",2,1000));
		System.out.println("\nNumber of items: "+s.numberOfItems()+"\n");
		System.out.println("\nTotal cost: "+s.totalCost()+"\n");
		System.out.println(s);
		s.clear();
	}
}
