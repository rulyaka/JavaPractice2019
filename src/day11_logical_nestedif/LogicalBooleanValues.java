package day11_logical_nestedif;

public class LogicalBooleanValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b1 = 50 > 10 && 10 > 100;
		System.out.println("B1 "+ b1);
		
		boolean b2 = 'a' == 'a' &&  123 > 120;
		System.out.println("B2 "+ b2);
		
		boolean b3 = true && 10 >= 10 && 1000 <= 900;
		System.out.println("B3: "+b3);
		
		boolean b4 = false && false && 10 == 10;
		System.out.println("B4: "+b4);
		
		boolean b5 = false || true && 10 == 10; // true
		System.out.println("B5: "+b4);
		
		boolean b6 = false || true && 10 == 10; // // true
		System.out.println("B6: "+b6);
		
		
		boolean b11 = true;
		System.out.println(!!!!!!!!!!!b11);//  reversing boolean from right to left
		
		
		
	}

}
