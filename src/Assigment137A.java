import java.util.*;

public class Assigment137A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		int rows = inp.nextInt(), cols = inp.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				arr[i][j] = inp.nextInt();
			}
		}

		int longest = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (longest < arr[i][j]) {
					longest = arr[i][j];
					
					arr[i][j]=longest;
					
				}
		}
		 
		    

	}
		System.out.println(Arrays.deepToString(arr));
	}
}
