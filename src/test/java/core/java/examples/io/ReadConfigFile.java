package core.java.examples.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		try {
			String file = System.getProperty("user.dir")+"//config//testconfig.properties";
			FileInputStream stream = new FileInputStream(file);
			prop.load(stream);
			System.out.println(prop.getProperty("browser"));
			System.out.println(prop.getProperty("application.username"));
			System.out.println(prop.getProperty("application.password"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
