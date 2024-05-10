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
		System.out.println("user " + MyCreds.userName + " is connected");
		
		Statement statement;
		statement = conn.createStatement();
		ResultSet resultSet;
		resultSet = statement.executeQuery("select * from books");
		
		// here is
		String bookNameStr;
		String titleStr;
		while(resultSet.next()) {
			System.out.println("List of books :");
			bookNameStr = resultSet.getString("bookName");
			titleStr = resultSet.getString("bookAuthor").trim();
			System.out.println("name: " + bookNameStr + ";"
					+ " author: " + titleStr + ";");
		}
		// the code
		resultSet.close(); 
		statement.close();
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
			System.out.println("user " + MyCreds.userName + " is disconnected");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
