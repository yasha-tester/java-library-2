package proj009lib2;

public class MyLibrary {
	
	static MyCreds creds = new MyCreds();
	static Connection con = new Connection();
	static DatabaseCRUD crud = new DatabaseCRUD();
	

	public static void main(String[] args) {
		creds.defineCreds();
		System.out.println("Hello library!");
		System.out.println("Name of the user is: " + MyCreds.userName);
		System.out.println("/");
		System.out.println("/");
		crud.showBooks();

		System.out.println("/");
//		con.connect();
		crud.dbBookAdd("testName", "testAuthor");


	}

}
