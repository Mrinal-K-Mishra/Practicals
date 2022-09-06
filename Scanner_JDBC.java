package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

// insert data into database by user input

public class Scanner_JDBC {                   // main class
	public static void main(String[] args) {    // main method
		// create a scanner object
		Scanner scan = new Scanner(System.in);
		// taking input from user
		System.out.println("Enter cust_id: ");
		// read user input
		String cust_id = scan.next();
		// taking input from user
		System.out.println("Enter first name: ");
		// taking input from user
		String Fname = scan.next();
		// taking input from user
		System.out.println("Enter last name: ");
		// taking input from user
		String Lname = scan.next();
		
		// try block
		try {
			// register driver step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			// get connection step 2
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:7098/mrinal_database","root","mri@1996*08");
			// creating statement
			PreparedStatement stm;
			// inserting data in database
			stm = conn.prepareStatement("insert into customer values(?,?,?)");
			stm.setString(1, cust_id);
			stm.setString(2, Fname);
			stm.setString(3, Lname);
			// execute the data
			stm.execute();
			System.out.println("Inserted succesfully.");
		// catch block
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
