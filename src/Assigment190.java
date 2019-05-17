import java.util.ArrayList;

public class Assigment190 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums) {
		ArrayList<Integer> m = new ArrayList<>();
		int sum=0;
		for(int i=0;i<nums.size(); i++) {
			if(nums.get(i)>0) {
				m.add(nums.get(i));
				sum=sum+nums.get(i);
			}
		}
		m.add(sum);
		
		return m;
	}
}
