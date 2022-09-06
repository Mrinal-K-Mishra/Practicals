package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// inserting data into database

public class Insert_Jdbc {                 // main class
	public static void main(String[] args) {    // main method
		// try block
		try {
			// create a connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			// get connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:7098/mrinal_database","root","mri@1996*08");
			// create statement
			Statement stmt = conn.createStatement();
			// inserting data into database
			stmt.executeUpdate("insert into customer values('A07','Sayan','Roy')");
			System.out.println("Inserted succesfully.");
			// close the database
			conn.close();
		// catch block
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}



