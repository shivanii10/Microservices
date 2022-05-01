package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicUpdate {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/fisglobal";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);
	
		//To show data 
		System.out.println("Table Data");
		String show = "select * from employee";
		//ExecuteQuery is only used for SELECT command.
	    Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(show);
		while (rs.next())
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		rs.close();		
		
		
		//Inserting Data Dynamically
		//Prepared statement is used for dynamic operations
		String update = "update employee set name=? where id=?";
		PreparedStatement pst = con.prepareStatement(update);
		
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Enter updated name: ");
		String name = sc.next();
		
		pst.setString(1, name);
		pst.setInt(2, id);
		
		int count= pst.executeUpdate();
		System.out.println(count+" record updated...");
		
		
		st.close();
		pst.close();
		con.close();

	}

}