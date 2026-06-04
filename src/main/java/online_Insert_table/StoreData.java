package online_Insert_table;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://dpg-d8durlurnols739ohm20-a.oregon-postgres.render.com/learning_jdbc?user=learning_jdbc_user&password=om1JhQUBsccplwl2rqzN5BfVjLbmXKtp";
			Connection connection = DriverManager.getConnection(url);
			String sql = "call store_pg_data(?,?,?,?,?)";
			CallableStatement cs = connection.prepareCall(sql);
			Scanner sc = new Scanner(System.in);
			cs.setInt(1, sc.nextInt());
			cs.setString(2,sc.next());
			cs.setString(3, sc.next());
			cs.setLong(4,sc.nextLong());
			cs.setDouble(5,sc.nextDouble());
			cs.execute();
			System.out.println("Data Saved");
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
