package main.java.com.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Product {
	public static List<String> skuArray = new ArrayList<>();
	public static String sku;
	
	static Checkout co;
	static Catalogue cata;
	static Double price;
	static ProductInitialize pi;
	
	public static void main(String[] args) {
		pi.ProductInitialize();
		
		Scanner sc = new Scanner(System.in);  
		System.out.print("SKUs Scanned: ");  
		String str = sc.nextLine(); 
		
		skuArray = Arrays.asList(str.split(", "));
		for (int i=0; i<skuArray.size(); i++) {
			co.scan(skuArray.get(i));
		}
		price = co.total();
		System.out.println("Total expected: $" + price); 
	}
	

}
