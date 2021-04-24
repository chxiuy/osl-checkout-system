package main.java.com.product;

public class BundleSell {
	static String buyProd, freeProd;
	
	public BundleSell(String buyProd, String freeProd) {
		this.buyProd = buyProd;
		this.freeProd = freeProd;
	}
	
	public static String getBuyProd() {return buyProd;}
	public static String getFreeProd() {return freeProd;}
}
