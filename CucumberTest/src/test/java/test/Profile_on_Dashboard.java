package test;

import org.openqa.selenium.WebDriver;

import baseClass.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageClass.Locators_Dashboard;
import pageClass.Locators_login;

public class Profile_on_Dashboard extends Base {
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
	
	@Given("Browser is open chrome")
	
	public void browserr_is_open()
	{
		System.out.println("inside1:-browser is open");
	    
	}

	@And("Usser enter (.*) and (.*)$")
	public void user_enters_the_valid_username_password(String username , String password) throws InterruptedException {
		Thread.sleep(2000);
		xyz.Name(username);
		xyz.putPassword(password);
		
		Thread.sleep(2000);

	}

	@And("Usser click on login button")
	public void user_click_on_login_button1() {
		xyz.Login_Button();
		
	}
	@And("Usser is navigated to the home page")
	public void User_iss_navigated_to_the_home_page() throws InterruptedException
	{
		Thread.sleep(2000);
			
	}
	@And("Usser clicks on Profile")
	public void User_clicks_on_profile_on_top() throws InterruptedException
	{
		xyz.Profile_Button();
		Thread.sleep(2000);
	}
	@And("Usser clicks on View_Profile")
	public void User_clicks_on_view_profile() throws InterruptedException
	{
		pqr.View_profile();
		Thread.sleep(2000);
		
	}
	@Then("Usser clicks on Timezone")
	public void User_clicks_on_Timezone() throws InterruptedException
	{
		pqr.Timezone();
		Thread.sleep(2000);
		
	}
}
