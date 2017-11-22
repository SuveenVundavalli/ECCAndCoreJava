package week.one.day.four;

public class EmployeeDemo01 {

	public static void main(String[] args) {
		
		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(100, "Suveen", "Gachibowli, Hyderabad", 40000);
		fullTimeEmployee.showDetails();
		fullTimeEmployee.sendMessage();
		System.out.println();
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee(101, "Sriram", "Uppal, Hyderabad", 10);
		partTimeEmployee.showDetails();
		partTimeEmployee.sendMessage();
	}

}
