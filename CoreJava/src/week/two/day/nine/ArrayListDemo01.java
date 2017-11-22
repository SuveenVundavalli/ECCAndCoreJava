package week.two.day.nine;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo01 {

	public static void main(String[] args) {
		List<Customer> list = new ArrayList<Customer>();
		Customer customerOne = new Customer(1001, "Suveen", 50000);
		list.add(customerOne);
		Customer customerTwo = new Customer(1002, "Kumar", 50000);
		list.add(customerTwo);
		Customer customerThree = new Customer(1003, "Vundavalli", 50000);
		list.add(customerThree);
		
		for(Customer customer : list){
			System.out.println(customer);
		}
		
	}

}
