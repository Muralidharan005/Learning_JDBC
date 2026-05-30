package adv_java_learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AlterTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/adv_java_learning?user=postgres&password=root";
			Connection connection = DriverManager.getConnection(url);
			String sql = "alter table employee rename to employee_details";
			Statement statement = connection.createStatement();
			statement.execute(sql);
			connection.close();
			System.out.println("Table altered successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
