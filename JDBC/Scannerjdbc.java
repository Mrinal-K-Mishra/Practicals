import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Scannerjdbc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter fname");
		String Fname = s.next();
		System.out.println("Enter Lname");
		String Lname = s.next();
		System.out.println("Enter cust_id");
		String cust_id = s.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	//step no 1 register driver
			//get connection step no 2
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mrinaldb","root","root");
			//creating statement
			PreparedStatement stm;
			//inserting data in database table
			String sql = "insert into customer values(?,?,?)";
			stm = conn.prepareStatement(sql);
			stm.setString(2, Fname);
			stm.setString(3, Lname);
			stm.setString(1, cust_id);
			stm.execute();
			System.out.println("inserted succesfully");
		}
		catch (Exception e) {	//exception handling
			System.out.println(e);
		}
	}
}