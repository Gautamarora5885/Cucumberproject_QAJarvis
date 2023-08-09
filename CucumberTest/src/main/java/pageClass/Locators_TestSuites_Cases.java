package pageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Locators_TestSuites_Cases  {
	WebDriver driver;
	
	By Test_Suite_Box=By.xpath("//a[@href='#/project/2/testsuite/testsuites']");
	By Test_Suite_text = By.xpath("(//h3[@class='box-title'])[1]");
	
	public Locators_TestSuites_Cases(WebDriver ref1)   //Made constructor and passed reference variable
	{
		driver = ref1;	// ref1  is the reference which is taking the value of driver_2
		
	}
	public void Test_Suite_Boxxx() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(Test_Suite_Box).click();
	}
	public void Test_suite_text_header()
	{
		driver.findElement(Test_Suite_text).isDisplayed();
	}
}
