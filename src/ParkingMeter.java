
public class ParkingMeter {

	int timeLeft = 0;
	int maxTime = 0;

	public ParkingMeter(int maxTime) {
		this.maxTime = maxTime;
	}

	public boolean add(int value) {

		if (value == 25) {
			timeLeft = timeLeft + 30;
			return true;

		} else {
			return false;
		}

	}

	public void tick() {
		if (timeLeft > 0) {
			timeLeft--;
		}
	}

	public boolean isExpired() {
		if (timeLeft == 0) {
			return true;
		} else {
			return false;
		}
	}
}
