package test;

import org.openqa.selenium.WebDriver;

import baseClass.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageClass.Locators_login;
import pageClass.Milestones_Locators;

public class Milestones extends Base {
WebDriver driver;
	
	public Locators_login xyz;
	public Milestones_Locators refr ;
	
	
	@Override
	public void pageSetup()
	
	{
		this.driver= getDriver();
		this.xyz = new Locators_login(this.driver);
		this.refr = new Milestones_Locators(this.driver);
	}
	
	@Given("Chrome browser is open")
	
	public void browserr_is_open()
	{
		System.out.println("inside: Chrome browser is open");
	    
	}

	@And("User enters (.*) and (.*)$")
	public void user_enters_the_valid_username_and_password(String username , String password) throws InterruptedException {
		Thread.sleep(2000);
		xyz.Name(username);
		xyz.putPassword(password);

	}

	@And("User click on the login button")
	public void user_click_on_login_button() throws InterruptedException {
		xyz.Login_Button();
		Thread.sleep(2000);
		
	}
	@And("User navigates to the home page")
	public void User_iss_navigated_to_the_home_page() throws InterruptedException
	{
		Thread.sleep(2000);
			
	}
	@And("User Click on Milestones action")
	public void User_clicks_on_Milestones_action() throws InterruptedException
	{
		Thread.sleep(2000);
		refr.Milestones_click();
		Thread.sleep(2000);
			
	}
	@And("User clicks on Create New Milestone")
	public void User_is_navigated_to_the_home_page() throws InterruptedException
	{
		Thread.sleep(2000);
		refr.Create_New_Milestones();

			
	}
	@And("User enters Title")
	public void User_enters_Title() throws InterruptedException
	{
		Thread.sleep(2000);
		refr.Title();
			
	}
	@And("User clicks on Create")
	public void User_clicks_on_Create() throws InterruptedException
	{
		Thread.sleep(2000);
		refr.Create();
		//Thread.sleep(2000);
			
	}
	@Then("User is successfully able to create new milestone")	
	public void User_is_successfully_able_to_create_new_milestone() throws InterruptedException
	{
		Thread.sleep(2000);
		refr.sucessfully_created();
		Thread.sleep(2000);
		driver.quit();
		
			
	}

}
