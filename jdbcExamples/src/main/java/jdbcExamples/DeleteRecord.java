package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

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
	String sql = "delete from student where id=2";;

	 // 5. store the data in the result set
	int k = st.executeUpdate(sql);

	 // 6 . display the resultset data

System.out.println("record deleted.....");

	 // 7. close the connections
	
	st.close();
	con.close();
	DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());
	}

	}
