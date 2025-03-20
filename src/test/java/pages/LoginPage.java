package pages;


import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;


import utility.BrowserDriver;
import utility.TestData;
import utility.JsonFileReader;
import utility.Screenshot;

public class LoginPage extends BrowserDriver
{
	
	
	public static String username_textbox="//input[@id='user-name']";
	public static String password_texbox="//input[@id='password']";
	public static String login_btn="//input[@id='login-button']";
	
	public static void login_username_password_standard(String uname, String pwd)throws InterruptedException, IOException, ParseException
	{	
			TestData testData=JsonFileReader.readTestData("src/test/java/resources/testdata.json");	
			driver.findElement(By.xpath(username_textbox)).sendKeys(testData.getstandard_username());
			Thread.sleep(1500);
			Screenshot.screenshot(driver);
			driver.findElement(By.xpath(password_texbox)).sendKeys(testData.getPassword());
			Thread.sleep(1500);
			Screenshot.screenshot(driver);
	}
	
	public static void login_username_password_performance(String uname, String pwd)throws InterruptedException, IOException, ParseException
	{	
			TestData testData=JsonFileReader.readTestData("src/test/java/resources/testdata.json");	
			driver.findElement(By.xpath(username_textbox)).sendKeys(testData.getperformance_username());
			Thread.sleep(1500);
			Screenshot.screenshot(driver);
			driver.findElement(By.xpath(password_texbox)).sendKeys(testData.getPassword());
			Thread.sleep(1500);
			Screenshot.screenshot(driver);
	}
		

	public static void click_login()throws InterruptedException
	{
		driver.findElement(By.xpath(login_btn)).click();
		Thread.sleep(1500);
		Screenshot.screenshot(driver);
		
		
	}
}

