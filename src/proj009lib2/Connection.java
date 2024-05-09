package proj009lib2;

import java.sql.*;


public class Connection {

	static MyCreds creds = new MyCreds();

	public void connect() {
		Connection connection = null;
		
	try {
//		String strUserName = MyCreds.userName.toString();
//		String strPwd = MyCreds.pwd.toString();
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryDb", MyCreds.userName, MyCreds.pwd);
		System.out.println("connected");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
