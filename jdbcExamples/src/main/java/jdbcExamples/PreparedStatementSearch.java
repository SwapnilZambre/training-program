package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementSearch {

 public static void main(String[] args) throws SQLException {
// TODO Auto-generated method stub
// 1. Load the driver
Scanner sc = new Scanner(System.in);
DriverManager.registerDriver(new com.mysql.jdbc.Driver());

 // 2. Establish the connection
String url = "jdbc:mysql://localhost:3306/jdbc";
String username = "root";
String password = "root";
Connection con = DriverManager.getConnection(url, username, password);

 // 3. create the PreparedStatement object
String sql = "select * from student where id=?";
PreparedStatement pst = con.prepareStatement(sql);

 // 4. read the values from keyboard and insert into table..
System.out.println("Enter id");
int id = sc.nextInt();
pst.setInt(1, id);
ResultSet rs = pst.executeQuery();
while(rs.next()) {
System.out.println("id: "+rs.getInt(1));
System.out.println("Name: "+rs.getString(2));
System.out.println("Branch: "+rs.getString(3));
}

// 7. close the connections
pst.close();
con.close();
DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());

}

}
