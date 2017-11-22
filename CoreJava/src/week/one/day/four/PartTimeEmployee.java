package week.one.day.four;

public class PartTimeEmployee extends Employee{

	private double hoursWorked;

	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(int id, String name, String address, double hoursWorked) {
		super(id, name, address);
		this.hoursWorked = hoursWorked;
	}

	public double computeSalary() {
		double hourlySalary = 600;
		double salary = hoursWorked * hourlySalary;
		return salary + ((salary * 15) / 100); // Considering 15% bonus
	}

}
