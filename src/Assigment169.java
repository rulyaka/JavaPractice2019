
public class Assigment169 {
	public static int wordCount(String words) {
	    
		 int count = 1;
	        for (int i=0;i<=words.length()-1;i++)
	        {
	            if (words.charAt(i) == ' ' && words.charAt(i+1)!=' ')
	            {
	                count++;
	            }
	        }
	        return count;
	    }
}