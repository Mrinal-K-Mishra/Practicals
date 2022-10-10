import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Updatjdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	//step no 1 register driver
			//get connection step no 2
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mrinaldb","root","root");
			Statement stmt = conn.createStatement();
			////executing updating query
			stmt.executeUpdate("update customer set Lname = 'Kumar'where cust_id='K04'");
			//executing inserting query
			stmt.executeUpdate("delete from customer where cust_id = 'K04'");
			//executing select query
			ResultSet rs = stmt.executeQuery("select*from customer"); 
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			//close database connection step no 5
			conn.close();
		}
		catch(Exception e) { 	//exception handling
			System.out.println(e);
		}	
	}
}