import java.util.*;
public class Assigment116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int years=0;
          int cm=1;
          int treeSize = 0;
		for(years=1; years<=10; years++) {
			if(years>3) {
				cm =2;
			}
			treeSize=treeSize+cm;
			System.out.println("year "+years+" - growth "+cm+" cm");
			cm=1;
		}
		System.out.println("tree size: "+treeSize);
	}

}
