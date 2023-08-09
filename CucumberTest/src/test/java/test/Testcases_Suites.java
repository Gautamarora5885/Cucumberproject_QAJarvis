//package test;
//
//import org.openqa.selenium.WebDriver;
//
//import baseClass.Base;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import pageClass.Locators_Dashboard;
//import pageClass.Locators_TestSuites_Cases;
//import pageClass.Locators_login;
//
//public class Testcases_Suites extends Base{
//	WebDriver driver;
//	
//	public Locators_login xyz;
//	public Locators_TestSuites_Cases abc;
//	public Locators_Dashboard pqr;
//	
//	@Override
//	public void pageSetup()
//	
//	{
//		this.driver= getDriver();
//		this.xyz = new Locators_login(this.driver);
//		this.abc = new Locators_TestSuites_Cases(this.driver);
//		this.pqr = new Locators_Dashboard(this.driver);
//	}
//	@Given("browser is open")
//	
//	public void browser_is_open()
//	{
//		System.out.println("inside:-browser is open");
//	    
//	}
//
//	@And("user enter (.*) and (.*)$")
//	public void user_enter_the_valid_username_password(String username , String password) {
//		
//		xyz.Name(username);
//		xyz.putPassword(password);
//
//	}
//
//	@And("user click on login button")
//	public void user_click_on_login_button()
//	{
//		xyz.Login_Button();
//		
//	}
//
//	@And("User is navigated to the home pagee")
//	public void User_is_navigated_to_the_home_page_11() throws InterruptedException
//	{
//		Thread.sleep(2000);
//		System.out.println("a");
//	}
//	
//	@And("User clickss on the Test Suites & Cases module")
//	public void user_clicks_on_the_test_suites_cases_module() throws InterruptedException {
//		
//		Thread.sleep(2000);
//		abc.Test_Suite_Boxxx();
//		Thread.sleep(2000);
//		
//	}
//	
//	@Then("User is able to view test suite list")
//	public void user_is_able_to_view_test_suite_list() throws InterruptedException {
//		abc.Test_suite_text_header();
//		Thread.sleep(3000);
//		driver.close();
//		
//	}
//	
//}
