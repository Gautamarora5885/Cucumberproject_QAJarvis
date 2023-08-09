package test;

import org.openqa.selenium.WebDriver;

import baseClass.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageClass.Locators_Dashboard;
import pageClass.Locators_login;

public class Logout extends Base {
	WebDriver driver;
	
	public Locators_login xyz;
	public Locators_Dashboard pqr;
	
	@Override
	public void pageSetup()
	
	{
		this.driver= getDriver();
		this.xyz = new Locators_login(this.driver);
		this.pqr = new Locators_Dashboard(this.driver);
	}
	@Given("Browser is open")
	
	public void browserr_is_open()
	{
		System.out.println("inside:-browser is open");
	    
	}

	@And("User enter (.*) and (.*)$")
	public void user_enters_the_valid_username_password(String username , String password) throws InterruptedException {
		Thread.sleep(2000);
		xyz.Name(username);
		xyz.putPassword(password);
		
		Thread.sleep(2000);

	}

	@And("User click on login button")
	public void user_click_on_login_button1() {
		xyz.Login_Button();
		
	}
	@And("User is navigated to the home page")
	public void User_iss_navigated_to_the_home_page() throws InterruptedException
	{
		Thread.sleep(2000);
			
	}
	@And("User clicks on Profile")
	public void User_clicks_on_profile_on_top() throws InterruptedException
	{
		xyz.Profile_Button();
		Thread.sleep(2000);
		
	}
	@And("User clicks on Logout")
	public void User_clicks_on_logout_button() throws InterruptedException
	{
		xyz.Logout_Button();
		Thread.sleep(2000);
		
	}
	@Then("User is Successfully logged out")
	public void User_is_able_to_logout() throws InterruptedException
	{
		xyz.Sign_in();
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	}



