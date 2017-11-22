package bank.abc;

import java.util.ArrayList;

public class CustomerManager {
	private ArrayList<Customer> customersList = new ArrayList();

	public int addCustomer(String name, double balance) {
		Customer customer = new Customer(name, balance);
		customersList.add(customer);
		return customer.getId();
	}

	public Customer displayCustomer(int id) {
		for (Customer cust : customersList) {
			if (cust.getId() == id) {
				return cust;
			}
		}
		return null;
	}

	public ArrayList<Customer> getAllCustomers() {
		return customersList;
	}

	public Customer depositAmount(int id, double amount) {
		for (Customer cust : customersList) {
			if (cust.getId() == id) {
				cust.setBalance(cust.getBalance() + amount);
				return cust;
			}
		}
		return null;
	}

	public Customer withdrawAmount(int id, double amount) {
		for (Customer cust : customersList) {
			if (cust.getId() == id) {
				if (cust.getBalance() >= amount + 1000) {
					cust.setBalance(cust.getBalance() - amount);
					return cust;
				} else
					break;
			}
		}
		return null;
	}

	public String transferAmount(int id, int trId, double amount) {

		for (Customer cust : customersList) {
			if (cust.getId() == id) {
				if (cust.getBalance() >= amount + 1000)
					for (Customer tran : customersList) {
						if (tran.getId() == trId) {
							cust.setBalance(cust.getBalance()-amount);
							tran.setBalance(tran.getBalance()+amount);
							return "Transfer successful...";
						}
					}
				else
					return "Balance not suffecient";
			}
		}

		return "Transaction failed...";
	}

}
