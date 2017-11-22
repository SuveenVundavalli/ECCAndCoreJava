package week.one.day.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.factory.MyConnection;

public class JDBCDemo03 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		con = MyConnection.getConnection();

		try {
			st = con.createStatement();
			rs = st.executeQuery("select * from emp2");
			while(rs.next()){
				System.out.println("----------------------------");
				System.out.println("Emp Id : "+rs.getInt(1));
				System.out.println("Emp Name : "+rs.getString(2));
				System.out.println("Emp Sal : "+rs.getDouble(3));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
