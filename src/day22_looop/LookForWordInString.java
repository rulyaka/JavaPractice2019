package day22_looop;

public class LookForWordInString {
public static void main(String[] args) {
        
        String sentence = "He said hi, then she replied hi. hi guys!";
        
        // print letters in pairs
        //He
        //e
        // s
        //ai 
        // check if temp equals "hi", if true, add 1 to count
        int count = 0;
        for (int i = 0; i < sentence.length()-1; i++) {
            String temp = sentence.substring(i, i+2);// 2 letters
            //System.out.println(temp);
            if(temp.equals("hi")) {
                count++;
            }
        
        }
        // Count: 3 
        System.out.println("Count: "+ count);
        
        
        
        
        
        
    }
}
