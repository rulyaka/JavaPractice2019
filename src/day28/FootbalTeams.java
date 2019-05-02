package day28;

import java.util.Arrays;

public class FootbalTeams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// declare MultiD array with 2 rows and 6 colons
		String[][] teams = new String[2][6];

		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";

		teams[1][0] = "Olmjon";
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roman";
		teams[1][5] = "Dmitriy";
		System.out.println("First player of first team:");
		System.out.println(teams[0][0]);
		System.out.println(teams[0][3]);
		System.out.println(teams[1][5]);

		// print how many rows/teams/arrays
		System.out.println("Number of rows: " + teams.length);
		System.out.println("People of in first team " + teams[0].length);// how many people in the first team
		System.out.println("People of in second team " + teams[1].length);

		System.out.println(Arrays.deepToString(teams));

		int[][] nums = new int[3][4];

		nums[0][0] = 100;
		nums[0][1] = 1222;
		nums[0][2] = 1111;
		nums[0][3] = 12242;

		nums[1][0] = 12232;
		nums[1][1] = 122442;
		nums[1][2] = 12232;
		nums[1][3] = 122442;

		nums[2][0] = 122992;
		nums[2][1] = 12202;
		nums[2][2] = 127722;
		nums[2][3] = 1255522;

		System.out.println(Arrays.deepToString(nums));
		System.out.println(Arrays.toString(nums[0]));
		
		
		//                    0            1
		int [][] scores = { {3,5,10,}, {6,4,2,10}};
		
		System.out.println("Days played: "+scores.length);
		System.out.println("Number of values in 1: "+scores[0].length);
		System.out.println("Number of values in 2: "+scores[1].length);
		
		
		int[][] values=new int[4][];
		
		values[0]= new int[] {34,34,44};
		values[1]= new int[] {24,44,4,4,44,2,245,562,};
		
		values[2]= new int[2];
		values[2][0]=55;
		values[2][1]=545;
		
		values[3]= new int[] {5,55,55,522,556};
		
		System.out.println(Arrays.deepToString(values));
		
	}

}
