package day36_WrapperClass;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // AUTOBOXING - PRIMITIVES TO OBJECT
		Integer num1 = 124;
		int n = 3;
		Integer num2 = n;

		// UNBOXING -- OBJECT TO PRIMITIVES
		Double d1 = new Double(34.2);
		double d2 = d1;
		System.out.println("d1 " + d2);
		
		
		long l1= new Long(222222222); // unboxing
		Long l2=new Long(23124L); //no boxing
		long l3 = l2;/// unnboxing
		
		Integer num3 = Integer.valueOf(345);
		// Double d3 = num3; casting is not possible
		
		
		
	}

}
