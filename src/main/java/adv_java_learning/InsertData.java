package adv_java_learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/adv_java_learning?user=postgres&password=root";
			Connection connection = DriverManager.getConnection(url);
			String sql = "insert into employee_details values(101,'Rohit','BED',9987452103),(103,'Sam','FED',9874512036)";
			Statement statement = connection.createStatement();
			statement.execute(sql);
			connection.close();
			System.out.println("Data added successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
