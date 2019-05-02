package day13_ternary_strings_intro;

public class TERNARY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String RESULT;
		int score = 78;
		
		if(score > 60) {
			RESULT = "pass";		
		}else {
			RESULT = "fail";		
	}
		System.out.println("Result is : "+ RESULT);
		
		RESULT = score > 60 ? "pass" : "failed";
	     System.out.println("Result is : "+ RESULT);
	}

}
