package proj009lib2;

public class MyLibrary {
	
	static MyCreds creds = new MyCreds();
	

	public static void main(String[] args) {
		creds.defineCreds();
		System.out.println("Hello library");
		System.out.println(creds.userName);
	}

}
