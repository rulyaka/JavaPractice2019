package day15;

public class ReplaceThem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Coding is fun, it is my hobby!";
		String withNoSpacec = sentence.replace(" ", "");
		System.out.println(withNoSpacec);

		System.out.println(sentence);

		sentence = sentence.replace(",", "!!!");
		System.out.println(sentence);

		String mixed = "!@#!@#^@$#&!@java-&%|%&%";
		// mixed = mixed.replace("!@#!@#^@$#&!@java-&%|%&%", "java");
		System.out.println(mixed);

		mixed = mixed.replace("$", "");
		mixed = mixed.replace("-", "");

		mixed = mixed.replace("$", "").replace("-", "").replace("|", "");

		mixed = mixed.replace("a", "");
		System.out.println(mixed);

		String result = "About 95,000,000 results (0.61 seconds)";
		// result = result.replace("About ", "").replace(" results ", "");
		// System.out.println(result);
		// result = result.replace("About 95,000,000 results (0.61 seconds)", "
		// 95,000,000");
		// System.out.println(result);

		// result = result.replace("About ", "");
		// result = result.replace(" results (0.61 seconds)","");

		System.out.println(result);
                       //cut         // where to cut
		result = result.substring(0, result.indexOf(" "));// finds first letter or number starts from there and ends ""
															
		System.out.println(result);
		result = result.replaceFirst(",", "");
		System.out.println(result);
		
		
	}
}