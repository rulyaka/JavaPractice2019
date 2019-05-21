package day46;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		System.out.println("Company name: " + Company.cname);
		System.out.println("Company name: " + Company.cname.toUpperCase());

		Company c = new Company();
		System.out.println(c.cname);

		c.companyInfo();
		Company.companyInfo();
		System.out.println(Math.round(123.12444));

	}

}
