package Com.SWAG.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configDataReader {
	
	Properties prop;
	
	public configDataReader()
	{
		 prop = new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream ("./config/swag.properties");
		
			prop.load(file);
		} catch (Exception e) {
			System.out.println(" Error while loading Config File>>" + e.getMessage());
		}
		
	}
	
	
	
	
	public String EnterURL()
	{
		return prop.getProperty("URl");
		
	}
	
	
	public String EnterBrowserName()
	{
		return prop.getProperty("BrowserName");
		
	}
	

}
