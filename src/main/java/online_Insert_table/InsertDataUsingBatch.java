package online_Insert_table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDataUsingBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://dpg-d8durlurnols739ohm20-a.oregon-postgres.render.com/learning_jdbc?user=learning_jdbc_user&password=om1JhQUBsccplwl2rqzN5BfVjLbmXKtp";
			Connection connection = DriverManager.getConnection(url);
			String sql = "insert into pg_name_list values(?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, 106);
			ps.setString(2,"Ashwin");
			ps.setString(3,"Vadapalani");
			ps.setLong(4,9342418810L);
			ps.setDouble(5,7750);
			ps.addBatch();
			ps.setInt(1, 107);
			ps.setString(2,"Kiruba");
			ps.setString(3,"Vadapalani");
			ps.setLong(4,9344205602L);
			ps.setDouble(5,7700);
			ps.addBatch();
			ps.setInt(1, 108);
			ps.setString(2,"Naveen");
			ps.setString(3,"Vadapalani");
			ps.setLong(4,7397114035L);
			ps.setDouble(5,7650);
			ps.addBatch();
			ps.executeBatch();
			System.out.println("Data saved successfully");
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
