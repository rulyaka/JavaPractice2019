package day_26;

import java.util.*;

public class names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William",
				"Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles",
				"Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald",
				"Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth",
				"Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa", "Edward",
				"Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen", "Ryan",
				"Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley", "Stephen",
				"Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela", "Brandon",
				"Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond", "Catherine",
				"Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis", "Emma",
				"Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie", "Douglas",
				"Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly", "Walter",
				"Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith", "Gerald",
				"Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence", "Jean",
				"Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe", "Kathryn",
				"Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie", "Bruce",
				"Julia", "Noah", "Grace", "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy", "Beverly",
				"Alan", "Denise", "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel", "Rose", "Louis",
				"Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip", "Jane", "Logan",
				"Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla" };
		System.out.println(names.length);

		System.out.println(Arrays.toString(names));

		for (int i = 0; i < names.length; i += 2) {

			System.out.println(names[i] + " " + names[i + 1]);

		}
		System.out.println("Male names: ");
		for (int j = 0; j < names.length; j += 2) {
			System.out.println(names[j] = " ");
		}
		System.out.println("\nFEMALE NAMES:");
		for (int idx = 0; idx < names.length; idx++) {
			if (idx % 2 != 0) {
				if (idx == names.length - 1) {
					System.out.print(names[idx]);
				} else {
					System.out.print(names[idx] + ", ");
				}

			}
		}
		System.out.println("\nRandom name:");
		Random random = new Random();
		int r = random.nextInt(names.length);
		System.out.println("Random name: " + names[r]);

		for (String name : names)
			if (names.length <= 4) {
				System.out.print(name.toUpperCase() + ", ");
			}
		String namesUpto4 = "";
		String name5to6 = "";
		String name7toMore="";

		System.out.println("\nNames");
		for (String name : names) {
			if (name.length() <= 4) {
				namesUpto4 += name + ", ";
			} else if (name.length() == 5 || name.length() == 6) {
				name5to6+=name + ", ";
			}else {
				name7toMore+=name+", ";
			}
				System.out.println("namesUpto4: "+ namesUpto4);
				System.out.println("name5to6: "+ name5to6);
				System.out.println("name7toMore: "+ name7toMore);
		}
				
				
				
				
		for(int i = 0; i < names.length; i+=2) {
			String temp = names[i];
			names[i] = names[i+1];
			names[i+1] = temp;	
		}
		System.out.println(Arrays.toString(names));
		
		
		String str1 = "first word";
		String str2 = "second word";
		
		String temp = str1;
		str1 = str2;
		str2 = temp;
		
		System.out.println("str1 - " + str1);
		System.out.println("str2 - " + str2);

	}
}