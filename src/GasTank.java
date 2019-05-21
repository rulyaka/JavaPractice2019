
public class GasTank {
	double amount = 0;
	double capacity = 0;

	public GasTank(double i) {
		capacity = i;
	}

	public void addGas(double i) {
		amount += i;
		
		if (amount > capacity) {
			amount = capacity;
		}
		
	}
	public void useGas(double i) {
		amount-=i;
		if(amount<0) {
			amount= 0;
		}
	}
	public boolean isEmpty () {
		if(amount<0.1) {
			return true;
		}else {
			return false;
			
		}
	}
	public boolean isFull () {
		return amount > (capacity-0.1) ? true : false; 
	}
	public double getGasLevel() { 
		return amount; 
		}
	
	public double  fillUp() {
		double r = capacity - amount; 
		return r;
	}
}
