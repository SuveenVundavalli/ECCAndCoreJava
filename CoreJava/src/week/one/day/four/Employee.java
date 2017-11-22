package week.one.day.four;

abstract public class Employee {
	private int id;
	private String name, address;

	public Employee() {
	}

	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void showDetails() {
		System.out.println("Emp Id : " + id);
		System.out.println("Emp name : " + name);
		System.out.println("Emp address : " + address);
		System.out.println("Emp gross salary : " + computeSalary());
	}

	abstract public double computeSalary();

	public void sendMessage() {
		System.out.println("Salary credited into your account");
	}

}
