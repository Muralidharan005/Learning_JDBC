package givedata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GiveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/adv_java_learning?user=postgres&password=root";
			Connection connection = DriverManager.getConnection(url);
			String sql = "insert into employee_details values(?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			Scanner sc = new Scanner (System.in);
			System.out.print("Enter id: ");
			ps.setInt(1, sc.nextInt());
			System.out.print("Enter name: ");
			ps.setString(2,sc.next());
			System.out.print("Enter job: ");
			ps.setString(3, sc.next());
			System.out.print("Enter mobile no: ");
			ps.setLong(4, sc.nextLong());
			ps.execute();
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
