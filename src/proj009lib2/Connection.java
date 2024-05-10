package proj009lib2;

import java.sql.*;


public class Connection {

	static MyCreds creds = new MyCreds();

	public java.sql.Connection conn = null;
	// opens a connection
	public void connect() {
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryDb", MyCreds.userName, MyCreds.pwd);
		System.out.println("connected");
		System.out.println("/");
		/*
		 *  conn.close();
		 */
		
	} catch (Exception e) {
		e.printStackTrace();
	}

}
	// closes a connection
	public void closeConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryDb", MyCreds.userName, MyCreds.pwd);
			conn.close();
			System.out.println("/");

			System.out.println("disconnected");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
