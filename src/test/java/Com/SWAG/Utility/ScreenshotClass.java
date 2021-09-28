package Com.SWAG.Utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotClass {
	
	
	public static void Screenshot( WebDriver driver) throws IOException 
	{
		DateFormat date1= new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date date = new Date();
		
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File Srcfile = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Srcfile, new File ("./ScreenShot/SwagApplicationScrrenshot" +date1.format(date)+".png"));
		
		
		
	}

}
