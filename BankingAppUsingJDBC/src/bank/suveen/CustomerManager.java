package bank.suveen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db.factory.DBConnection;

public class CustomerManager {

	public int addCustomer(String name, double balance) {
		Connection con = DBConnection.getConnection();
		PreparedStatement smt = null;
		int rowsEffected = 0;
		ResultSet rs = null;
		int id = 0;
		try {
			rs = con.createStatement().executeQuery("select max(id) from BankCustomers");
			while (rs.next())
				id = rs.getInt(1) + 1;
			if(id == 1) {
				id = 101;
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Customer customer = new Customer(id, name, balance);
		try {
			smt = con.prepareStatement("insert into BankCustomers values(?,?,?)");
			smt.setInt(1, customer.getId());
			smt.setString(2, customer.getName());
			smt.setDouble(3, customer.getBalance());
			rowsEffected = smt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (rowsEffected == 1) {
			return customer.getId();
		}
		return -1;
	}

	public Customer displayCustomer(int id) {
		Customer customer = new Customer();
		Connection con = DBConnection.getConnection();
		PreparedStatement smt = null;
		ResultSet rs = null;
		try {
			smt = con.prepareStatement("Select * from BankCustomers where id = ?");
			smt.setInt(1, id);
			rs = smt.executeQuery();
			while (rs.next()) {
				customer.setId(rs.getInt(1));
				customer.setName(rs.getString(2));
				customer.setBalance(rs.getDouble(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (customer.getId() != 0)
			return customer;

		return null;
	}

	public ArrayList<Customer> getAllCustomers() {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Customer customer = null;
		Statement smt = DBConnection.getStatement();
		ResultSet rs = null;

		try {
			rs = smt.executeQuery("select * from BankCustomers");
			while (rs.next()) {
				customer = new Customer();
				customer.setId(rs.getInt(1));
				customer.setName(rs.getString(2));
				customer.setBalance(rs.getDouble(3));
				customerList.add(customer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return customerList;
	}

	public Customer depositAmount(Customer customer, double amount) {
		//Customer customer = displayCustomer(id);
		PreparedStatement smt = null;
		try {
			smt = DBConnection.getConnection().prepareStatement("update BankCustomers set balance = ? where id = ?");
			smt.setDouble(1, (customer.getBalance() + amount));
			smt.setInt(2, customer.getId());
			smt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		customer = displayCustomer(customer.getId());
		return customer;
	}

	public Customer withdrawAmount(Customer customer, double amount) {
		//Customer customer = displayCustomer(id);
		PreparedStatement smt = null;
		if (customer.getBalance() > amount) {
			try {
				smt = DBConnection.getConnection()
						.prepareStatement("update BankCustomers set balance = ? where id = ?");
				smt.setDouble(1, (customer.getBalance() - amount));
				smt.setInt(2, customer.getId());
				smt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			customer = displayCustomer(customer.getId());
			return customer;
		} else
			return null;

	}

	public String transferAmount(Customer customer, Customer txCustomer, double amount) {
		if(withdrawAmount(customer, amount) != null) {
			depositAmount(txCustomer, amount);
			return "transfer successfull";
		} else {
			return "Insuffecient balance in transferer account!";
		}
	}

}
