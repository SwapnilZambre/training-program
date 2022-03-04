package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	 public static void main(String[] args) throws SQLException {
	// TODO Auto-generated method s

	 // 1. Load the driver

	 DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

	 // 2. Establish the connection
	String url = "jdbc:mysql://localhost:3306/jdbc";
	String username = "root";
	String password = "root";
	Connection con = DriverManager.getConnection(url, username, password);

	 // 3. create the statement object

	 Statement st = con.createStatement();

	 // 4. write the query and execute it
	String sql = "insert into student values(3,'pratik','eee')";

	 // 5. store the data in the result set
	int k = st.executeUpdate(sql);

	 // 6 . display the resultset data
	System.out.println("values Inserted....");

	 // 7. close the connections
	//rs.close();
	st.close();
	con.close();
	DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());
	}

	}