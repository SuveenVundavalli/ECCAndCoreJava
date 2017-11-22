package week.one.day.three;

public class FullTimeEmployee {

	private int id;
	private String name, address;
	private double salary;

	public FullTimeEmployee() {
		super();
	}

	public FullTimeEmployee(int id, String name, String address, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public double computeSalary() {
		return salary + ((salary * 15) / 100); // Considering 15% bonus
	}

	public void showDetails() {
		System.out.println("Emp Id : " + id);
		System.out.println("Emp name : " + name);
		System.out.println("Emp address : " + address);
		System.out.println("Emp gross salary : " + computeSalary());
	}

	public void sendMessage() {
		System.out.println("Salary credited into your account");
	}

}
