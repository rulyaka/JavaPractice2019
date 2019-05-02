import java.util.Scanner;

public class Assigment154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    isPalindrome(num);
	}
	public static void isPalindrome(int num){
	    //WRITE YOUR CODE HERE
	   String reverse="";
	   int reverse_number = 0;
       int original_number = num;
       while(num > 0) {
           int digit = num % 10;
           reverse_number = reverse_number * 10 + digit;
           num = num / 10;
       }
       if(original_number == reverse_number) {
           System.out.println(true);
       }else {
           System.out.println(false);
       }
   }
	     
	 
	    
}
