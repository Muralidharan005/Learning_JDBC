package online_function_using;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FunctionCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://dpg-d8durlurnols739ohm20-a.oregon-postgres.render.com/learning_jdbc?user=learning_jdbc_user&password=om1JhQUBsccplwl2rqzN5BfVjLbmXKtp";
			Connection connection = DriverManager.getConnection(url);
			String sql = "select name_contains(?)";
			CallableStatement cs = connection.prepareCall(sql);
			cs.setString(1,"V");
			ResultSet rs = cs.executeQuery();
			rs.next();
			System.out.println("Count: "+rs.getInt(1));
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
