package day19_loops;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i = 1;
		
		//do {
		//System.out.println(i);
	//	i++;
		//}while(i<=10);
		
	//	1+2+3+4+5=15
		int sum =0;
		int j=1;
		
		do {
			sum=sum+j;//sum+=j same thing
			j++;
			}while(j<=5);
		System.out.println("Sum from 1 to 5"+sum);
	}

}