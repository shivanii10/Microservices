package jdbc;

import java.sql.*;

public class InsertData {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/fisglobal";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);

		Statement st = con.createStatement();
		
		
		//Insert Data
		String insert = "insert into employee values (106, 'raina');";
		int count= st.executeUpdate(insert);
		System.out.println(count+" record Inserted...");
		
		//To show data 
		System.out.println("Table Data");
		String show = "select * from employee";
		//ExecuteQuery is only used for SELECT command.
		ResultSet rs = st.executeQuery(show);
		while (rs.next())
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		rs.close();
		
		st.close();
		con.close();

	}

}