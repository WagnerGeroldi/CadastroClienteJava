package application;

public class Client {

	public String name;
	public String email;
	public String address;
	public float salary;
	protected double document;

	public Client() {

	}

	public Client(String name, String email, String address, float salary, double document) {

		this.name = name;
		this.email = email;
		this.address = address;
		this.salary = salary;
		this.document = document;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public double getDocument() {
		return document;
	}

	public void setDocument(double document) {
		this.document = document;
	}

}
