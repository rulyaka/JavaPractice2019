package day46;

public class Customer {

	private String name;
	private String email;

	static int count; // shared by everyone/all objects, ONE CENTRAL COPY OF THIS VARIABLE

	public Customer() {

		name = "undenified";
		this.email = "undenified";
		count++;

	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}

	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
