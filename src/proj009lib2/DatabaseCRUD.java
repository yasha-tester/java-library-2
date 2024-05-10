package proj009lib2;

import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseCRUD {
	Connection connection = new Connection();
	
	public void dbBookAdd(String nameValue, String authorValue) {
		
		// it opens and then also closes connection
		connection.connect();
		
		Statement statement;
		ResultSet resultSet;
		try {
		statement = (Statement) connection.conn.createStatement();
		resultSet = statement.executeQuery("select * from books;");
		//
		System.out.println("test book add list (books aren't added here yet)");
		System.out.println(nameValue);
		System.out.println(authorValue);
		
		String bookNameStr;
		String titleStr;
		while(resultSet.next()) {
			System.out.println("List of books :");
			bookNameStr = resultSet.getString("bookName");
			titleStr = resultSet.getString("bookAuthor").trim();
			System.out.println("name: " + bookNameStr + ";"
					+ " author: " + titleStr + ";");
		}
		//
		} catch (Exception e) {
			e.printStackTrace();
		}
		connection.closeConnection();
		}
	
}
