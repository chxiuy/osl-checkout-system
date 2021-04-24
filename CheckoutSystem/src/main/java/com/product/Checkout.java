package main.java.com.product;

public class Checkout {
	private static Double tdlPrice = 0.0;
	private static Double dealpPrice = 0.0;
	private static Double bulkDealPrice = 0.0;
	private static Double bundlePrice = 0.0;
	private static Double noDisPrice = 0.0;
	private static Double bundleFreePrice = 0.0;
	private static Double priceBundleFree = 0.0;
	private static Double bulkPrice = 0.0;
	private static int dealCount = 0;
	private static int bulkCount = 0;
	private static int bundleFreeCount = 0;
	private static int bundleBuyCount = 0;
	private static int count = 0;

	static Catalogue cata;
	static GetSomeFreeDeal deal;
	static BulkDiscount bulk;
	static BundleSell bundle;
	
	public static void scan(String item) {
		for (int i=0;i < cata.skuList.size(); i++) {  
			if (item.equals(cata.skuList.get(i))) {
				if(item.equals(deal.getDeal())) {  //Check Buy X Get Free Y Discount
					dealCount++;
					if(dealCount % deal.getX() == 0 ) {
						count++;
					}
					dealpPrice = (dealCount-count)*cata.priceList.get(i);
				}
				else if (item.equals(bulk.getBulk())) {  //Check Bulk Discount
					bulkCount++;
					if (bulkCount > bulk.getBulkNum()) {
						bulkPrice = bulk.getBulkPrice();
					}
					else {
						bulkPrice = cata.priceList.get(i);
					}
					bulkDealPrice = bulkCount*bulkPrice;
				}
				else if (item.equals(bundle.getBuyProd())) { //Check Bundle Discount
					bundleBuyCount++;
					bundlePrice = bundleBuyCount*cata.priceList.get(i);
				}
				else {
					noDisPrice += cata.priceList.get(i);
				}
				if (item.equals(bundle.getFreeProd())) { //Check Free Bundle
					bundleFreeCount++;
					priceBundleFree = cata.priceList.get(i);
				}
				if(bundleBuyCount > 0) { //Minus Free Bundle
					if (bundleFreeCount > bundleBuyCount ) {
						bundleFreePrice = (bundleFreeCount - bundleBuyCount)*priceBundleFree;
					}
					else if (bundleFreeCount == bundleBuyCount) {
						bundleFreePrice = bundleFreeCount*priceBundleFree;
					}
				}
				tdlPrice = dealpPrice + bulkDealPrice + bundlePrice + noDisPrice - bundleFreePrice;
			}
		}
	}
	

	public static Double total() {
		return tdlPrice;
	}
}
