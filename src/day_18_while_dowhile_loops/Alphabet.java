package day_18_while_dowhile_loops;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char letter = 'a';
		while (letter <= 'z') {
			System.out.print(letter + " ");
			letter++;

		}
		char reverse = 'z';
		while (reverse >= 'a') {
			System.out.print(reverse + " ");
			reverse--;
		}
		System.out.println();
		
		
		{String letters = "";
			char myLetter = 'A';
			
			while (myLetter <= 'Z')
				letters = letters + myLetter;
			System.out.println(letters);
			myLetter++;
		}

		
	}

}
