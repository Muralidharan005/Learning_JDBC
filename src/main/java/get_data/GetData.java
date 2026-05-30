package get_data;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/adv_java_learning?user=postgres&password=root";
			Connection connection = DriverManager.getConnection(url);
			String sql = "select * from employee_details";
			Statement statement = connection.createStatement();
			statement.execute(sql);
			ResultSet rs = statement.getResultSet();
			System.out.println("eid\tename\tjob\tmobile");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
			}
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
