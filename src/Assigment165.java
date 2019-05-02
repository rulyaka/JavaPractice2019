
public class Assigment165 {
	public boolean getThunderBlazz(boolean available, boolean gift, int ingredient1, int ingredient2, int ingredient3) {

		if (available) {
			return true;
		}
		if (gift) {
			return true;
		}
		if ((ingredient1 == 1 || ingredient1 == 3) && (ingredient2 == 2 || ingredient2 == 1)
				&& (ingredient3 == 3 || ingredient3 == 2)) {

			return true;

		}

		return false;
	}
}
