package week.one.day.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import db.factory.MyConnection;

public class JDBCDemo02 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;

		con = MyConnection.getConnection();

		try {
			st = con.createStatement();
			st.executeUpdate("create table emp2(eid int(3), ename varchar(20), esal float(8,2))");
			int rowsEffected = st.executeUpdate("insert into emp2 values(100,'SACHIN',999.99)");
			rowsEffected += st.executeUpdate("insert into emp2 values(101,'KOHLI',888.88)");
			rowsEffected += st.executeUpdate("insert into emp2 values(102,'DHONI',777.77)");
			System.out.println(rowsEffected + " rows effected.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
