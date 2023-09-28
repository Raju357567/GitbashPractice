package gitbashPractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class WriteDataIntoPropertyFile {

	public static void main(String[] args) throws Throwable {
		
		Properties pobj=new Properties();
		//writing data into properties file
		pobj.setProperty("Browser", "Chrome");
		pobj.setProperty("Username", "admin");
		pobj.setProperty("Password", "password");
		//Opening file into java writable format
		FileOutputStream fos=new FileOutputStream("./src/test/resources/CommonData.properties");
		//Storing data into file
		pobj.store(fos, "Property File data");
	}
}
