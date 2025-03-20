package utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot 
{
	public static void screenshot(WebDriver driver)
	{

	try {
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    String filename =  new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	    FileUtils.copyFile(source, new File("src/test/java/screenshots/"+"saucedemo"+"_"+filename+"evidences.png"));
	    System.out.println("ScreenShot Taken");
	} 
	catch (Exception e) 
	{
	    System.out.println("Exception while taking ScreenShot "+e.getMessage());
	}


	}
}
