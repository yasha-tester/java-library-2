# java library


First of all in order for it to work you should add config.properties files with fields "username" and "password" your src folder.

Current error/bug on my machine is:

<code>java.sql.SQLException: Access denied for user 'me'@'localhost' (using password: NO)
	at mysql.connector.j@8.3.0/com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:130)
	at mysql.connector.j@8.3.0/com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:122)
	at mysql.connector.j@8.3.0/com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:815)
	at mysql.connector.j@8.3.0/com.mysql.cj.jdbc.ConnectionImpl.<init>(ConnectionImpl.java:438)
	at mysql.connector.j@8.3.0/com.mysql.cj.jdbc.ConnectionImpl.getInstance(ConnectionImpl.java:241)
	at mysql.connector.j@8.3.0/com.mysql.cj.jdbc.NonRegisteringDriver.connect(NonRegisteringDriver.java:189)
	at java.sql/java.sql.DriverManager.getConnection(DriverManager.java:681)
	at java.sql/java.sql.DriverManager.getConnection(DriverManager.java:229)
	at proj009lib2/proj009lib2.Connection.connect(Connection.java:17)
	at proj009lib2/proj009lib2.MyLibrary.main(MyLibrary.java:10)</code>