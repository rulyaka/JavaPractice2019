import java.util.Scanner;

public class Assigment120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    String[] str = {scan.next(), scan.next(), scan.next(), 
	                    scan.next(), scan.next(), scan.next()};
		
		
		String shortest = str[0];
	    for(int i = 0; i < 6;  i++) {
			// 	if longest length < words[i] length
				 // then words[i] become longest
				 if(shortest.length() >str[i].length()){
				   shortest=str[i];
		
		
	}
	    }
	    System.out.println(shortest);
}
}