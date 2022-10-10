import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insertedjdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	//step no 1 register driver
			//get connection step no 2
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mrinaldb","root","root");
			Statement stmt = conn.createStatement(); //create statement
			//inserting data into database table
			stmt.executeUpdate("insert into customer values(10,'Manish','Malhotra')");
			System.out.println("inserted succesfully...");
			conn.close();	//close database connection step no 5
		}
		catch (Exception e) {	//exception handling
			System.out.println(e);
		}
	}

}