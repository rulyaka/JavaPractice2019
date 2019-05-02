package day20_forLoop;

public class indexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Amazon";
		char letter = 'm';
		int index = -1;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == letter)
				index = i;
			break;
		}

		System.out.println(index);
	}

}
