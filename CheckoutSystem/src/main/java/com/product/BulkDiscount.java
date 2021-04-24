package main.java.com.product;

public class BulkDiscount {
	static String bulk;
	static int bulkNum;
	static Double bulkPrice;
	
	public BulkDiscount(String bulk, int bulkNum, Double bulkPrice) {
		this.bulk = bulk;
		this.bulkNum = bulkNum;
		this.bulkPrice = bulkPrice;
	}
	
	public static String getBulk() {return bulk;}
	public static int getBulkNum() {return bulkNum;}
	public static Double getBulkPrice() {return bulkPrice;}
	
}
