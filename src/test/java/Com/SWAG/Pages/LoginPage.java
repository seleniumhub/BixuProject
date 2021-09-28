package Com.SWAG.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	 WebDriver driver;
	
	 public LoginPage (WebDriver Wdriver)
	 {
		 this .driver = Wdriver;
	 }
	
	
	
	@FindBy (id="user-name") WebElement Username;
	@FindBy (id="password") WebElement Password;
	@FindBy (id="login-button") WebElement LoginButton;
	
	
	
	public void SWAGApplicationLogin( String AppUserName , String AppUserPassword)
	{
		Username.sendKeys(AppUserName);
		Password.sendKeys(AppUserPassword);
		LoginButton.click();
	}
	
	
	
	
}
