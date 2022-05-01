package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicInsert {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/fisglobal";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);
	
		//Inserting Data Dynamically
		//Prepared statement is used for dynamic operations
		String insert = "insert into employee values(?,?);";
		PreparedStatement pst = con.prepareStatement(insert);
		
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Enter name: ");
		String name = sc.next();
		
		pst.setInt(1, id);
		pst.setString(2, name);
		
		int count= pst.executeUpdate();
		System.out.println(count+" record Inserted...");
		
		//To show data 
		System.out.println("Table Data");
		String show = "select * from employee";
		//ExecuteQuery is only used for SELECT command.
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(show);
		while (rs.next())
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		rs.close();
		
		st.close();
		pst.close();
		con.close();

	}

}