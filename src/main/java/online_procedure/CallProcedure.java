package online_procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallProcedure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://dpg-d8durlurnols739ohm20-a.oregon-postgres.render.com/learning_jdbc?user=learning_jdbc_user&password=om1JhQUBsccplwl2rqzN5BfVjLbmXKtp";
			Connection connection = DriverManager.getConnection(url);
			String sql = "call get_price(?)";
			CallableStatement cs = connection.prepareCall(sql);
			cs.setInt(1, 0);
			cs.registerOutParameter(1,Types.INTEGER);
			cs.execute();
			System.out.println("Price: "+cs.getInt(1));
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
