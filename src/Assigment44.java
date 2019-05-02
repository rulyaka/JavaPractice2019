import java.util.*;
public class Assigment44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		
		
		 int house = s.nextInt();
		 int player = s.nextInt();

		if(player>21) {
			System.out.println("bust");
			
		}else if(player < house) {
			System.out.println("player loss");
		}else if(player == house ) {
			System.out.println("its a tie");
		}else if(player > house) {
			System.out.println(" player wins");
		}
		
		
		
		
		
		
		
		
	}

}
