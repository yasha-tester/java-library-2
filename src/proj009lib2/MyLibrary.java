package proj009lib2;

public class MyLibrary {
	
	static MyCreds creds = new MyCreds();
	static Connection con = new Connection();
	

	public static void main(String[] args) {
		con.connect();
		creds.defineCreds();
		System.out.println("Hello library");
		System.out.println(MyCreds.userName);
	}

}
