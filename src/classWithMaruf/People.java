package classWithMaruf;

public class People {
	String hardToGet = "Nursultan";
	static String easyToGet = "Muhtar"; // IN CLASS CallPeople you can call it without creating the object cause is Static
										

	public void sayMyName() {
		System.out.println(hardToGet);
	}

	public static void whatMyName() {
		System.out.println(easyToGet);
	}
}
