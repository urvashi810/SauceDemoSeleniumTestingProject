package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import utility.BrowserDriver;
import utility.JsonFileReader;
import utility.Screenshot;
import utility.TestData;



public class ItemCartCheckout extends BrowserDriver
{
	public static String placing_product_cart1="//button[@name='add-to-cart-sauce-labs-backpack']";
	public static String placing_product_cart2="//button[@name='add-to-cart-sauce-labs-bike-light']";
	public static String placing_product_cart3="//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']";
	public static String click_cart="//a[@class='shopping_cart_link']";
	public static String checkout="//button[@name='checkout']";
	public static String enter_name_detail="//input[@id='first-name']";
	public static String last_name_detail="//input[@id='last-name']";
	public static String postal_code="//input[@id='postal-code']";
	public static String proceed_further="//input[@name='continue']";
	public static String finish_btn="//button[@name='finish']";
	public static String back_to_home="//button[@name='back-to-products']";
	public static String click_hamburgermenu="//button[@id='react-burger-menu-btn']";
	public static String click_logout="//a[@id='logout_sidebar_link']";
	public static String click_remove="//button[@id='remove-sauce-labs-backpack']";
	public static String continue_shopping="//button[@name='continue-shopping']";
	
	public static void select_three_items() throws InterruptedException
	{
		driver.findElement(By.xpath(placing_product_cart1)).click();
		Thread.sleep(1500);
		Screenshot.screenshot(driver);
		driver.findElement(By.xpath(placing_product_cart2)).click();
		Thread.sleep(1500);
		Screenshot.screenshot(driver);
		driver.findElement(By.xpath(placing_product_cart3)).click();
		Thread.sleep(1500);
		Screenshot.screenshot(driver);
	}
		
	public static void click_on_cart()
	{
		driver.findElement(By.xpath(click_cart)).click();
		Screenshot.screenshot(driver);
	}
	
	public static void click_on_checkout() throws InterruptedException
	{
		driver.findElement(By.xpath(checkout)).click();
		Thread.sleep(1500);
		Screenshot.screenshot(driver);
	}
	public static void complete_the_checkout() throws IOException, InterruptedException
	{
		TestData testData=JsonFileReader.readTestData("src/test/java/resources/testdata.json");	
		driver.findElement(By.xpath(enter_name_detail)).sendKeys(testData.getFirstname());
		Thread.sleep(1500);
		Screenshot.screenshot(driver);
		driver.findElement(By.xpath(last_name_detail)).sendKeys(testData.getLastname());
		Thread.sleep(1500);
		Screenshot.screenshot(driver);
		driver.findElement(By.xpath(postal_code)).sendKeys(testData.getPostalcode());
		Thread.sleep(1500);
		Screenshot.screenshot(driver);
		driver.findElement(By.xpath(proceed_further)).click();
		Thread.sleep(1500);
		Screenshot.screenshot(driver);
		driver.findElement(By.xpath(finish_btn)).click();
		Thread.sleep(1500);
		Screenshot.screenshot(driver);
	}
	
	public static void back_to_homescreen() throws InterruptedException
	{
		driver.findElement(By.xpath(back_to_home)).click();
		Thread.sleep(1500);
		Screenshot.screenshot(driver);
	}
	
	public static void add_remove_product_from_cart() throws InterruptedException
	{
		driver.findElement(By.xpath(placing_product_cart1)).click();
		Thread.sleep(1500);
		Screenshot.screenshot(driver);
		driver.findElement(By.xpath(click_cart)).click();
		Thread.sleep(1500);
		Screenshot.screenshot(driver);
		driver.findElement(By.xpath(click_remove)).click();
		Thread.sleep(1500);
		Screenshot.screenshot(driver);
		driver.findElement(By.xpath(continue_shopping)).click();
		Thread.sleep(1500);
		Screenshot.screenshot(driver);
		
	}
	
	public static void logout_from_application() throws InterruptedException
	{
		driver.findElement(By.xpath(click_hamburgermenu)).click();
		Thread.sleep(1500);
		Screenshot.screenshot(driver);
		driver.findElement(By.xpath(click_logout)).click();
		Thread.sleep(1500);
		Screenshot.screenshot(driver);
	}
	
	
}
