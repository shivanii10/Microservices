package jdbc;

import java.sql.*;

public class UpdateData {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/fisglobal";

		String username = "root";
		String password = "root";

		
		
		Connection con = DriverManager.getConnection(url, username, password);

		Statement st = con.createStatement();
		
		
		//Update Data
		String update = "update employee set id=111 where name='sanjay'";
		int count= st.executeUpdate(update);
		System.out.println(count+" record Updated...");
		
		//Show Data 
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