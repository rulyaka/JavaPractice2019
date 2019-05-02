package day13_ternary_strings_intro;

public class moreTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String quality = "bad";
		int rating =(quality.equals("good" ))? 100: 0;
		
		System.out.println("Rating "+ rating);
		
		int PMHour = 6;
		
		boolean rushHour = (PMHour >= 4 && PMHour <= 7)? true: false;
		System.out.println(PMHour + " is rush hour? "+rushHour);
		
			String result = (rushHour)? "Yes": "No";
		
			int AMHour = 8; // 6 - 9
			String amRushHour = (AMHour >= 6 && AMHour <= 9)? "yes": "No";
			
			System.out.println(AMHour + " is rush hour? - "+ amRushHour);
		
		
			
	
	}

}
