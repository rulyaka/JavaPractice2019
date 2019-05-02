
public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers= {421, 235, 435, 64, 547 , 63, 54, 845, 4};
		double[] doubleNumbers= {123,22,2,233,2,1214,4};
	
		int m = findMin(numbers);
		double m2 = findMin(doubleNumbers);
		
		System.out.println(m);
		System.out.println(m2);
		
		
		
		
		
	}
public static int findMin(int[] arr) {
	
	

	int min= arr[0];
	for(int i: arr) {
		if(i < min) {
			min = i;
		}

	}
	return min;
	
}
public static double findMin(double [] arr) {
	
	

	double min= arr[0];
	for(double i: arr) {
		if(i < min) {
			min = i;
		}

	}
	return min;
	
}
}
