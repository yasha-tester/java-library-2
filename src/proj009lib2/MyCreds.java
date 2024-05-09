package proj009lib2;

import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;

public class MyCreds {
	
	public static String userName = "me";
	public static String pwd;
	
	public void defineCreds() {
		Properties myProps = new Properties();
		
		try {			
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
			if(inputStream != null) {
				myProps.load(inputStream);
				userName = myProps.getProperty("username");
				pwd = myProps.getProperty("password");
				inputStream.close();
			} else {
				System.err.println("Unable to find config.properties file");
			}
} catch(IOException e) {
	e.printStackTrace();
}
	}
}
