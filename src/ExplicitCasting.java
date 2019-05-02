
public class ExplicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(10/2.0);// result is double because double is bigger value
		System.out.println(10.0/2.0);
		
		
		int result = (int)(10 / 2.0);
		
		
		int rent1 = 878;
	    int rent2 =3222;
	    int rent3 =1123;
	    int rent4 =555;
	    
	    double average = (double)(rent1+rent2+rent2+rent4) /4;
	    
	    System.out.println(average);
		
	    double d = 40.2;
	    int i = (byte)d;
	    
	    System.out.println("d: " + i);
	    
	    
	    
	}

}
