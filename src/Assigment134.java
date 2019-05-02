import java.util.*;
public class Assigment134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[][] chessBoard = new String[8][8];
		 
		 for(int i =0; i<chessBoard.length; i++) {
			 for(char j ='a', k = 0; j<='h'; j++, k++) {
				 chessBoard[i][k] = (i+1)+""+j;
			 }
		 }
		 System.out.println(Arrays.deepToString(chessBoard));
		 
		 
		 
		 
		 
		 
		 
	}

}
