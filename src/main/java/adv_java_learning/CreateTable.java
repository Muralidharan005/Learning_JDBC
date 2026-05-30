package adv_java_learning;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateTable {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/adv_java_learning?user=postgres&password=root";
			Connection connection = DriverManager.getConnection(url);
			String sql = "create table employee(eid integer primary key,ename character varying,job character varying,mobile bigint)";
			Statement statement = connection.createStatement();
			statement.execute(sql);
			connection.close();
			System.out.println("Table created Successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub

	}

}
