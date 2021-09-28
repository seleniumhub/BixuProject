package Com.SWAG.Utility;

import java.io.File;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Baseclass {
	public WebDriver driver;
	
	 public configDataReader configfile;
	public  ExcelReader excel;
	
	public ExtentReports extent;
	public ExtentTest test;
	public ExtentHtmlReporter report;
public	 Logger log;
	
	
	@BeforeSuite
	public void ExcelLaunched()
	{
	 configfile = new configDataReader();
	 excel = new ExcelReader();
	  report = new  ExtentHtmlReporter(new File( System.getProperty("user.dir")+"/TestReports/SwagExtentReport.html"));
	  extent = new ExtentReports();
	 extent.attachReporter(report);
	 
	 log =  Logger.getLogger("swaglogreport");
	 PropertyConfigurator.configure("D:\\SeleniumZoomsClasses\\SeleniumDemo\\BixuHybridFramework\\config\\log4j.properties");
	
	}
	
	@BeforeClass
	public void Browseropen()
	{
	 driver =BrowserLaunched.BrowerStart(driver, configfile.prop.getProperty("BrowserName"), configfile.prop.getProperty("URl"));
	}
	
	
	
	public void Browserclosed()
	{
		BrowserLaunched.CloseBrowser(driver);
		
	}
	
	@AfterMethod
	public void Closetestcases()
	{
		extent.flush();
		
	}
	

}
