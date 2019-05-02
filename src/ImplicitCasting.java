
public class ImplicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  automatic casting from smaller to larger
		
		short shortValue = 3433;
		  //           optional
		int intValue = (int)shortValue;
		
		System.out.println("intvalue: " + intValue);
		
		double price = 232;
		System.out.println("Price: "+ price);
		
		int price1 = 2324;
		double dPrice = price1;
		System.out.println("dPrice after casting: " + dPrice);
		
	}

}
