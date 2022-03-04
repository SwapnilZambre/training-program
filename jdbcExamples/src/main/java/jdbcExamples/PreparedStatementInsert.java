package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementInsert {

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
String sql = "insert into student values (?,?,?)";
PreparedStatement pst = con.prepareStatement(sql);

 // 4. read the values from keyboard and insert into table..
System.out.println("Enter id");
int id = sc.nextInt();
System.out.println("Enter name");
String name = sc.next();
System.out.println("Enter branch");
String branch = sc.next();
pst.setInt(1, id);
pst.setString(2, name);
pst.setString(3, branch);
pst.executeUpdate();
System.out.println("Record Inserted...");
// 7. close the connections
pst.close();
con.close();
DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());

}

}
