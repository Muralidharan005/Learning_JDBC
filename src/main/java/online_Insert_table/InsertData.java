package online_Insert_table;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://dpg-d8durlurnols739ohm20-a.oregon-postgres.render.com/learning_jdbc?user=learning_jdbc_user&password=om1JhQUBsccplwl2rqzN5BfVjLbmXKtp";
			Connection connection = DriverManager.getConnection(url);
			String sql = "insert into pg_name_list values(?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter id: ");
			ps.setInt(1, sc.nextInt());
			System.out.print("Enter name: ");
			ps.setString(2,sc.next());
			System.out.print("Enter Branch: ");
			ps.setString(3,sc.next());
			System.out.print("Enter MobileNo: ");
			ps.setLong(4, sc.nextLong());
			System.out.print("Enter Rent: ");
			ps.setDouble(5,sc.nextDouble());
			ps.execute();
			System.out.println("Data inserted Successfully");
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
