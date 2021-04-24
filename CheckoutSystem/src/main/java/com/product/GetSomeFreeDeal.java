package main.java.com.product;

public class GetSomeFreeDeal {
	static String deal;
	static int buyX, freeY;
	
	public GetSomeFreeDeal(String deal, int buyX, int freeY) {
		this.deal = deal;
		this.buyX = buyX;
		this.freeY = freeY;
	}

	public static String getDeal() {return deal;}
	public static int getX() {return buyX;}
	public static int getY() {return freeY;}
}
