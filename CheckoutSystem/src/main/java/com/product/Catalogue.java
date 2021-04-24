package main.java.com.product;

import java.util.ArrayList;
import java.util.List;


public class Catalogue {
	static List<String> skuList = new ArrayList <String>();
	static List<String> nameList = new ArrayList <String>();
	static List<Double> priceList = new ArrayList <Double>();
	

	public void Catalogue(String sku, String name, Double price) {
		skuList.add(sku);
		nameList.add(name);
		priceList.add(price);
	}
	

}
