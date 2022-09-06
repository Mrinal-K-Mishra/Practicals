package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// update the existing database

public class Update_JDBC {      // main class
	public static void main(String[] args) {      // main method
		// try block
		try {
			// create connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			// get connection step 2
			Connection conn = DriverManager.getConnection("jdbc:mysql:localhost:3507/jaita_database","root","adrika@1897*06");
			// create statement step 3
			Statement stmt = conn.createStatement();
			// updating an existing record
			stmt.executeUpdate("update customer set Lname = 'Roy' where cust_id = 'A08'");
			// delete and existing record
			stmt.executeUpdate("delete from customer where cust_id = 'A09'");
			// execute query fetch data from database
			ResultSet rs = stmt.executeQuery("SELECT * FROM jaita_database.customer;");
			// iteration
			while (rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			// close database connection
			conn.close();
		// catch block	
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
