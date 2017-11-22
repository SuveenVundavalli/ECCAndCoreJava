package week.one.day.three;

public class PartTimeEmployee {

	private int id;
	private String name, address;
	private double hoursWorked;

	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(int id, String name, String address, double hoursWorked) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.hoursWorked = hoursWorked;
	}

	public double computeSalary() {
		double hourlySalary = 600;
		double salary = hoursWorked * hourlySalary;
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
