
public class Assigment168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(coverString("java methods", "me")); // java [me]thods
	}

	public static String coverString(String main, String coverME) {

//		  for(int i=0; i<=main.length(); i++) {
//			  for(int j=0; j<=coverME.length(); j++) {
//				main=i+"["+j+"]";
//					  
//				  }
//			  
//			  }
		return main.replace(coverME, "[" + coverME + "]");

	}

	public static String coverString2(String main, String coverME) {

		return main.contains(coverME) ? main.replace(coverME, "[" + coverME + "]") : main;

	}
}
