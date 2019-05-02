import java.util.Scanner;

public class Assigment146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
	    String s = inp.next();
	    person(s) ;
	}
	public static void person(String info) 
	{
		
		if(info.contains(",")){
	           String[] arr = info.split(",");
	           if(arr.length<=2){
	  	    		System.out.println("person name: "+arr[0]+"last name:"+arr[1]+"age:"+arr[2]);
	  	    		
	          }
	}//end p
}
}