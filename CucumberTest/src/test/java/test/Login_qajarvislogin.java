//package test;
//
//import org.openqa.selenium.WebDriver;
//
//import pageClass.Locators_Dashboard;
//import pageClass.Locators_login;
//import baseClass.Base;
//import io.cucumber.java.en.*;
//
//public class Login_qajarvislogin extends Base {
//	
//	WebDriver driver;
//	
//	public Locators_login xyz;
//	public Locators_Dashboard pqr;
//	
//	@Override
//	public void pageSetup()
//	
//	{
//		this.driver= getDriver();
//		this.xyz = new Locators_login(this.driver);
//		this.pqr = new Locators_Dashboard(this.driver);
//	}
//	@Given("browserr is open")
//	
//	public void browserr_is_open()
//	{
//		System.out.println("a");
//		System.out.println("inside:-browser is open");
//	    
//	}
//
//	@And("user enters (.*) and (.*)$")
//	public void user_enterss_the_valid_username_password(String username , String password) {
//		
//		xyz.Name(username);
//		xyz.putPassword(password);
//		System.out.println("a");
//
//	}
//
//	@And("userr click on login button")
//	public void user_click_on_login_button1() {
//		xyz.Login_Button();
//		System.out.println("a");
//		
//	}
//	@Then("Userr is navigated to the home page")
//	public void User_iss_navigated_to_the_home_page() throws InterruptedException
//	{
//		Thread.sleep(5000);
//		driver.close();
//		System.out.println("a");
//		
//	}
//	}


