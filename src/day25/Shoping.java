package day25;

public class Shoping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] products= {"Timberland shoes", "H&M Shirt","Swatch", "Adidas socks", "Shoes" };
		double[] prices= {120.0, 5.99, 150.50, 3000.5, 6.99};
		int[] itemsId= {1234,1235,1236,1237,1238};
		
		// loop through products and print them in separate times
		System.out.println("Products count: "+products.length);
		//check if products, prices and items have same count
		
		if(prices.length==products.length && products.length==itemsId.length) {
			System.out.println("Shoping list looks good");
		}else {
			System.out.println("Something is wrong");
			return;
		}
		for(String p :products) {
			System.out.println(p);
		}
		// prices --->>
		for(int i=0; i<products.length; i++) {
			System.out.println(prices[i]);
		}
		// reversed
		System.out.println(itemsId[ itemsId.length -1]);
		for(int idx = itemsId.length-1; idx>=0; idx--) {
			System.out.println(itemsId[idx]);
		}
	// print report. with a total price
		System.out.println("###########3 YOUR SHOPING RECEIPT############");
		double totalPrice=0.0;
		for(int i =0; i<prices.length; i++) {
			System.out.println("Item "+(i+1) + ": "+ itemsId[i]+ "-"+ ""+products[i] + "-$"+prices[i] );
			totalPrice+=prices[i];
		}
		System.out.println("Total price: $"+totalPrice);
		
		// find the most expensive item and print it as the report
		double maxPrice=0.0;
		int maxIndex=0;
		for(int j=0; j<=5; j++) {
			if(prices[j]>maxPrice) {
			maxPrice=prices[j];
			maxIndex = j;
			
		}

	}
System.out.println(itemsId[maxIndex]+"-"+products[maxIndex]+ " -$"+maxPrice);
}
}