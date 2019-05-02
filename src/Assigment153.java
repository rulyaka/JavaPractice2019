import java.util.*;

public class Assigment153 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    String[] words = new String[size];
    for(int i=0; i < size; i++){
      words[i] = scan.next();
    }
    printUniqueWords(words);
  }
public static void printUniqueWords(String[] words){
    //WRITE YOUR CODE HERE
    Arrays.sort(words);
    
    for(int i=0; i<words.length; i++) {
    	if(!(words[i].contains(words[i+1]))) {
    		System.out.println(Arrays.toString(words));
    	}else {
    		System.out.println(false);
    	}
    }
  }

}
