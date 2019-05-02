import java.util.Scanner;

public class Assigment97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
		int count1=0;
		int count2=0;
		
		  for(int i = 0; i<=sentence.length()-4;i++){
		      if(sentence.substring(i, i+4).equals("java")){
		        count1++;
		      
		      }
		    }
		  for(int i = 0; i<=sentence.length()-4;i++){
		      if(sentence.substring(i, i+6).equals("python")){
		        count2++;
		  
		      }
		      }
		  System.out.println(count1==count2);
	}

}
