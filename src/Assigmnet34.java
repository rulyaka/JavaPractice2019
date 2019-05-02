import java.util.*;
public class Assigmnet34 {
public static void main(String[] args) {
	
	int coupons, gumball, candies;
    gumball = 3;
    candies = 10;
    
    
    
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter number of coupons: ");
	coupons = scan.nextInt();
	

	int numCandy = coupons/10;
	int leftCandy = coupons%10;
	int numGum = leftCandy/3;
	
	

	if(coupons < 3){
		System.out.println("Not enough coupons");
	}else{
		System.out.println("Number of Candies: " + numCandy);
		System.out.println("Number of Gumballs: "+numGum );
	}
	
	
}
}
