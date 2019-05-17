package day40;

public class Employee {
	public String name;
	public String jobTitle;
	double salary;

	public void work() { // public means that you can use in diferent packeges
		System.out.println(name + " is working hard");
	}

	public void attendMeeting() {
		System.out.println(name + " is attending meeting");
	}

	public void introduce() {
		System.out.println("name " );
	}

	public static class Company {
		public static void main(String[] args) {
			Employee emp1 = new Employee();
			emp1.name = "Kate";
			emp1.jobTitle = "Deevloper";
			emp1.salary=11212;
			
			
			emp1.introduce();
			emp1.work();
			emp1.attendMeeting();
			
			emp1.jobTitle="team lead";
			emp1.salary=12123.123;
			
		}
	}

}
