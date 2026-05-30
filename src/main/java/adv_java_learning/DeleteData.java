package adv_java_learning;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeleteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/adv_java_learning?user=postgres&password=root";;
			Connection connection = DriverManager.getConnection(url);
			String sql = "delete from employee_details where eid = 101;";
			Statement statement = connection.createStatement();
			statement.execute(sql);
			connection.close();
			System.out.println("Data deleted successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
