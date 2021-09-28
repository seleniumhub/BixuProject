package Com.SWAG.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunched {
	
 WebDriver driver;
	
	public  static  WebDriver BrowerStart ( WebDriver driver, String BrowserName, String Url)
	{
		
		if(BrowserName.equalsIgnoreCase("Chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		
			
		}
		
		else if (BrowserName.equalsIgnoreCase("Firefox"))
        {
        	System.setProperty("webdriver.gego.driver", "./Drivers/gegodriver.exe");
			 driver = new FirefoxDriver();
        	
                     }
        
        
        else if (BrowserName.equalsIgnoreCase("IE"))
        {
        	System.setProperty("webdriver.InternetExplorer.driver", "./Drivers/InternetExplorerDriver.exe");
			 driver = new InternetExplorerDriver();
                     }
        
        driver.get(Url);
        
        driver.manage().window().maximize();
        return driver;
                
                
	}
	
	
	public static void CloseBrowser(WebDriver driver)
	{
		driver.close();
	}

}
