package week.one.day.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import db.factory.MyConnection;

public class JDBCDemo01 {

	public static void main(String[] args) {
		Connection con = MyConnection.getConnection();

		if (con != null)
			System.out.println("Connection Success....");

	}

}
