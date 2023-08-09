package pageClass;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Milestones_Locators {
	WebDriver driver;
	
	By Milestones = By.cssSelector(".enabled.left-nav > li:nth-of-type(2) > a");
	By Create_New_Milestone = By.cssSelector(".btn.btn-primary");	
	By Title = By.cssSelector("textarea#title");
	By Create = By.cssSelector(".btn.btn-primary.mrgnfix.pull-right");		
	By Popup = By.cssSelector(".notify-message .ng-binding");		
public Milestones_Locators(WebDriver ref1)  

{
		driver = ref1;	
}				
		
public void Milestones_click()
{
	
	driver.findElement(Milestones).click();
}

public void Create_New_Milestones()
{
	
	driver.findElement(Create_New_Milestone).click();
}

public void Title()
{
	
driver.findElement(Title).sendKeys("Demo00"+Integer.toString(new Random().nextInt(3))+1);
}
			
public void Create()
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,800)");
	driver.findElement(Create).click();
}

public void sucessfully_created()
{
	String abc=  driver.findElement(Popup).getText();
	
     assertEquals(abc, "Milestone has been created successfully.");
}
}

