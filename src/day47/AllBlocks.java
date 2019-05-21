package day47;

public class AllBlocks {
	int nonStaticInt = 10;
	static int staticInt = 10;

	static {
		System.out.println("static block - I run first and only once");
		staticInt--;
	}

	{
		System.out.println("Init Block - i run each time object is created Before constructor");
		nonStaticInt += 5;
		staticInt+=5;
	}

	public AllBlocks() {
		System.out.println("Constructor - I run each time object is created after init bl");
	}
}
