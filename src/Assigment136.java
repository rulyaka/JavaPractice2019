import java.util.Scanner;

public class Assigment136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
	                            };
	    int result = 0;
	 int left=   matrix[0][0]+matrix[1][1]+matrix[2][2];
	 int right =  matrix[2][0]+matrix[1][1]+matrix[0][2];
	 result=left-right;
	    // FINAL PRINT
	    System.out.println(Math.abs(result));
	}

}
