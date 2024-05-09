package proj009lib2;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class MyCreds {
	
	public static String userName = "me";
	public static String pwd;

	public void defineCreds() {
		String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String configPath = rootPath + "config.properties";
		Properties myProps = new Properties();
		
		try {
		myProps.load(new FileInputStream(configPath));
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		userName = myProps.getProperty("username");
		pwd = myProps.getProperty("password");
		
		
	}
}
