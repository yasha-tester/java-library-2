package proj009lib2;

import java.sql.*;


public class Connection {

	static MyCreds creds = new MyCreds();

	private static java.sql.Connection conn = null;
	public void connect() {
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryDb", MyCreds.userName, MyCreds.pwd);
		System.out.println("user " + MyCreds.userName + " is connected");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
