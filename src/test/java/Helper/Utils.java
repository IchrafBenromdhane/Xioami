package Helper;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Utils {
	
	public static  String getproprety(String property) throws Exception {
		InputStream input = new FileInputStream("src/test/resources/Properties/PropertiesXiaomi");
		Properties properties = new Properties();
		properties.load(input);
		
		return(properties.getProperty(property));
	}


}
