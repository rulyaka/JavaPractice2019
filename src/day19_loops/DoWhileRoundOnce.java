package day19_loops;

public class DoWhileRoundOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10;//<<<<< NEEDS TO BE OUTSIDE!!

		
		do {
			System.out.println("count: "+count);
			count++;
			
		}while(count<=5);  // IT WILL RUN THE CODE AT LEAST ONCE AT THEN CHECKS THE CONDITION IF ITS FALSE IT WILL EXIT
		
	}

}
