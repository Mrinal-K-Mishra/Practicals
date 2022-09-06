package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// simple JDBC demo

public class JDBC_Test {     // main class
	
	public static void main(String[] args) {    // main method
		// try block
		try {
			// register driver step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			// get connection step 2
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:7098/mrinal_database","root","mri@1996*08");
			// create statement step 3
			Statement stmt = conn.createStatement();
			// execute query fetch data from database step 4
			ResultSet rs = stmt.executeQuery("SELECT * FROM mrinal_database.employee;");
			// iteration
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			// close database connection step 5
			conn.close();
		
		// catch block
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
