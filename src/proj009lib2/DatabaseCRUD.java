package proj009lib2;

import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseCRUD {
	static Connection connection = new Connection();
	static MyCreds creds = new MyCreds();
	
	// create books
	public void dbBookAdd(String nameValue, String authorValue) {
		// it opens and then also closes connection
		
		creds.defineCreds();
		
		Statement statement;
		ResultSet resultSet;
		try {
			connection.connect();
		statement = (Statement) connection.conn.createStatement();
		
//		statement.executeQuery("INSERT INTO books (bookName, bookAuthor) VALUES(\"" + nameValue + "\", \"" + authorValue + "\");");
		statement.executeUpdate("INSERT INTO books(bookName, bookAuthor) VALUES(\"title\", \"author\");");
//		resultSet = statement.executeQuery("select * from books;");
		//
		System.out.println("(test) Added book:");
		System.out.println(nameValue);
		System.out.println(authorValue);
		//
		} catch (Exception e) {
			e.printStackTrace();
		}
		connection.closeConnection();
		}
	//
	// read books
	public void showBooks() {
		
		creds.defineCreds();
		
		Statement statement;
		ResultSet resultSet;
		try {
			connection.connect();
		statement = (Statement) connection.conn.createStatement();
		resultSet = statement.executeQuery("select * from books;");
		String bookNameStr;
		String titleStr;
                
                System.out.println("List of books:");
                
		while(resultSet.next()) {
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
	
	// update book
	public void dbBookEdit(String nameValue, String authorValue, String editedTitle, String editedAuthor) {
            
		creds.defineCreds();
		
		Statement statement;
		ResultSet resultSet;
		try {
			connection.connect();
		statement = (Statement) connection.conn.createStatement(); 
		String preparedStatement = "UPDATE books SET bookName = \"" + editedTitle + "\", bookAuthor = \"" + editedAuthor + "\" WHERE bookName = \"" + nameValue + "\" AND bookAuthor = \"" + authorValue + "\";";
//		statement.executeQuery("INSERT INTO books (bookName, bookAuthor) VALUES(\"" + nameValue + "\", \"" + authorValue + "\");");
//		statement.executeUpdate("UPDATE books SET bookName = \"Hard test\", bookAuthor = \"Hard test\" WHERE bookName = \"title\" AND bookAuthor = \"author\";");
//		resultSet = statement.executeQuery("select * from books;");
		statement.executeUpdate(preparedStatement);
		//
		System.out.println("(test) Edited book:");
		System.out.println(nameValue);
		System.out.println(authorValue);
		//
		} catch (Exception e) {
			e.printStackTrace();
		}
		connection.closeConnection();
	}
	
	// delete book
	public void dbBookRemove(String nameValue, String authorValue) {
		
            creds.defineCreds();
		
		Statement statement;
		ResultSet resultSet;
		try {
			connection.connect();
		statement = (Statement) connection.conn.createStatement();
		
//		statement.executeQuery("INSERT INTO books (bookName, bookAuthor) VALUES(\"" + nameValue + "\", \"" + authorValue + "\");");
		statement.executeUpdate("DELETE FROM books WHERE bookName = \"" + nameValue + "\" AND bookAuthor = \"" + authorValue + "\";");
//		resultSet = statement.executeQuery("select * from books;");
		//
		System.out.println("(test) Deleted book:");
		System.out.println(nameValue);
		System.out.println(authorValue);
		//
		} catch (Exception e) {
			e.printStackTrace();
		}
		connection.closeConnection();
	}
}
