package pageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators_login{
	
	WebDriver driver;
	
	By Username = By.xpath("/html//input[@id='username_id']");
	By Password = By.cssSelector("input#password_id");
	By Login = By.cssSelector("input[value='Login']");
	By Profile = By.cssSelector(".hidden-xs.logged-in-username.ng-binding");
	By Logout= By.cssSelector("ul[role='menu'] > li:nth-of-type(3) > a");
	By Sign_in_to_account = By.cssSelector("form#signin-form_id  span");

	public Locators_login(WebDriver ref)   //Made constructor and passed reference variable
	{
		driver = ref;	// ref  is the reference which is taking the value of driver_2
		
	}
	
	public void Name(String a)
	{
		driver.findElement(Username).sendKeys(a);
		
	}
	
	public void putPassword(String b)
	
	{
		driver.findElement(Password).sendKeys(b);
		
	}
	public void Login_Button()
	{
		driver.findElement(Login).click();
		
	}
	public void Profile_Button()
	{
		driver.findElement(Profile).click();
		
	}
	public void Logout_Button()
	{
		driver.findElement(Logout).click();
		
	}
	public void Sign_in()
	{
		driver.findElement(Sign_in_to_account).isDisplayed();
		
	}
}
