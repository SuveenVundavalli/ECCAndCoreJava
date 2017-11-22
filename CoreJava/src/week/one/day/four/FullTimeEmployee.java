package week.one.day.four;

public class FullTimeEmployee extends Employee{

	
	private double salary;

	public FullTimeEmployee() {
		super();
	}

	public FullTimeEmployee(int id, String name, String address, double salary) {
		super(id,name,address);
		this.salary = salary;
	}

	public double computeSalary() {
		return salary + ((salary * 15) / 100); // Considering 15% bonus
	}


	

}
