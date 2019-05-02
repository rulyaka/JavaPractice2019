import java.util.Scanner;

public class Assigment108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
		
	    String[] arr = email.split(" ");
	    
	    for(int i = 0; i<=email.length();i++) {
	    	if(arr[0] != null) {
	    		System.out.println("Email id: "+arr[0]);
	    	}else if(arr[1] != null) {
	    		System.out.println("Email domain: "+arr[1]);
	    	}else if(email.contains("@")){
	    		System.out.println("invalid email");
	    	}
	    }
	    
	    
	}

}
