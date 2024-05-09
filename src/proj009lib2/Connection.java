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
		
		Statement statement;
		statement = conn.createStatement();
		ResultSet resultSet;
		resultSet = statement.executeQuery("select * from books");
		
		// here is
		String code;
		String title;
		while(resultSet.next()) {
			System.out.println("List of books :");
			code = resultSet.getString("bookName");
			title = resultSet.getString("bookAuthor").trim();
			System.out.println("name: " + code + ";"
					+ " author: " + title + ";");
		}
		// the code
		
		resultSet.close();
		statement.close();
		conn.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}

}
	public void check() {

	}
}
