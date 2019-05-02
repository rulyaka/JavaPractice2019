
public class Assigment164 {
	public boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
		if (isAvailable) {
			if (month == 7 && day >= 1 && day <= 8 && year == 2018) {
				return false;
			}
			return true;
		}
		return false;
	}
}
