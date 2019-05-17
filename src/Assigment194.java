
public class Assigment194 {
	public static boolean isPalindrome(String check) {
		for (int i=0 , j=check.length()-1 ; i<j ; i++ , j-- ) {
			
            if ( check.toLowerCase().charAt(i) != check.toLowerCase().charAt(j) ) {
                return true;
            
            
        }

     
	  }
		return false;
	}
}
