package online_create_table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			String url ="jdbc:postgresql://dpg-d8durlurnols739ohm20-a.oregon-postgres.render.com/learning_jdbc";
			String user = "learning_jdbc_user";
			String password = "om1JhQUBsccplwl2rqzN5BfVjLbmXKtp";
			Connection connection = DriverManager.getConnection(url,user,password);
			String sql = "create table pg_name_list(id integer primary key,name character varying,branch character varying,mobile_no bigint,rent double precision)";
			Statement statement = connection.createStatement();
			statement.execute(sql);
			connection.close();
			System.out.println("Table created successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}