package ClasswithVasya;

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int season=scan.nextInt();
		
		if(season>=1 && season<=2 || season == 12) {
			System.out.println("Winter");
		}else if(season>=3 && season<=5) {
			System.out.println("Spring");
		}else if(season>=6 && season<=8) {
			System.out.println("Summer");
		}else if(season>=9 && season<=11) {
			System.out.println("Winter");
		}else {
			
		}
	}

}
