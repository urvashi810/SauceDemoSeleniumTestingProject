package stepDefinition;
import static pages.LoginPage.*;
import static pages.ItemCartCheckout.*;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.BrowserDriver;




public class LoginPage_glue extends BrowserDriver
{
@Before
public void openBrowser() throws IOException, ParseException
{
	BrowserDriver bdriver=new BrowserDriver();
	bdriver.getwebdriver();
}

	
	@Given("^Login as Standard user with (.*) and (.*)$")
	public void login_to_the_home_page_standard(String uname,String pwd) throws InterruptedException, IOException, ParseException
	{
		login_username_password_standard(uname, pwd);
		click_login();
			
	}
	
	@Given("^Login as performance user with (.*) and (.*)$")
	public void login_to_the_home_page_performance(String uname,String pwd) throws InterruptedException, IOException, ParseException
	{
		login_username_password_performance(uname, pwd);
		click_login();
			
	}

	
	@And("^Place the three items in the cart")
	public void selectitems() throws InterruptedException
	{
		select_three_items();
			
	}
	
	@When("^click on the cart icon$")
	public void clickcart()
	{
		click_on_cart();
			
	}
	
	@And("^verify the items and click on checkout button$")
	public void click_checkout() throws InterruptedException
	{
		click_on_checkout();
			
	}
	
	@And("^provide the details and click on Finish to complete$")
	public void complete_checkout() throws IOException, InterruptedException
	{
			complete_the_checkout();
	}
	
	@Then("^continue to home screen$")
	public void back_home_screen() throws InterruptedException
	{
		back_to_homescreen();
			
	}
	
	@And("^Add the product to the cart and remove the product from the cart$")
	public void add_remove() throws InterruptedException
	{
		add_remove_product_from_cart();
			
	}
	
	@And("^Logout from the application as the standard user$")
	public void logout() throws InterruptedException
	{
		logout_from_application();
			
	}
	
	@After
	public void closeBrowser() throws IOException, ParseException
	{
		driver.close();
	}
	
	
	
}
