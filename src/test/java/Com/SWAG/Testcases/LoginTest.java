package Com.SWAG.Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.SWAG.Pages.LoginPage;
import Com.SWAG.Utility.Baseclass;
import Com.SWAG.Utility.BrowserLaunched;
import Com.SWAG.Utility.ScreenshotClass;

public class LoginTest  extends Baseclass{
	
	

	
@Test
	public void  SwagLoginTest() throws IOException
	{
	
	 test = extent.createTest("SWag Testcases");
	LoginPage page = PageFactory.initElements(driver, LoginPage.class);
	test.info("My Application open correctly");
	//log.info("this is my log for open application");
	page.SWAGApplicationLogin(excel.ReadExcelData("Login", 0, 0), excel.ReadExcelData("Login", 0, 1));
	//log.info("excel read correctly & input correct credentials");
	
	//page.SWAGApplicationLogin(excel.ReadExcelData("Login", 0, 0), excel.ReadExcelData("Login", 0, 1));
	
	test.info("Enter correct credentials & login sucessfully");
	
	//log.info("Application login correctly");
	ScreenshotClass st= new ScreenshotClass();
	st.Screenshot(driver);
	 test.pass(" login pass");
	log.info("Application login correctly");
	}
	

	
	  @Test public void SwagLoginTest2() throws IOException {
	  
	  test = extent.createTest("SWag Testcases2"); 
	  LoginPage page=  PageFactory.initElements(driver, LoginPage.class);
	  test.info("My Application open correctly2");
	  page.SWAGApplicationLogin(excel.ReadExcelData("Login", 1, 0), excel.ReadExcelData("Login", 1, 1));
	  
	 // page.SWAGApplicationLogin(excel.ReadExcelData("Login", 0, 0),excel.ReadExcelData("Login", 0, 1));
	  
	  test.info("Enter correct credentials & login sucessfully2"); ScreenshotClass
	  st= new ScreenshotClass(); st.Screenshot(driver); 
	  test.pass(" login pass2");
	  log.info("Application login correctly2");

	  }
}
