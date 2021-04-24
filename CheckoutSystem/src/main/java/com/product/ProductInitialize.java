package main.java.com.product;

public class ProductInitialize {
	private static Catalogue cata = new Catalogue();
	private static GetSomeFreeDeal deal;
	private static BulkDiscount bulk;
	private static BundleSell bundle;
	

	public static void ProductInitialize() {
		//Add or Change Goods in Here
		cata.Catalogue("ipd","Super iPad",549.99);
		cata.Catalogue("mbp","Macbook Pro",1399.99);
		cata.Catalogue("atv","Apple TV",109.5);
		cata.Catalogue("vga","VGA adapter",30.00);
		
		//Change Discount Details Here
		deal = new GetSomeFreeDeal("atv",3,2);
		bulk = new BulkDiscount("ipd",4,499.99);
		bundle = new BundleSell("mbp","vga");
		
	}
	

}
