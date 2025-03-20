package utility;


import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserDriver 
{
	
	public static WebDriver driver;
	public void getwebdriver() throws IOException, ParseException
	{
		TestData testData=JsonFileReader.readTestData("src/test/java/resources/testdata.json");	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(testData.getpageurl());
		driver.manage().window().maximize();
		
	}
	
}
