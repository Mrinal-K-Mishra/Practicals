import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbctest {

	public static void main(String[] args) {
		try {
			//register driver step no 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection step no 2
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mrinaldb","root","root");
			//create statement step no 3
			Statement stmt = conn.createStatement();
			//execute query fetch data from database step no 4
			ResultSet rs = stmt.executeQuery("select*from EmployeeDemo1");
			//iteration
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(5)+" "+rs.getString(4)+" "+rs.getString(5));
			}
			//close database connection step no 5
			conn.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}