package day36_WrapperClass;

import java.util.ArrayList;

public class ArraysListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// declare araylist called languages
	
		ArrayList<String> languages = new ArrayList<>();

		languages.add("Ukraine");
		languages.add("russian");
		languages.add("French");
		languages.add("turkish");
		
		//System.out.println("Number of values: "+languages.size());
		
		
		languages.add("French");
		System.out.println("Number of values: "+languages.size());//
		
		// remove something
		languages.remove(2);
		System.out.println("Number of values: "+ languages.size());
		
		System.out.println(languages.toString()); // will print all of them one by  one
	}

}
