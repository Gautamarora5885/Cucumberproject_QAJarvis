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
//public class Dashboard_Home_page extends Base{
//	
//		WebDriver driver;
//		
//		public Locators_login xyz;
//		public Locators_TestSuites_Cases abc;
//		public Locators_Dashboard pqr;
//		
//		@Override
//		public void pageSetup()
//		
//		{
//			this.driver= getDriver();
//			this.xyz = new Locators_login(this.driver);
//			this.abc = new Locators_TestSuites_Cases(this.driver);
//			this.pqr = new Locators_Dashboard(this.driver);
//		}
//		@Given("Browser is open")
//		
//		public void browser_is_open()
//		{
//			System.out.println("inside:-browser is open");
//		    
//		}
//
//		@And("Userr enter (.*) and (.*)$")
//		public void user_enter_the_valid_username_password(String username , String password) {
//			
//			xyz.Name(username);
//			xyz.putPassword(password);
//
//		}
//
//		@And("User click on login buttonn")
//		public void user_click_on_login_button()
//		{
//			xyz.Login_Button();
//			
//		}
//
//		@Then("User navigates to the home pagee")
//		public void User_is_navigated_to_the_home_page_11() throws InterruptedException
//		{
//			Thread.sleep(2000);
//			System.out.println("a");
//		}
//	}
